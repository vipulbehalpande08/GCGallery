package com.gcg.app.serviceImplementation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Category;
import com.gcg.app.beans.Message;
import com.gcg.app.beans.StatusCode;
import com.gcg.app.dao.CategoryDao;
import com.gcg.app.service.CategoryService;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
	}

	@Override
	public Message addCategory(Category category) {
		// TODO Auto-generated method stub
		int isSuccess = 0;
		Message msg = new Message();
		SqlSession session = sqlSessionFactory.openSession();
		try{
				
			isSuccess = categoryDao.addCategory(category);
			if(isSuccess > 0){
				session.commit();
				msg.setStatusCode(StatusCode.E201);
				msg.setStatusMessage(StatusCode.S201.value);
				return msg;
			}else{
				session.rollback();
				msg.setStatusCode(StatusCode.E202);
				msg.setStatusMessage(StatusCode.E202.value);
				return msg;
			}
		}catch(Exception e){
			e.printStackTrace();
			if(session != null){
				session.rollback();
			}
			msg.setStatusCode(StatusCode.E202);
			msg.setStatusMessage(StatusCode.E202.value);
		}finally{
			if(session != null){
				session.close();
			}
		}
		return msg;
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		 categoryDao.updateCategory(category);
	}

	@Override
	public void removeCategory(int categoryId) {
		categoryDao.removeCategory(categoryId);
		
	}

}
