package com.image.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int id;
	private String Imgname;
	private String description;
	@Lob
	private byte[] image;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImgname() {
		return Imgname;
	}
	public void setImgname(String imgname) {
		Imgname = imgname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public Image(int id, String imgname, String description, byte[] image) {
		super();
		this.id = id;
		Imgname = imgname;
		this.description = description;
		this.image = image;
	}
	
	public Image() {}
	
	
	

}
