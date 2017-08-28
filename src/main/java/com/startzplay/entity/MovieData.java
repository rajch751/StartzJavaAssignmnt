package com.startzplay.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private XMLNS xmlns; 
	private Long startIndex;
	private Long itemsPerPage;
	private Long entryCount;
	private String title;
	private MovieEntry[] entries;
	public XMLNS getXmlns() {
		return xmlns;
	}
	public void setXmlns(XMLNS xmlns) {
		this.xmlns = xmlns;
	}
	public Long getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}
	public Long getItemsPerPage() {
		return itemsPerPage;
	}
	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Long getEntryCount() {
		return entryCount;
	}
	public void setEntryCount(Long entryCount) {
		this.entryCount = entryCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public MovieEntry[] getEntries() {
		return entries;
	}
	public void setEntries(MovieEntry[] entries) {
		this.entries = entries;
	}
	

	
}
