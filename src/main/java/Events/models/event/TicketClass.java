
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
    "ticketClassName",
    "ticketClassId",
    "priceInfo",
    "baseCurrencySalePrice",
    "availableTickets",
    "ticketClassColor"
})
@Generated("jsonschema2pojo")
public class TicketClass {

    @JsonProperty("ticketClassName")
    private String ticketClassName;
    @JsonProperty("ticketClassId")
    private String ticketClassId;
    @JsonProperty("priceInfo")
    private List<PriceInfo> priceInfo = null;
    @JsonProperty("baseCurrencySalePrice")
    private Integer baseCurrencySalePrice;
    @JsonProperty("availableTickets")
    private Integer availableTickets;
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

    @JsonProperty("ticketClassId")
    public String getTicketClassId() {
        return ticketClassId;
    }

    @JsonProperty("ticketClassId")
    public void setTicketClassId(String ticketClassId) {
        this.ticketClassId = ticketClassId;
    }

    @JsonProperty("priceInfo")
    public List<PriceInfo> getPriceInfo() {
        return priceInfo;
    }

    @JsonProperty("priceInfo")
    public void setPriceInfo(List<PriceInfo> priceInfo) {
        this.priceInfo = priceInfo;
    }

    @JsonProperty("baseCurrencySalePrice")
    public Integer getBaseCurrencySalePrice() {
        return baseCurrencySalePrice;
    }

    @JsonProperty("baseCurrencySalePrice")
    public void setBaseCurrencySalePrice(Integer baseCurrencySalePrice) {
        this.baseCurrencySalePrice = baseCurrencySalePrice;
    }

    @JsonProperty("availableTickets")
    public Integer getAvailableTickets() {
        return availableTickets;
    }

    @JsonProperty("availableTickets")
    public void setAvailableTickets(Integer availableTickets) {
        this.availableTickets = availableTickets;
    }

    @JsonProperty("ticketClassColor")
    public String getTicketClassColor() {
        return ticketClassColor;
    }

    @JsonProperty("ticketClassColor")
    public void setTicketClassColor(String ticketClassColor) {
        this.ticketClassColor = ticketClassColor;
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
