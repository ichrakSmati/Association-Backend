package com.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.TagRepository;
import com.backend.models.Tag;

@Service(value= "tagService")
public class TagServiceImp implements TagService{

	@Autowired
	TagRepository tagRepository;
	
	@Override
	public void commit(Tag tag) {
		tagRepository.save(tag);
	}

	@Override
	public Optional<Tag> findByName(Tag tag) {
		return tagRepository.findByTag(tag.getTag());
	}

}
