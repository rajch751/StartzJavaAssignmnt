package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LongDesDelocalized {
	
	private String ar;

	public String getAr() {
		return ar;
	}

	public void setAr(String ar) {
		this.ar = ar;
	}
	
	

}
