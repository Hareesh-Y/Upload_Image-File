package com.image.api.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.image.api.entity.Image;
import com.image.api.repo.ImageRepo;

@Service
public class ImageService {
	
	@Autowired
	private ImageRepo imgRepo;
	
	public String saveImage(MultipartFile file,String name, String description) throws IOException {
		Image img = new Image();
		img.setImgname(name);
		img.setDescription(description);
		img.setImage(file.getBytes());
		
		imgRepo.save(img);
		
		return "image saved successfully";
	}
	
	

}
