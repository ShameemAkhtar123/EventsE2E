
package Events.models.event;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ticketClassName",
    "ticketClassColor"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketClassesConfig {

    @JsonProperty("ticketClassName")
    private String ticketClassName;
    @JsonProperty("ticketClassColor")
    private String ticketClassColor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ticketClassName")
    public String getTicketClassName() {
        return ticketClassName;
    }

    @JsonProperty("ticketClassName")
    public void setTicketClassName(String ticketClassName) {
        this.ticketClassName = ticketClassName;
    }

    @JsonProperty("ticketClassColor")
    public String getTicketClassColor() {
        return ticketClassColor;
    }

    @JsonProperty("ticketClassColor")
    public void setTicketClassColor(String ticketClassColor) {
        this.ticketClassColor = ticketClassColor;
    }

    public TicketClassesConfig(String ticketClassName, String ticketClassColor) {
        this.ticketClassName = ticketClassName;
        this.ticketClassColor = ticketClassColor;
    }

    public TicketClassesConfig() {
    }
}
