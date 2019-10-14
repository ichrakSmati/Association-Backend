package com.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.backend.models.Blog;
import com.backend.service.BlogService;

@RestController
@RequestMapping("/blog")
@CrossOrigin("*")
public class BlogController {

	@Autowired
	BlogService blogService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Blog> getList(){
		return blogService.getAll();
	}
	
	@RequestMapping(value="/author/{id}" , method=RequestMethod.GET)
	public List<Blog> getListActivated(@PathVariable int id){
		return blogService.getAllByAuthor(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Blog add(@RequestBody Blog blog){
		return blogService.commit(blog);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Blog edit(@RequestBody Blog blog){
		return blogService.commit(blog);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<?> delete(@RequestBody int blogId){
		blogService.delete(blogId);
		 return ResponseEntity.ok(blogId+" deleted");
	}
}
