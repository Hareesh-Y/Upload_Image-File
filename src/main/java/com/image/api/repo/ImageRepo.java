package com.image.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.api.entity.Image;

public interface ImageRepo extends JpaRepository<Image,Integer>{

}
