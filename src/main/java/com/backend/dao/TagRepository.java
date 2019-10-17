package com.backend.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer>{

	Optional<Tag> findByTag(String tag);
}
