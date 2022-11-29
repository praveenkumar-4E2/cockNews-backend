package com.cocknews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cocknews.model.Category;
import com.cocknews.model.Post;
import com.cocknews.service.PostService;
@CrossOrigin("http://localhost:4200")
@RestController
public class PostController {

	@Autowired
	private PostService postService;
	

	
	
	@PutMapping("edit/post/{postName}")
	public Post editPost(@PathVariable String postName,@RequestBody Post post)
	{
		return postService.editPost(postName,post);
	}
	
	@DeleteMapping("post/delete/{postId}")
	public void deletePost(@PathVariable Long postId) {
		postService.deletePost(postId);
		
	}
}
