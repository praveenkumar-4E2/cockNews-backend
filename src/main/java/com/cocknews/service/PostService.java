package com.cocknews.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocknews.model.Category;
import com.cocknews.model.Post;
import com.cocknews.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;

	public Post editPost(String postName, Post post) {
		// TODO Auto-generated method stub
		Post existingPost=postRepository.findByPostName(postName);
		existingPost.setPostName(post.getPostName());
		existingPost.setContent(post.getContent());
		existingPost.setDescription(post.getDescription());
		existingPost.setImageUrl(post.getImageUrl());
		existingPost.setDisplay(post.isDisplay());
		existingPost.setNewPost(post.isNewPost());
		existingPost.setTags(post.getTags());
		existingPost.setTrending(post.isTrending());
		return postRepository.save(existingPost);
	}

	public void deletePost(Long postId) {
		postRepository.deleteById(postId);
		
	}

}
