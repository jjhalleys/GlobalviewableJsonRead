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
        "short",
        "full"
})
@Generated("jsonschema2pojo")
public class Titles {

    @JsonProperty("short")
    private Short _short;
    @JsonProperty("full")
    private Full full;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Titles() {
    }

    /**
     *
     * @param _short
     * @param full
     */
    public Titles(Short _short, Full full) {
        super();
        this._short = _short;
        this.full = full;
    }

    @JsonProperty("short")
    public Short getShort() {
        return _short;
    }

    @JsonProperty("short")
    public void setShort(Short _short) {
        this._short = _short;
    }

    @JsonProperty("full")
    public Full getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(Full full) {
        this.full = full;
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