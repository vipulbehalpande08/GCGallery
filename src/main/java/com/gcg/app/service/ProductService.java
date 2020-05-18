package com.gcg.app.service;

import com.gcg.app.beans.Product;

import java.util.List;

import com.gcg.app.beans.Message;

public interface ProductService {

	public Message addProduct(Product product);
	public Message updateProduct(Product product);
	public Product getProductByCategoryId(int categoryId);
	public void removeProductById(int productId);
	public List<Product> getAllProduct();
}

