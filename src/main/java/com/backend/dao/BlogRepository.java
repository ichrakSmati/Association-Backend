package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.models.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
