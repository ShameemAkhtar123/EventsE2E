
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
    "eventDateTimeSlot",
    "eventEntryTime",
    "venueId",
    "eventImagesKeys",
    "bannerImageKey",
    "isOnlineSaleOpen",
    "isPublished",
    "totalAvailableTickets",
    "youtubeLink",
    "isFeatured",
    "slotSaved",
    "sections",
    "isTicketsPictureProtected",
    "ticketClasses",
    "seatingPlan",
    "seatingType",
    "availableSeats",
    "slotSeats",
    "parentEventId",
    "customURLs"
})
@Generated("jsonschema2pojo")
public class SaveSlotDataPayload {

    @JsonProperty("eventDateTimeSlot")
    private EventDateTimeSlot eventDateTimeSlot;
    @JsonProperty("eventEntryTime")
    private EventEntryTime eventEntryTime;
    @JsonProperty("venueId")
    private String venueId;
    @JsonProperty("eventImagesKeys")
    private List<Object> eventImagesKeys = null;
    @JsonProperty("bannerImageKey")
    private BannerImageKey bannerImageKey;
    @JsonProperty("isOnlineSaleOpen")
    private Integer isOnlineSaleOpen;
    @JsonProperty("isPublished")
    private Boolean isPublished;
    @JsonProperty("totalAvailableTickets")
    private Integer totalAvailableTickets;
    @JsonProperty("youtubeLink")
    private String youtubeLink;
    @JsonProperty("isFeatured")
    private Boolean isFeatured;
    @JsonProperty("slotSaved")
    private Boolean slotSaved;
    @JsonProperty("sections")
    private List<Object> sections = null;
    @JsonProperty("isTicketsPictureProtected")
    private Boolean isTicketsPictureProtected;
    @JsonProperty("ticketClasses")
    private List<TicketClass> ticketClasses = null;
    @JsonProperty("seatingPlan")
    private String seatingPlan;
    @JsonProperty("seatingType")
    private String seatingType;
    @JsonProperty("availableSeats")
    private Integer availableSeats;
    @JsonProperty("slotSeats")
    private SlotSeats slotSeats;
    @JsonProperty("parentEventId")
    private String parentEventId;
    @JsonProperty("customURLs")
    private List<Object> customURLs = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eventDateTimeSlot")
    public EventDateTimeSlot getEventDateTimeSlot() {
        return eventDateTimeSlot;
    }

    @JsonProperty("eventDateTimeSlot")
    public void setEventDateTimeSlot(EventDateTimeSlot eventDateTimeSlot) {
        this.eventDateTimeSlot = eventDateTimeSlot;
    }

    @JsonProperty("eventEntryTime")
    public EventEntryTime getEventEntryTime() {
        return eventEntryTime;
    }

    @JsonProperty("eventEntryTime")
    public void setEventEntryTime(EventEntryTime eventEntryTime) {
        this.eventEntryTime = eventEntryTime;
    }

    @JsonProperty("venueId")
    public String getVenueId() {
        return venueId;
    }

    @JsonProperty("venueId")
    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    @JsonProperty("eventImagesKeys")
    public List<Object> getEventImagesKeys() {
        return eventImagesKeys;
    }

    @JsonProperty("eventImagesKeys")
    public void setEventImagesKeys(List<Object> eventImagesKeys) {
        this.eventImagesKeys = eventImagesKeys;
    }

    @JsonProperty("bannerImageKey")
    public BannerImageKey getBannerImageKey() {
        return bannerImageKey;
    }

    @JsonProperty("bannerImageKey")
    public void setBannerImageKey(BannerImageKey bannerImageKey) {
        this.bannerImageKey = bannerImageKey;
    }

    @JsonProperty("isOnlineSaleOpen")
    public Integer getIsOnlineSaleOpen() {
        return isOnlineSaleOpen;
    }

    @JsonProperty("isOnlineSaleOpen")
    public void setIsOnlineSaleOpen(Integer isOnlineSaleOpen) {
        this.isOnlineSaleOpen = isOnlineSaleOpen;
    }

    @JsonProperty("isPublished")
    public Boolean getIsPublished() {
        return isPublished;
    }

    @JsonProperty("isPublished")
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    @JsonProperty("totalAvailableTickets")
    public Integer getTotalAvailableTickets() {
        return totalAvailableTickets;
    }

    @JsonProperty("totalAvailableTickets")
    public void setTotalAvailableTickets(Integer totalAvailableTickets) {
        this.totalAvailableTickets = totalAvailableTickets;
    }

    @JsonProperty("youtubeLink")
    public String getYoutubeLink() {
        return youtubeLink;
    }

    @JsonProperty("youtubeLink")
    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    @JsonProperty("isFeatured")
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    @JsonProperty("isFeatured")
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    @JsonProperty("slotSaved")
    public Boolean getSlotSaved() {
        return slotSaved;
    }

    @JsonProperty("slotSaved")
    public void setSlotSaved(Boolean slotSaved) {
        this.slotSaved = slotSaved;
    }

    @JsonProperty("sections")
    public List<Object> getSections() {
        return sections;
    }

    @JsonProperty("sections")
    public void setSections(List<Object> sections) {
        this.sections = sections;
    }

    @JsonProperty("isTicketsPictureProtected")
    public Boolean getIsTicketsPictureProtected() {
        return isTicketsPictureProtected;
    }

    @JsonProperty("isTicketsPictureProtected")
    public void setIsTicketsPictureProtected(Boolean isTicketsPictureProtected) {
        this.isTicketsPictureProtected = isTicketsPictureProtected;
    }

    @JsonProperty("ticketClasses")
    public List<TicketClass> getTicketClasses() {
        return ticketClasses;
    }

    @JsonProperty("ticketClasses")
    public void setTicketClasses(List<TicketClass> ticketClasses) {
        this.ticketClasses = ticketClasses;
    }

    @JsonProperty("seatingPlan")
    public String getSeatingPlan() {
        return seatingPlan;
    }

    @JsonProperty("seatingPlan")
    public void setSeatingPlan(String seatingPlan) {
        this.seatingPlan = seatingPlan;
    }

    @JsonProperty("seatingType")
    public String getSeatingType() {
        return seatingType;
    }

    @JsonProperty("seatingType")
    public void setSeatingType(String seatingType) {
        this.seatingType = seatingType;
    }

    @JsonProperty("availableSeats")
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    @JsonProperty("availableSeats")
    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @JsonProperty("slotSeats")
    public SlotSeats getSlotSeats() {
        return slotSeats;
    }

    @JsonProperty("slotSeats")
    public void setSlotSeats(SlotSeats slotSeats) {
        this.slotSeats = slotSeats;
    }

    @JsonProperty("parentEventId")
    public String getParentEventId() {
        return parentEventId;
    }

    @JsonProperty("parentEventId")
    public void setParentEventId(String parentEventId) {
        this.parentEventId = parentEventId;
    }

    @JsonProperty("customURLs")
    public List<Object> getCustomURLs() {
        return customURLs;
    }

    @JsonProperty("customURLs")
    public void setCustomURLs(List<Object> customURLs) {
        this.customURLs = customURLs;
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
