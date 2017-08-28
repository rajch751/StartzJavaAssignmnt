package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tags {
	
	private String schme;
	private String title;
	public String getSchme() {
		return schme;
	}
	public void setSchme(String schme) {
		this.schme = schme;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
