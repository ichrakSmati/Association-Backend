package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.GalleryRepository;
import com.backend.models.Gallery;

@Service(value= "galleryService")
public class GalleryServiceImp implements GalleryService{

	@Autowired
	GalleryRepository GalleryRepository;
	
	@Override
	public Gallery commit(Gallery gallery) {
		return GalleryRepository.save(gallery);
	}

}
