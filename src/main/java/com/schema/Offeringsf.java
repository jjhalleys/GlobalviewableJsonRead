package com.schema;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "offerings"
})
@Generated("jsonschema2pojo")
public class Offeringsf {

    @JsonProperty("offerings")
    private List<Offering> offerings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("offerings")
    public List<Offering> getOfferings() {
        return offerings;
    }

    @JsonProperty("offerings")
    public void setOfferings(List<Offering> offerings) {
        this.offerings = offerings;
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