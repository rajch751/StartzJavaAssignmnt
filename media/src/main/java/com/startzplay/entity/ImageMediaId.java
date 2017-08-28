package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageMediaId {

	private String mediId;
	private boolean isPrary;
	private String imageType;
	public String getMediId() {
		return mediId;
	}
	public void setMediId(String mediId) {
		this.mediId = mediId;
	}
	public boolean isPrary() {
		return isPrary;
	}
	public void setPrary(boolean isPrary) {
		this.isPrary = isPrary;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	
	
}
