package com.cocknews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocknews.model.Category;
import com.cocknews.model.Post;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findBycategoryName(String categoryName);

}
