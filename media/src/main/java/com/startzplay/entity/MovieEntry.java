package com.startzplay.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieEntry implements Serializable {

	private String id;
	private String guid;
	private Long updatd;
	private String title;
	private String description;
	private Long added;
	private boolean approved;
	private Credits[] credit;
	private DescLocalized descriptionLocalized;
	private String displayGenre;
	private String editorialRating;
	private ImageMediaId[] imd;
	private String isAdult;
	private String[] languages;
	private String longDescription;
	private LongDesDelocalized longDescriptionLocalized;
	private String programType;
	private String[] ratings;
	private String seriesEpisodeNumber;
	private String seriesId;
	private String shortDescription;
	private ShortDesDelocalized[] shrtDescriptionLocalized;
	private String[] tagIds;
	private Tags[] tag;
	private Thumbnails[] tn;
	private TitleLocalized titleLocalized;
	private String tvSeasonEpisodeNumber;
	private String tvSeasonId;
	private String tvSeasonNumber;
	private Long year;
	private MediaData[] media;
	private String peg$ExclusiveFrench;
	private String peg$arAgeRating;
	private String peg$arContentRating;
	private String peg$availableInSection;
	private String peg$contentClassification;
	private String peg$contractName;
	private String peg$countryOfOrigin;
	private String peg$priorityLevel;
	private String peg$priorityLevelActionandAdventure;
	private String peg$priorityLevelArabic;
	private String peg$priorityLevelChildrenandFamily;
	private String peg$priorityLevelComedy;
	private String peg$priorityLevelDisney;
	private String peg$priorityLevelDisneyKids;
	private String peg$priorityLevelDrama;
	private String peg$priorityLevelKids;
	private String peg$priorityLevelKidsAction;
	private String peg$priorityLevelKidsFunandAdventure;
	private String peg$priorityLevelKidsMagicandDreams;
	private String peg$priorityLevelKidsPreschool;
	private String peg$priorityLevelRomance;
	private String peg$priorityLevelThriller;
	private String peg$productCode;
	private String peg$programMediaAvailability;
	private String peg$testDefaultValue;
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
	public Long getUpdatd() {
		return updatd;
	}
	public void setUpdatd(Long updatd) {
		this.updatd = updatd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAdded() {
		return added;
	}
	public void setAdded(Long added) {
		this.added = added;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public Credits[] getCredit() {
		return credit;
	}
	public void setCredit(Credits[] credit) {
		this.credit = credit;
	}
	public DescLocalized getDescriptionLocalized() {
		return descriptionLocalized;
	}
	public void setDescriptionLocalized(DescLocalized descriptionLocalized) {
		this.descriptionLocalized = descriptionLocalized;
	}
	public String getDisplayGenre() {
		return displayGenre;
	}
	public void setDisplayGenre(String displayGenre) {
		this.displayGenre = displayGenre;
	}
	public String getEditorialRating() {
		return editorialRating;
	}
	public void setEditorialRating(String editorialRating) {
		this.editorialRating = editorialRating;
	}
	public ImageMediaId[] getImd() {
		return imd;
	}
	public void setImd(ImageMediaId[] imd) {
		this.imd = imd;
	}
	public String getIsAdult() {
		return isAdult;
	}
	public void setIsAdult(String isAdult) {
		this.isAdult = isAdult;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public LongDesDelocalized getLongDescriptionLocalized() {
		return longDescriptionLocalized;
	}
	public void setLongDescriptionLocalized(LongDesDelocalized longDescriptionLocalized) {
		this.longDescriptionLocalized = longDescriptionLocalized;
	}
	public String getProgramType() {
		return programType;
	}
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	public String[] getRatings() {
		return ratings;
	}
	public void setRatings(String[] ratings) {
		this.ratings = ratings;
	}
	public String getSeriesEpisodeNumber() {
		return seriesEpisodeNumber;
	}
	public void setSeriesEpisodeNumber(String seriesEpisodeNumber) {
		this.seriesEpisodeNumber = seriesEpisodeNumber;
	}
	public String getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public ShortDesDelocalized[] getShrtDescriptionLocalized() {
		return shrtDescriptionLocalized;
	}
	public void setShrtDescriptionLocalized(ShortDesDelocalized[] shrtDescriptionLocalized) {
		this.shrtDescriptionLocalized = shrtDescriptionLocalized;
	}
	public String[] getTagIds() {
		return tagIds;
	}
	public void setTagIds(String[] tagIds) {
		this.tagIds = tagIds;
	}
	public Tags[] getTag() {
		return tag;
	}
	public void setTag(Tags[] tag) {
		this.tag = tag;
	}
	public Thumbnails[] getTn() {
		return tn;
	}
	public void setTn(Thumbnails[] tn) {
		this.tn = tn;
	}
	
	public TitleLocalized getTitleLocalized() {
		return titleLocalized;
	}
	public void setTitleLocalized(TitleLocalized titleLocalized) {
		this.titleLocalized = titleLocalized;
	}
	public String getTvSeasonEpisodeNumber() {
		return tvSeasonEpisodeNumber;
	}
	public void setTvSeasonEpisodeNumber(String tvSeasonEpisodeNumber) {
		this.tvSeasonEpisodeNumber = tvSeasonEpisodeNumber;
	}
	public String getTvSeasonId() {
		return tvSeasonId;
	}
	public void setTvSeasonId(String tvSeasonId) {
		this.tvSeasonId = tvSeasonId;
	}
	public String getTvSeasonNumber() {
		return tvSeasonNumber;
	}
	public void setTvSeasonNumber(String tvSeasonNumber) {
		this.tvSeasonNumber = tvSeasonNumber;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public MediaData[] getMedia() {
		return media;
	}
	public void setMedia(MediaData[] media) {
		this.media = media;
	}
	public String getPeg$ExclusiveFrench() {
		return peg$ExclusiveFrench;
	}
	public void setPeg$ExclusiveFrench(String peg$ExclusiveFrench) {
		this.peg$ExclusiveFrench = peg$ExclusiveFrench;
	}
	public String getPeg$arAgeRating() {
		return peg$arAgeRating;
	}
	public void setPeg$arAgeRating(String peg$arAgeRating) {
		this.peg$arAgeRating = peg$arAgeRating;
	}
	public String getPeg$arContentRating() {
		return peg$arContentRating;
	}
	public void setPeg$arContentRating(String peg$arContentRating) {
		this.peg$arContentRating = peg$arContentRating;
	}
	public String getPeg$availableInSection() {
		return peg$availableInSection;
	}
	public void setPeg$availableInSection(String peg$availableInSection) {
		this.peg$availableInSection = peg$availableInSection;
	}
	public String getPeg$contentClassification() {
		return peg$contentClassification;
	}
	public void setPeg$contentClassification(String peg$contentClassification) {
		this.peg$contentClassification = peg$contentClassification;
	}
	public String getPeg$contractName() {
		return peg$contractName;
	}
	public void setPeg$contractName(String peg$contractName) {
		this.peg$contractName = peg$contractName;
	}
	public String getPeg$countryOfOrigin() {
		return peg$countryOfOrigin;
	}
	public void setPeg$countryOfOrigin(String peg$countryOfOrigin) {
		this.peg$countryOfOrigin = peg$countryOfOrigin;
	}
	public String getPeg$priorityLevel() {
		return peg$priorityLevel;
	}
	public void setPeg$priorityLevel(String peg$priorityLevel) {
		this.peg$priorityLevel = peg$priorityLevel;
	}
	public String getPeg$priorityLevelActionandAdventure() {
		return peg$priorityLevelActionandAdventure;
	}
	public void setPeg$priorityLevelActionandAdventure(String peg$priorityLevelActionandAdventure) {
		this.peg$priorityLevelActionandAdventure = peg$priorityLevelActionandAdventure;
	}
	public String getPeg$priorityLevelArabic() {
		return peg$priorityLevelArabic;
	}
	public void setPeg$priorityLevelArabic(String peg$priorityLevelArabic) {
		this.peg$priorityLevelArabic = peg$priorityLevelArabic;
	}
	public String getPeg$priorityLevelChildrenandFamily() {
		return peg$priorityLevelChildrenandFamily;
	}
	public void setPeg$priorityLevelChildrenandFamily(String peg$priorityLevelChildrenandFamily) {
		this.peg$priorityLevelChildrenandFamily = peg$priorityLevelChildrenandFamily;
	}
	public String getPeg$priorityLevelComedy() {
		return peg$priorityLevelComedy;
	}
	public void setPeg$priorityLevelComedy(String peg$priorityLevelComedy) {
		this.peg$priorityLevelComedy = peg$priorityLevelComedy;
	}
	public String getPeg$priorityLevelDisney() {
		return peg$priorityLevelDisney;
	}
	public void setPeg$priorityLevelDisney(String peg$priorityLevelDisney) {
		this.peg$priorityLevelDisney = peg$priorityLevelDisney;
	}
	public String getPeg$priorityLevelDisneyKids() {
		return peg$priorityLevelDisneyKids;
	}
	public void setPeg$priorityLevelDisneyKids(String peg$priorityLevelDisneyKids) {
		this.peg$priorityLevelDisneyKids = peg$priorityLevelDisneyKids;
	}
	public String getPeg$priorityLevelDrama() {
		return peg$priorityLevelDrama;
	}
	public void setPeg$priorityLevelDrama(String peg$priorityLevelDrama) {
		this.peg$priorityLevelDrama = peg$priorityLevelDrama;
	}
	public String getPeg$priorityLevelKids() {
		return peg$priorityLevelKids;
	}
	public void setPeg$priorityLevelKids(String peg$priorityLevelKids) {
		this.peg$priorityLevelKids = peg$priorityLevelKids;
	}
	public String getPeg$priorityLevelKidsAction() {
		return peg$priorityLevelKidsAction;
	}
	public void setPeg$priorityLevelKidsAction(String peg$priorityLevelKidsAction) {
		this.peg$priorityLevelKidsAction = peg$priorityLevelKidsAction;
	}
	public String getPeg$priorityLevelKidsFunandAdventure() {
		return peg$priorityLevelKidsFunandAdventure;
	}
	public void setPeg$priorityLevelKidsFunandAdventure(String peg$priorityLevelKidsFunandAdventure) {
		this.peg$priorityLevelKidsFunandAdventure = peg$priorityLevelKidsFunandAdventure;
	}
	public String getPeg$priorityLevelKidsMagicandDreams() {
		return peg$priorityLevelKidsMagicandDreams;
	}
	public void setPeg$priorityLevelKidsMagicandDreams(String peg$priorityLevelKidsMagicandDreams) {
		this.peg$priorityLevelKidsMagicandDreams = peg$priorityLevelKidsMagicandDreams;
	}
	public String getPeg$priorityLevelKidsPreschool() {
		return peg$priorityLevelKidsPreschool;
	}
	public void setPeg$priorityLevelKidsPreschool(String peg$priorityLevelKidsPreschool) {
		this.peg$priorityLevelKidsPreschool = peg$priorityLevelKidsPreschool;
	}
	public String getPeg$priorityLevelRomance() {
		return peg$priorityLevelRomance;
	}
	public void setPeg$priorityLevelRomance(String peg$priorityLevelRomance) {
		this.peg$priorityLevelRomance = peg$priorityLevelRomance;
	}
	public String getPeg$priorityLevelThriller() {
		return peg$priorityLevelThriller;
	}
	public void setPeg$priorityLevelThriller(String peg$priorityLevelThriller) {
		this.peg$priorityLevelThriller = peg$priorityLevelThriller;
	}
	public String getPeg$productCode() {
		return peg$productCode;
	}
	public void setPeg$productCode(String peg$productCode) {
		this.peg$productCode = peg$productCode;
	}
	public String getPeg$programMediaAvailability() {
		return peg$programMediaAvailability;
	}
	public void setPeg$programMediaAvailability(String peg$programMediaAvailability) {
		this.peg$programMediaAvailability = peg$programMediaAvailability;
	}
	public String getPeg$testDefaultValue() {
		return peg$testDefaultValue;
	}
	public void setPeg$testDefaultValue(String peg$testDefaultValue) {
		this.peg$testDefaultValue = peg$testDefaultValue;
	}
	
	

}
