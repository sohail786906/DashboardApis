package com.dashboard.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "data_csv")
public class DataEntity {
	 @Id
    @Column(name = "added")
    private String added;

    @Column(name = "city")
    private String city;

    @Column(name = "citylat")
    private String cityLat;

    @Column(name = "citylng")
    private String cityLng;

    @Column(name = "country")
    private String country;

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "impact")
    private String impact;

    @Column(name = "insight")
    private String insight;

    @Column(name = "intensity")
    private Integer intensity;

    @Column(name = "likelihood")
    private Integer likelihood;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "published")
    private String published;

    @Column(name = "region")
    private String region;

    @Column(name = "relevance")
    private Integer relevance;

    @Column(name = "sector")
    private String sector;

    @Column(name = "source")
    private String source;

    @Column(name = "start_year")
    private String startYear;

    @Column(name = "swot")
    private String swot;

    @Column(name = "title")
    private String title;

    @Column(name = "topic")
    private String topic;

    @Column(name = "url")
    private String url;

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityLat() {
		return cityLat;
	}

	public void setCityLat(String cityLat) {
		this.cityLat = cityLat;
	}

	public String getCityLng() {
		return cityLng;
	}

	public void setCityLng(String cityLng) {
		this.cityLng = cityLng;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getInsight() {
		return insight;
	}

	public void setInsight(String insight) {
		this.insight = insight;
	}

	public Integer getIntensity() {
		return intensity;
	}

	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}

	public Integer getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(Integer likelihood) {
		this.likelihood = likelihood;
	}

	public String getPestle() {
		return pestle;
	}

	public void setPestle(String pestle) {
		this.pestle = pestle;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getRelevance() {
		return relevance;
	}

	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getSwot() {
		return swot;
	}

	public void setSwot(String swot) {
		this.swot = swot;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "DataEntity [added=" + added + ", city=" + city + ", cityLat=" + cityLat + ", cityLng=" + cityLng
				+ ", country=" + country + ", endYear=" + endYear + ", impact=" + impact + ", insight=" + insight
				+ ", intensity=" + intensity + ", likelihood=" + likelihood + ", pestle=" + pestle + ", published="
				+ published + ", region=" + region + ", relevance=" + relevance + ", sector=" + sector + ", source="
				+ source + ", startYear=" + startYear + ", swot=" + swot + ", title=" + title + ", topic=" + topic
				+ ", url=" + url + "]";
	}

	public DataEntity(String added, String city, String cityLat, String cityLng, String country, Integer endYear,
			String impact, String insight, Integer intensity, Integer likelihood, String pestle, String published,
			String region, Integer relevance, String sector, String source, String startYear, String swot, String title,
			String topic, String url) {
		super();
		this.added = added;
		this.city = city;
		this.cityLat = cityLat;
		this.cityLng = cityLng;
		this.country = country;
		this.endYear = endYear;
		this.impact = impact;
		this.insight = insight;
		this.intensity = intensity;
		this.likelihood = likelihood;
		this.pestle = pestle;
		this.published = published;
		this.region = region;
		this.relevance = relevance;
		this.sector = sector;
		this.source = source;
		this.startYear = startYear;
		this.swot = swot;
		this.title = title;
		this.topic = topic;
		this.url = url;
	}

	public DataEntity() {
		super();
	}

    
}
