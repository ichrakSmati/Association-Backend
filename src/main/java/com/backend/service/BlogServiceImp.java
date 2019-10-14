package com.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.BlogRepository;
import com.backend.models.Blog;
import com.backend.models.User;

@Service(value= "blogService")
public class BlogServiceImp implements BlogService{

	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public List<Blog> getAll() {
		return blogRepository.findAll();
	}

	@Override
	public Blog commit(Blog blog) {
		return blogRepository.save(blog);
	}

	@Override
	public Blog find(int id) {
		return blogRepository.getOne(id);
	}

	@Override
	public void delete(int id) {
		blogRepository.deleteById(id);
	}

	@Override
	public List<Blog> getAllByAuthor(int authorId) {
		return blogRepository.findAll().stream()               
				.filter(resultatQuiz -> resultatQuiz.getAuthor().getId()==authorId)   
				.collect(Collectors.toList());
	}

}
