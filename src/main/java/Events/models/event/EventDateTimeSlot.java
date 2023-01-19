
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
    "eventStartTime",
    "eventEndTime"
})
@Generated("jsonschema2pojo")
public class EventDateTimeSlot {

    @JsonProperty("eventStartTime")
    private String eventStartTime;
    @JsonProperty("eventEndTime")
    private String eventEndTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eventStartTime")
    public String getEventStartTime() {
        return eventStartTime;
    }

    @JsonProperty("eventStartTime")
    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    @JsonProperty("eventEndTime")
    public String getEventEndTime() {
        return eventEndTime;
    }

    @JsonProperty("eventEndTime")
    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
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
