package com.gcg.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Category;

@Transactional
@Mapper
public interface CategoryDao {
	public void removeCategory(int categoryId);
	public List<Category> getAllCategories();
	public int addCategory(Category category);
	public int updateCategory(Category category);
}
