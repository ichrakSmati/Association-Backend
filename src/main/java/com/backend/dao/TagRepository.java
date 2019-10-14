package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer>{

}
