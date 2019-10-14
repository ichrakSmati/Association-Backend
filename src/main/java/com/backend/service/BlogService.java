package com.backend.service;

import java.util.List;

import com.backend.models.Blog;
import com.backend.models.User;


public interface BlogService {
	List<Blog> getAll();
	List<Blog> getAllByAuthor(int authorId);
	Blog commit (Blog blog);
	Blog find (int id);
	void delete (int id);
	
}
