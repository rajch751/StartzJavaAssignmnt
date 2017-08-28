package com.startzplay.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TitleLocalized implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String arr;
	private String en;
	public String getArr() {
		return arr;
	}
	public void setArr(String arr) {
		this.arr = arr;
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	
	

	
	

}
