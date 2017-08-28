package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credits {
	
	private String characterName;
	private String creditTye;
	private boolean isActve;
	private Long order;
	private String persnId;
	private String persnName;
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getCreditTye() {
		return creditTye;
	}
	public void setCreditTye(String creditTye) {
		this.creditTye = creditTye;
	}
	public boolean isActve() {
		return isActve;
	}
	public void setActve(boolean isActve) {
		this.isActve = isActve;
	}
	public Long getOrder() {
		return order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}
	public String getPersnId() {
		return persnId;
	}
	public void setPersnId(String persnId) {
		this.persnId = persnId;
	}
	public String getPersnName() {
		return persnName;
	}
	public void setPersnName(String persnName) {
		this.persnName = persnName;
	}
	
	

}
