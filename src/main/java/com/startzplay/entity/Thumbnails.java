package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnails {
	
	private Thumbnail[] tn;

	public Thumbnail[] getTn() {
		return tn;
	}

	public void setTn(Thumbnail[] tn) {
		this.tn = tn;
	}
	
	

}
