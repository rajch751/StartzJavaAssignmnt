package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaData {
	
	private String id;
	private String title;
	private String guid;
	private String ownerId;
	private Long availiableDate;
	private Long exprDate;
	private String[] ratings;
	private Contents[] content;
	private String restrictionId;
	private String availabilityState;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public Long getAvailiableDate() {
		return availiableDate;
	}
	public void setAvailiableDate(Long availiableDate) {
		this.availiableDate = availiableDate;
	}
	public Long getExprDate() {
		return exprDate;
	}
	public void setExprDate(Long exprDate) {
		this.exprDate = exprDate;
	}
	public String[] getRatings() {
		return ratings;
	}
	public void setRatings(String[] ratings) {
		this.ratings = ratings;
	}
	public Contents[] getContent() {
		return content;
	}
	public void setContent(Contents[] content) {
		this.content = content;
	}
	public String getRestrictionId() {
		return restrictionId;
	}
	public void setRestrictionId(String restrictionId) {
		this.restrictionId = restrictionId;
	}
	public String getAvailabilityState() {
		return availabilityState;
	}
	public void setAvailabilityState(String availabilityState) {
		this.availabilityState = availabilityState;
	}
	

}
