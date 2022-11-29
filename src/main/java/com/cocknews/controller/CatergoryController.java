package com.cocknews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cocknews.model.Category;
import com.cocknews.model.Post;
import com.cocknews.service.CategoryService;

@RestController
public class CatergoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("auth/add/category")
	public Category addCategory(@RequestBody Category category)
	{
		return categoryService.addCategory(category);
	}
	
	@PutMapping("add/post/{categoryName}")
	public Category addPosttoCategory(@PathVariable String categoryName ,@RequestBody Post post)
	{
		return categoryService.addPostToCategory(categoryName,post);
	}
	
	@PutMapping("edit/catgegory/{categoryName}")
	public Category editCategory(@PathVariable String categoryName,@RequestBody Category category)
	{
		return categoryService.editCategory(categoryName,category);
	}
	
	@DeleteMapping("category/delete/{categoryId}")
	public void deleteCategory(@PathVariable Long categoryId) {
		 categoryService.deleteCategory(categoryId);
		
	}
	
}
