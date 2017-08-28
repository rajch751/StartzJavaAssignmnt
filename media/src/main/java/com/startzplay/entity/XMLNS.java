package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class XMLNS {

	private String peg;

	public String getPeg() {
		return peg;
	}

	public void setPeg(String peg) {
		this.peg = peg;
	}
	
	
}
