package com.schema;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "_id",
        "_type",
        "_url",
        "releaseYear",
        "tags",
        "airDate",
        "credits",
        "localizedCredits",
        "edits",
        "extras",
        "firstOfferedDate",
        "images",
        "isDownloadable",
        "offerings",
        "summaries",
        "titles"
})
@Generated("jsonschema2pojo")
public class ViewableSchema {

    @JsonProperty("episodes")
    private List<Episode> episodes;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("_url")
    private String url;
    @JsonProperty("releaseYear")
    private Integer releaseYear;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("airDate")
    private String airDate;


    @JsonProperty("firstOfferedDate")
    private String firstOfferedDate;

    @JsonProperty("isDownloadable")
    private Boolean isDownloadable;
    @JsonProperty("offerings")
    private List<Offering> offerings;
    @JsonProperty("titles")
    private Titles titles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    @JsonProperty("releaseYear")
    public Integer getReleaseYear() {
        return releaseYear;
    }

    @JsonProperty("releaseYear")
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("airDate")
    public String getAirDate() {
        return airDate;
    }

    @JsonProperty("airDate")
    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }









    @JsonProperty("firstOfferedDate")
    public String getFirstOfferedDate() {
        return firstOfferedDate;
    }

    @JsonProperty("firstOfferedDate")
    public void setFirstOfferedDate(String firstOfferedDate) {
        this.firstOfferedDate = firstOfferedDate;
    }



    @JsonProperty("isDownloadable")
    public Boolean getIsDownloadable() {
        return isDownloadable;
    }

    @JsonProperty("isDownloadable")
    public void setIsDownloadable(Boolean isDownloadable) {
        this.isDownloadable = isDownloadable;
    }

    @JsonProperty("offerings")
    public List<Offering> getOfferings() {
        return offerings;
    }

    @JsonProperty("offerings")
    public void setOfferings(List<Offering> offerings) {
        this.offerings = offerings;
    }





    @JsonProperty("titles")
    public Titles getTitles() {
        return titles;
    }

    @JsonProperty("titles")
    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
   /* @JsonCreator
    public static Titles fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Titles.class);
    }
*/

}