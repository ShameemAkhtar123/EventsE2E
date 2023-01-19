
package Events.models.event;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bannerImageKey",
    "contactPersonInfo",
    "createdAtInfo",
    "isPublished",
    "isFeatured",
    "isPasswordProtected",
    "eventStatus",
    "venues",
    "slotsData",
    "supportedCurrencies",
    "localCurrencies",
    "multiCategoryList",
    "eventCategories",
    "categories",
    "searchableCategoryList",
    "parentCategories",
    "tags",
    "eventSoldPercentage",
    "passSoldPercentage",
    "isDraft",
    "customSeatingPlan",
    "createdAt",
    "_id",
    "title",
    "organizationId",
    "eventType",
    "currency",
    "description",
    "parentEvent",
    "imdbUrl",
    "youtubeLink",
    "customURLs",
    "galleryImages",
    "seatingType",
    "createdBy",
    "createdByName",
    "ticketClassesConfig",
    "passConfigs",
    "created_at",
    "apiVersion",
    "updatedAt",
    "__v"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    @JsonProperty("bannerImageKey")
    private BannerImageKey bannerImageKey;
    @JsonProperty("contactPersonInfo")
    private ContactPersonInfo contactPersonInfo;
    @JsonProperty("createdAtInfo")
    private CreatedAtInfo createdAtInfo;
    @JsonProperty("isPublished")
    private Boolean isPublished;
    @JsonProperty("isFeatured")
    private Boolean isFeatured;
    @JsonProperty("isPasswordProtected")
    private Boolean isPasswordProtected;
    @JsonProperty("eventStatus")
    private String eventStatus;
    @JsonProperty("venues")
    private List<Object> venues = null;
    @JsonProperty("slotsData")
    private List<Object> slotsData = null;
    @JsonProperty("supportedCurrencies")
    private List<String> supportedCurrencies = null;
    @JsonProperty("localCurrencies")
    private Object localCurrencies;
    @JsonProperty("multiCategoryList")
    private List<List<String>> multiCategoryList = null;
    @JsonProperty("eventCategories")
    private List<String> eventCategories = null;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("searchableCategoryList")
    private List<String> searchableCategoryList = null;
    @JsonProperty("parentCategories")
    private List<Object> parentCategories = null;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("eventSoldPercentage")
    private Integer eventSoldPercentage;
    @JsonProperty("passSoldPercentage")
    private Integer passSoldPercentage;
    @JsonProperty("isDraft")
    private Boolean isDraft;
    @JsonProperty("customSeatingPlan")
    private Boolean customSeatingPlan;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("_id")
    private String _id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("organizationId")
    private String organizationId;
    @JsonProperty("eventType")
    private String eventType;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("description")
    private String description;
    @JsonProperty("parentEvent")
    private String parentEvent;
    @JsonProperty("imdbUrl")
    private Object imdbUrl;
    @JsonProperty("youtubeLink")
    private Object youtubeLink;
    @JsonProperty("customURLs")
    private Object customURLs;
    @JsonProperty("galleryImages")
    private Object galleryImages;
    @JsonProperty("seatingType")
    private String seatingType;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("createdByName")
    private String createdByName;
    @JsonProperty("ticketClassesConfig")
    private List<TicketClassesConfig> ticketClassesConfig = null;
    @JsonProperty("passConfigs")
    private List<Object> passConfigs = null;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("__v")
    private Integer __v;

    @JsonProperty("bannerImageKey")
    public BannerImageKey getBannerImageKey() {
        return bannerImageKey;
    }

    @JsonProperty("bannerImageKey")
    public void setBannerImageKey(BannerImageKey bannerImageKey) {
        this.bannerImageKey = bannerImageKey;
    }

    @JsonProperty("contactPersonInfo")
    public ContactPersonInfo getContactPersonInfo() {
        return contactPersonInfo;
    }

    @JsonProperty("contactPersonInfo")
    public void setContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        this.contactPersonInfo = contactPersonInfo;
    }

    @JsonProperty("createdAtInfo")
    public CreatedAtInfo getCreatedAtInfo() {
        return createdAtInfo;
    }

    @JsonProperty("createdAtInfo")
    public void setCreatedAtInfo(CreatedAtInfo createdAtInfo) {
        this.createdAtInfo = createdAtInfo;
    }

    @JsonProperty("isPublished")
    public Boolean getIsPublished() {
        return isPublished;
    }

    @JsonProperty("isPublished")
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    @JsonProperty("isFeatured")
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    @JsonProperty("isFeatured")
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    @JsonProperty("isPasswordProtected")
    public Boolean getIsPasswordProtected() {
        return isPasswordProtected;
    }

    @JsonProperty("isPasswordProtected")
    public void setIsPasswordProtected(Boolean isPasswordProtected) {
        this.isPasswordProtected = isPasswordProtected;
    }

    @JsonProperty("eventStatus")
    public String getEventStatus() {
        return eventStatus;
    }

    @JsonProperty("eventStatus")
    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    @JsonProperty("venues")
    public List<Object> getVenues() {
        return venues;
    }

    @JsonProperty("venues")
    public void setVenues(List<Object> venues) {
        this.venues = venues;
    }

    @JsonProperty("slotsData")
    public List<Object> getSlotsData() {
        return slotsData;
    }

    @JsonProperty("slotsData")
    public void setSlotsData(List<Object> slotsData) {
        this.slotsData = slotsData;
    }

    @JsonProperty("supportedCurrencies")
    public List<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    @JsonProperty("supportedCurrencies")
    public void setSupportedCurrencies(List<String> supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    @JsonProperty("localCurrencies")
    public Object getLocalCurrencies() {
        return localCurrencies;
    }

    @JsonProperty("localCurrencies")
    public void setLocalCurrencies(Object localCurrencies) {
        this.localCurrencies = localCurrencies;
    }

    @JsonProperty("multiCategoryList")
    public List<List<String>> getMultiCategoryList() {
        return multiCategoryList;
    }

    @JsonProperty("multiCategoryList")
    public void setMultiCategoryList(List<List<String>> multiCategoryList) {
        this.multiCategoryList = multiCategoryList;
    }

    @JsonProperty("eventCategories")
    public List<String> getEventCategories() {
        return eventCategories;
    }

    @JsonProperty("eventCategories")
    public void setEventCategories(List<String> eventCategories) {
        this.eventCategories = eventCategories;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonProperty("searchableCategoryList")
    public List<String> getSearchableCategoryList() {
        return searchableCategoryList;
    }

    @JsonProperty("searchableCategoryList")
    public void setSearchableCategoryList(List<String> searchableCategoryList) {
        this.searchableCategoryList = searchableCategoryList;
    }

    @JsonProperty("parentCategories")
    public List<Object> getParentCategories() {
        return parentCategories;
    }

    @JsonProperty("parentCategories")
    public void setParentCategories(List<Object> parentCategories) {
        this.parentCategories = parentCategories;
    }

    @JsonProperty("tags")
    public Object getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Object tags) {
        this.tags = tags;
    }

    @JsonProperty("eventSoldPercentage")
    public Integer getEventSoldPercentage() {
        return eventSoldPercentage;
    }

    @JsonProperty("eventSoldPercentage")
    public void setEventSoldPercentage(Integer eventSoldPercentage) {
        this.eventSoldPercentage = eventSoldPercentage;
    }

    @JsonProperty("passSoldPercentage")
    public Integer getPassSoldPercentage() {
        return passSoldPercentage;
    }

    @JsonProperty("passSoldPercentage")
    public void setPassSoldPercentage(Integer passSoldPercentage) {
        this.passSoldPercentage = passSoldPercentage;
    }

    @JsonProperty("isDraft")
    public Boolean getIsDraft() {
        return isDraft;
    }

    @JsonProperty("isDraft")
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    @JsonProperty("customSeatingPlan")
    public Boolean getCustomSeatingPlan() {
        return customSeatingPlan;
    }

    @JsonProperty("customSeatingPlan")
    public void setCustomSeatingPlan(Boolean customSeatingPlan) {
        this.customSeatingPlan = customSeatingPlan;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("_id")
    public String get_id() {
        return _id;
    }

    @JsonProperty("_id")
    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("organizationId")
    public String getOrganizationId() {
        return organizationId;
    }

    @JsonProperty("organizationId")
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("parentEvent")
    public String getParentEvent() {
        return parentEvent;
    }

    @JsonProperty("parentEvent")
    public void setParentEvent(String parentEvent) {
        this.parentEvent = parentEvent;
    }

    @JsonProperty("imdbUrl")
    public Object getImdbUrl() {
        return imdbUrl;
    }

    @JsonProperty("imdbUrl")
    public void setImdbUrl(Object imdbUrl) {
        this.imdbUrl = imdbUrl;
    }

    @JsonProperty("youtubeLink")
    public Object getYoutubeLink() {
        return youtubeLink;
    }

    @JsonProperty("youtubeLink")
    public void setYoutubeLink(Object youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    @JsonProperty("customURLs")
    public Object getCustomURLs() {
        return customURLs;
    }

    @JsonProperty("customURLs")
    public void setCustomURLs(Object customURLs) {
        this.customURLs = customURLs;
    }

    @JsonProperty("galleryImages")
    public Object getGalleryImages() {
        return galleryImages;
    }

    @JsonProperty("galleryImages")
    public void setGalleryImages(Object galleryImages) {
        this.galleryImages = galleryImages;
    }

    @JsonProperty("seatingType")
    public String getSeatingType() {
        return seatingType;
    }

    @JsonProperty("seatingType")
    public void setSeatingType(String seatingType) {
        this.seatingType = seatingType;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("createdByName")
    public String getCreatedByName() {
        return createdByName;
    }

    @JsonProperty("createdByName")
    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    @JsonProperty("ticketClassesConfig")
    public List<TicketClassesConfig> getTicketClassesConfig() {
        return ticketClassesConfig;
    }

    @JsonProperty("ticketClassesConfig")
    public void setTicketClassesConfig(List<TicketClassesConfig> ticketClassesConfig) {
        this.ticketClassesConfig = ticketClassesConfig;
    }

    @JsonProperty("passConfigs")
    public List<Object> getPassConfigs() {
        return passConfigs;
    }

    @JsonProperty("passConfigs")
    public void setPassConfigs(List<Object> passConfigs) {
        this.passConfigs = passConfigs;
    }

    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("__v")
    public Integer get__v() {
        return __v;
    }

    @JsonProperty("__v")
    public void set__v(Integer __v) {
        this.__v = __v;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bannerImageKey");
        sb.append('=');
        sb.append(((this.bannerImageKey == null)?"<null>":this.bannerImageKey));
        sb.append(',');
        sb.append("contactPersonInfo");
        sb.append('=');
        sb.append(((this.contactPersonInfo == null)?"<null>":this.contactPersonInfo));
        sb.append(',');
        sb.append("createdAtInfo");
        sb.append('=');
        sb.append(((this.createdAtInfo == null)?"<null>":this.createdAtInfo));
        sb.append(',');
        sb.append("isPublished");
        sb.append('=');
        sb.append(((this.isPublished == null)?"<null>":this.isPublished));
        sb.append(',');
        sb.append("isFeatured");
        sb.append('=');
        sb.append(((this.isFeatured == null)?"<null>":this.isFeatured));
        sb.append(',');
        sb.append("isPasswordProtected");
        sb.append('=');
        sb.append(((this.isPasswordProtected == null)?"<null>":this.isPasswordProtected));
        sb.append(',');
        sb.append("eventStatus");
        sb.append('=');
        sb.append(((this.eventStatus == null)?"<null>":this.eventStatus));
        sb.append(',');
        sb.append("venues");
        sb.append('=');
        sb.append(((this.venues == null)?"<null>":this.venues));
        sb.append(',');
        sb.append("slotsData");
        sb.append('=');
        sb.append(((this.slotsData == null)?"<null>":this.slotsData));
        sb.append(',');
        sb.append("supportedCurrencies");
        sb.append('=');
        sb.append(((this.supportedCurrencies == null)?"<null>":this.supportedCurrencies));
        sb.append(',');
        sb.append("localCurrencies");
        sb.append('=');
        sb.append(((this.localCurrencies == null)?"<null>":this.localCurrencies));
        sb.append(',');
        sb.append("multiCategoryList");
        sb.append('=');
        sb.append(((this.multiCategoryList == null)?"<null>":this.multiCategoryList));
        sb.append(',');
        sb.append("eventCategories");
        sb.append('=');
        sb.append(((this.eventCategories == null)?"<null>":this.eventCategories));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("searchableCategoryList");
        sb.append('=');
        sb.append(((this.searchableCategoryList == null)?"<null>":this.searchableCategoryList));
        sb.append(',');
        sb.append("parentCategories");
        sb.append('=');
        sb.append(((this.parentCategories == null)?"<null>":this.parentCategories));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("eventSoldPercentage");
        sb.append('=');
        sb.append(((this.eventSoldPercentage == null)?"<null>":this.eventSoldPercentage));
        sb.append(',');
        sb.append("passSoldPercentage");
        sb.append('=');
        sb.append(((this.passSoldPercentage == null)?"<null>":this.passSoldPercentage));
        sb.append(',');
        sb.append("isDraft");
        sb.append('=');
        sb.append(((this.isDraft == null)?"<null>":this.isDraft));
        sb.append(',');
        sb.append("customSeatingPlan");
        sb.append('=');
        sb.append(((this.customSeatingPlan == null)?"<null>":this.customSeatingPlan));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("_id");
        sb.append('=');
        sb.append(((this._id == null)?"<null>":this._id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("organizationId");
        sb.append('=');
        sb.append(((this.organizationId == null)?"<null>":this.organizationId));
        sb.append(',');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("parentEvent");
        sb.append('=');
        sb.append(((this.parentEvent == null)?"<null>":this.parentEvent));
        sb.append(',');
        sb.append("imdbUrl");
        sb.append('=');
        sb.append(((this.imdbUrl == null)?"<null>":this.imdbUrl));
        sb.append(',');
        sb.append("youtubeLink");
        sb.append('=');
        sb.append(((this.youtubeLink == null)?"<null>":this.youtubeLink));
        sb.append(',');
        sb.append("customURLs");
        sb.append('=');
        sb.append(((this.customURLs == null)?"<null>":this.customURLs));
        sb.append(',');
        sb.append("galleryImages");
        sb.append('=');
        sb.append(((this.galleryImages == null)?"<null>":this.galleryImages));
        sb.append(',');
        sb.append("seatingType");
        sb.append('=');
        sb.append(((this.seatingType == null)?"<null>":this.seatingType));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("createdByName");
        sb.append('=');
        sb.append(((this.createdByName == null)?"<null>":this.createdByName));
        sb.append(',');
        sb.append("ticketClassesConfig");
        sb.append('=');
        sb.append(((this.ticketClassesConfig == null)?"<null>":this.ticketClassesConfig));
        sb.append(',');
        sb.append("passConfigs");
        sb.append('=');
        sb.append(((this.passConfigs == null)?"<null>":this.passConfigs));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null)?"<null>":this.created_at));
        sb.append(',');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("__v");
        sb.append('=');
        sb.append(((this.__v == null)?"<null>":this.__v));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
