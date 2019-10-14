package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.models.Gallery;;

public interface GalleryRepository extends JpaRepository<Gallery, Integer> {

}
