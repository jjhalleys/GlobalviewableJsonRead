package com.schema;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "en-us"
})
@Generated("jsonschema2pojo")
public class Short {

    @JsonProperty("en-us")
    private String enUs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Short() {
    }

    /**
     *
     * @param enUs
     */
    public Short(String enUs) {
        super();
        this.enUs = enUs;
    }

    @JsonProperty("en-us")
    public String getEnUs() {
        return enUs;
    }

    @JsonProperty("en-us")
    public void setEnUs(String enUs) {
        this.enUs = enUs;
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