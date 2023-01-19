
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
    "ticketClassesConfig",
    "parentEvent"
})
@Generated("jsonschema2pojo")
public class TicketClassesPayload {

    @JsonProperty("ticketClassesConfig")
    private List<TicketClassesConfig> ticketClassesConfig = null;
    @JsonProperty("parentEvent")
    private String parentEvent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ticketClassesConfig")
    public List<TicketClassesConfig> getTicketClassesConfig() {
        return ticketClassesConfig;
    }

    @JsonProperty("ticketClassesConfig")
    public void setTicketClassesConfig(List<TicketClassesConfig> ticketClassesConfig) {
        this.ticketClassesConfig = ticketClassesConfig;
    }

    @JsonProperty("parentEvent")
    public String getParentEvent() {
        return parentEvent;
    }

    @JsonProperty("parentEvent")
    public void setParentEvent(String parentEvent) {
        this.parentEvent = parentEvent;
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