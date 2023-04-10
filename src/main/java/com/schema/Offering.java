package com.schema;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "contentId",
        "isValid",
        "viewableId",
        "upstreamVersion",
        "allowedAudioLanguage",
        "allowedTextLanguage",
        "_id",
        "_type",
        "_url",
        "territory",
        "brand",
        "channel",
        "startUTC",
        "endUTC",
        "firstOfferedDate"
})
@Generated("jsonschema2pojo")
public class Offering {

    @JsonProperty("contentId")
    private String contentId;
    @JsonProperty("isValid")
    private Boolean isValid;
    @JsonProperty("viewableId")
    private String viewableId;
    @JsonProperty("upstreamVersion")
    private Integer upstreamVersion;
    @JsonProperty("allowedAudioLanguage")
    private AllowedAudioLanguage allowedAudioLanguage;
    @JsonProperty("allowedTextLanguage")
    private AllowedTextLanguage allowedTextLanguage;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("_url")
    private String url;
    @JsonProperty("territory")
    private String territory;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("startUTC")
    private String startUTC;
    @JsonProperty("endUTC")
    private String endUTC;
    @JsonProperty("firstOfferedDate")
    private String firstOfferedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @JsonProperty("isValid")
    public Boolean getIsValid() {
        return isValid;
    }

    @JsonProperty("isValid")
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    @JsonProperty("viewableId")
    public String getViewableId() {
        return viewableId;
    }

    @JsonProperty("viewableId")
    public void setViewableId(String viewableId) {
        this.viewableId = viewableId;
    }

    @JsonProperty("upstreamVersion")
    public Integer getUpstreamVersion() {
        return upstreamVersion;
    }

    @JsonProperty("upstreamVersion")
    public void setUpstreamVersion(Integer upstreamVersion) {
        this.upstreamVersion = upstreamVersion;
    }

    @JsonProperty("allowedAudioLanguage")
    public AllowedAudioLanguage getAllowedAudioLanguage() {
        return allowedAudioLanguage;
    }

    @JsonProperty("allowedAudioLanguage")
    public void setAllowedAudioLanguage(AllowedAudioLanguage allowedAudioLanguage) {
        this.allowedAudioLanguage = allowedAudioLanguage;
    }

    @JsonProperty("allowedTextLanguage")
    public AllowedTextLanguage getAllowedTextLanguage() {
        return allowedTextLanguage;
    }

    @JsonProperty("allowedTextLanguage")
    public void setAllowedTextLanguage(AllowedTextLanguage allowedTextLanguage) {
        this.allowedTextLanguage = allowedTextLanguage;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("_url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("_url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("territory")
    public String getTerritory() {
        return territory;
    }

    @JsonProperty("territory")
    public void setTerritory(String territory) {
        this.territory = territory;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("startUTC")
    public String getStartUTC() {
        return startUTC;
    }

    @JsonProperty("startUTC")
    public void setStartUTC(String startUTC) {
        this.startUTC = startUTC;
    }

    @JsonProperty("endUTC")
    public String getEndUTC() {
        return endUTC;
    }

    @JsonProperty("endUTC")
    public void setEndUTC(String endUTC) {
        this.endUTC = endUTC;
    }

    @JsonProperty("firstOfferedDate")
    public String getFirstOfferedDate() {
        return firstOfferedDate;
    }

    @JsonProperty("firstOfferedDate")
    public void setFirstOfferedDate(String firstOfferedDate) {
        this.firstOfferedDate = firstOfferedDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}