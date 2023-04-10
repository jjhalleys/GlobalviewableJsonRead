package com.schema;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "allLanguages",
        "allowedLanguages"
})
@Generated("jsonschema2pojo")
public class AllowedAudioLanguage {

    @JsonProperty("allLanguages")
    private Boolean allLanguages;
    @JsonProperty("allowedLanguages")
    private List<String> allowedLanguages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("allLanguages")
    public Boolean getAllLanguages() {
        return allLanguages;
    }

    @JsonProperty("allLanguages")
    public void setAllLanguages(Boolean allLanguages) {
        this.allLanguages = allLanguages;
    }

    @JsonProperty("allowedLanguages")
    public List<String> getAllowedLanguages() {
        return allowedLanguages;
    }

    @JsonProperty("allowedLanguages")
    public void setAllowedLanguages(List<String> allowedLanguages) {
        this.allowedLanguages = allowedLanguages;
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