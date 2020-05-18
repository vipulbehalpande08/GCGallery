package com.gcg.app.serviceImplementation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcg.app.beans.Product;
import com.gcg.app.beans.Message;
import com.gcg.app.beans.StatusCode;
import com.gcg.app.dao.ProductDao;
import com.gcg.app.service.ProductService;

@Service
//@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public Message addProduct(Product product) {
		// TODO Auto-generated method stub
		int isSuccess = 0;
		Message msg = new Message();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			isSuccess = productDao.addProduct(product);
			if(isSuccess > 0){
				sqlSession.commit();
				msg.setStatusCode(StatusCode.E201);
				msg.setStatusMessage(StatusCode.S201.value);
				msg.setId(product.getProductId());
				return msg;
			}else{
				sqlSession.rollback();
				msg.setStatusCode(StatusCode.E202);
				msg.setStatusMessage(StatusCode.E202.value);
				return msg;
			}
		}catch(Exception e){
			e.printStackTrace();
			if(sqlSession != null){
				sqlSession.rollback();
			}
			msg.setStatusCode(StatusCode.E202);
			msg.setStatusMessage(StatusCode.E202.value);
		}finally{
			if(sqlSession != null)
				sqlSession.close();
		}
		return msg;
	}

	@Override
	public Message updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
		Message msg = new Message();
		return msg;
	}

	@Override
	public Product getProductByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategoryId(categoryId);
	}
	@Override
	public void removeProductById(int productId) {
		// TODO Auto-generated method stub
		productDao.removeProductById(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}
}
