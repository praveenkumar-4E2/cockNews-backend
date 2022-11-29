package com.cocknews.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocknews.model.Category;
import com.cocknews.model.Post;
import com.cocknews.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	public Category addPostToCategory(String categoryName, Post post) {
		// TODO Auto-generated method stub
		Category existingCategory=categoryRepository.findBycategoryName(categoryName);
		List<Post> existingPosts=existingCategory.getPosts();
		existingPosts.add(post);
		
		return categoryRepository.save(existingCategory);
	}

	public Category editCategory(String categoryName, Category category) {
		// TODO Auto-generated method stub
		Category existingCategory=categoryRepository.findBycategoryName(categoryName);
		existingCategory.setCategoryName(category.getCategoryName());
		
		return categoryRepository.save(existingCategory);
	}

	public void deleteCategory(Long categoryId) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(categoryId);
		return;
	}
	
	
	
	
	
}
