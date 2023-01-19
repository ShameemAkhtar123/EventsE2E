
package Events.models.event;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class EventsPayload implements Serializable
{

    private String title;
    private String organizationId;
    private String eventType;
    private List<List<String>> eventCategories = null;
    private String currency;
    private String description;
    private Object parentEvent;
    private boolean isSave;
    private List<Object> tags = null;
    private String imdbUrl;
    private Object youtubeLink;
    private List<Object> customURLs = null;
    private ContactPersonInfo contactPersonInfo;
    private BannerImageKey bannerImageKey;
    private BannerImage34 bannerImage34;
    private BannerImage916 bannerImage916;
    private List<Object> galleryImages = null;
    private List<Object> speakers = null;
    private boolean isPasswordProtected;
    private List<String> localCurrencies = null;
    private boolean customSeatingPlan;
    private String seatingType;
    private List<String> supportedCurrencies = null;
    private final static long serialVersionUID = 4027422440577276847L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<List<String>> getEventCategories() {
        return eventCategories;
    }

    public void setEventCategories(List<List<String>> eventCategories) {
        this.eventCategories = eventCategories;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getParentEvent() {
        return parentEvent;
    }

    public void setParentEvent(Object parentEvent) {
        this.parentEvent = parentEvent;
    }

    public boolean isIsSave() {
        return isSave;
    }

    public void setIsSave(boolean isSave) {
        this.isSave = isSave;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getImdbUrl() {
        return imdbUrl;
    }

    public void setImdbUrl(String imdbUrl) {
        this.imdbUrl = imdbUrl;
    }

    public Object getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(Object youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public List<Object> getCustomURLs() {
        return customURLs;
    }

    public void setCustomURLs(List<Object> customURLs) {
        this.customURLs = customURLs;
    }

    public ContactPersonInfo getContactPersonInfo() {
        return contactPersonInfo;
    }

    public void setContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        this.contactPersonInfo = contactPersonInfo;
    }

    public BannerImageKey getBannerImageKey() {
        return bannerImageKey;
    }

    public void setBannerImageKey(BannerImageKey bannerImageKey) {
        this.bannerImageKey = bannerImageKey;
    }

    public BannerImage34 getBannerImage34(BannerImage34 bannerImage34) {
        return this.bannerImage34;
    }

    public void setBannerImage34(BannerImage34 bannerImage34) {
        this.bannerImage34 = bannerImage34;
    }

    public BannerImage916 getBannerImage916() {
        return bannerImage916;
    }

    public void setBannerImage916(BannerImage916 bannerImage916) {
        this.bannerImage916 = bannerImage916;
    }

    public List<Object> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(List<Object> galleryImages) {
        this.galleryImages = galleryImages;
    }

    public List<Object> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Object> speakers) {
        this.speakers = speakers;
    }

    public boolean isIsPasswordProtected() {
        return isPasswordProtected;
    }

    public void setIsPasswordProtected(boolean isPasswordProtected) {
        this.isPasswordProtected = isPasswordProtected;
    }

    public List<String> getLocalCurrencies() {
        return localCurrencies;
    }

    public void setLocalCurrencies(List<String> localCurrencies) {
        this.localCurrencies = localCurrencies;
    }

    public boolean isCustomSeatingPlan() {
        return customSeatingPlan;
    }

    public void setCustomSeatingPlan(boolean customSeatingPlan) {
        this.customSeatingPlan = customSeatingPlan;
    }

    public String getSeatingType() {
        return seatingType;
    }

    public void setSeatingType(String seatingType) {
        this.seatingType = seatingType;
    }

    public List<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    public void setSupportedCurrencies(List<String> supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventsPayload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("eventCategories");
        sb.append('=');
        sb.append(((this.eventCategories == null)?"<null>":this.eventCategories));
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
        sb.append("isSave");
        sb.append('=');
        sb.append(this.isSave);
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        sb.append("contactPersonInfo");
        sb.append('=');
        sb.append(((this.contactPersonInfo == null)?"<null>":this.contactPersonInfo));
        sb.append(',');
        sb.append("bannerImageKey");
        sb.append('=');
        sb.append(((this.bannerImageKey == null)?"<null>":this.bannerImageKey));
        sb.append(',');
        sb.append("bannerImage34");
        sb.append('=');
        sb.append(((this.bannerImage34 == null)?"<null>":this.bannerImage34));
        sb.append(',');
        sb.append("bannerImage916");
        sb.append('=');
        sb.append(((this.bannerImage916 == null)?"<null>":this.bannerImage916));
        sb.append(',');
        sb.append("galleryImages");
        sb.append('=');
        sb.append(((this.galleryImages == null)?"<null>":this.galleryImages));
        sb.append(',');
        sb.append("speakers");
        sb.append('=');
        sb.append(((this.speakers == null)?"<null>":this.speakers));
        sb.append(',');
        sb.append("isPasswordProtected");
        sb.append('=');
        sb.append(this.isPasswordProtected);
        sb.append(',');
        sb.append("localCurrencies");
        sb.append('=');
        sb.append(((this.localCurrencies == null)?"<null>":this.localCurrencies));
        sb.append(',');
        sb.append("customSeatingPlan");
        sb.append('=');
        sb.append(this.customSeatingPlan);
        sb.append(',');
        sb.append("seatingType");
        sb.append('=');
        sb.append(((this.seatingType == null)?"<null>":this.seatingType));
        sb.append(',');
        sb.append("supportedCurrencies");
        sb.append('=');
        sb.append(((this.supportedCurrencies == null)?"<null>":this.supportedCurrencies));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
