package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contents {
	
	private Long bitrate;
	private Long duration;
	private String format;
	private Long height;
	private String language;
	private Long width;
	private String id;
	private String guid;
	private String[] assetTypeIds;
	private String[] assetTypes;
	private String downloadUrl;
	private Releases[] releases;
	private String serverId;
	private String stramingUrl;
	private String protecnAccess;
	public Long getBitrate() {
		return bitrate;
	}
	public void setBitrate(Long bitrate) {
		this.bitrate = bitrate;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getWidth() {
		return width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String[] getAssetTypeIds() {
		return assetTypeIds;
	}
	public void setAssetTypeIds(String[] assetTypeIds) {
		this.assetTypeIds = assetTypeIds;
	}
	public String[] getAssetTypes() {
		return assetTypes;
	}
	public void setAssetTypes(String[] assetTypes) {
		this.assetTypes = assetTypes;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public Releases[] getReleases() {
		return releases;
	}
	public void setReleases(Releases[] releases) {
		this.releases = releases;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getStramingUrl() {
		return stramingUrl;
	}
	public void setStramingUrl(String stramingUrl) {
		this.stramingUrl = stramingUrl;
	}
	public String getProtecnAccess() {
		return protecnAccess;
	}
	public void setProtecnAccess(String protecnAccess) {
		this.protecnAccess = protecnAccess;
	}
	
	

}
