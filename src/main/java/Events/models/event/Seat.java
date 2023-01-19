
package Events.models.event;

import java.util.HashMap;
import java.util.List;
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
    "sectionId",
    "seats"
})
@Generated("jsonschema2pojo")
public class Seat {

    @JsonProperty("sectionId")
    private String sectionId;
    @JsonProperty("seats")
    private List<List<Object>> seats = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sectionId")
    public String getSectionId() {
        return sectionId;
    }

    @JsonProperty("sectionId")
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @JsonProperty("seats")
    public List<List<Object>> getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(List<List<Object>> seats) {
        this.seats = seats;
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
