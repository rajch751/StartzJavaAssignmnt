package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Releases {
	
	private String pid;
	private String url;
	private String restricationEnd;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRestricationEnd() {
		return restricationEnd;
	}
	public void setRestricationEnd(String restricationEnd) {
		this.restricationEnd = restricationEnd;
	}
	

}
