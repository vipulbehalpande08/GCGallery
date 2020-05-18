package com.gcg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcg.app.beans.Category;
import com.gcg.app.service.CategoryService;

@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/api/category")
@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public void addCategory(@RequestBody Category category){
		categoryService.addCategory(category);
	}
	@RequestMapping(value="/remove/{categoryId}", method=RequestMethod.DELETE)
	public void removeCategory(@PathVariable int categoryId){
		categoryService.removeCategory(categoryId);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateCategory(@RequestBody Category category){
		categoryService.updateCategory(category);
	}
}
