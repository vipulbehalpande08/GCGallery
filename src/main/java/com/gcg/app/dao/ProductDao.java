package com.gcg.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Product;

@Transactional
@Mapper
public interface ProductDao {
	public int addProduct (Product product);
	public Product getProductByCategoryId(int catId);
	public int updateProduct (Product product);
	public void removeProductById(int productId);
	public List<Product> getAllProduct();
}
