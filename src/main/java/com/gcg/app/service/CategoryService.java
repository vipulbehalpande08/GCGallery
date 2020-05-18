package com.gcg.app.service;

import java.util.List;

import com.gcg.app.beans.Category;
import com.gcg.app.beans.Message;

public interface CategoryService {
	public List<Category> getAllCategories();
	public Message addCategory(Category category);
	public void removeCategory(int categoryId);
	public void updateCategory(Category category);
}
