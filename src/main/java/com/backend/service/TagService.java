package com.backend.service;

import java.util.Optional;

import com.backend.models.Tag;

public interface TagService {

	void commit (Tag tag);
	Optional<Tag> findByName(Tag tag);
}
