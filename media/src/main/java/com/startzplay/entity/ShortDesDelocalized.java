package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShortDesDelocalized {
	
	private String arr;

	public String getArr() {
		return arr;
	}

	public void setArr(String arr) {
		this.arr = arr;
	}
	

}
