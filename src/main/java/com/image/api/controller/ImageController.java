package com.image.api.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.image.api.service.ImageService;

@RestController
public class ImageController {
	
	@Autowired
	private ImageService ImageSvc;
	
	@PostMapping("/save")
	public String saveImage(@RequestParam("file") MultipartFile file,
			@RequestParam("name") String name,
			@RequestParam("description") String description) throws IOException{
		
		return ImageSvc.saveImage(file,name,description);
		
	}

}
