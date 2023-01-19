
package Events.models.event;

import java.util.HashMap;
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
    "entryStartTime",
    "entryEndTime"
})
@Generated("jsonschema2pojo")
public class EventEntryTime {

    @JsonProperty("entryStartTime")
    private String entryStartTime;
    @JsonProperty("entryEndTime")
    private String entryEndTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("entryStartTime")
    public String getEntryStartTime() {
        return entryStartTime;
    }

    @JsonProperty("entryStartTime")
    public void setEntryStartTime(String entryStartTime) {
        this.entryStartTime = entryStartTime;
    }

    @JsonProperty("entryEndTime")
    public String getEntryEndTime() {
        return entryEndTime;
    }

    @JsonProperty("entryEndTime")
    public void setEntryEndTime(String entryEndTime) {
        this.entryEndTime = entryEndTime;
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
