
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
    "_id",
    "parentId",
    "positionNo",
    "title",
    "key",
    "value",
    "children",
    "createdAt",
    "uuid",
    "name",
    "tags",
    "iconImageKey",
    "imageKey",
    "createdBy"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("parentId")
    private Object parentId;
    @JsonProperty("positionNo")
    private Integer positionNo;
    @JsonProperty("title")
    private String title;
    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private String value;
    @JsonProperty("children")
    private List<String> children = null;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("iconImageKey")
    private IconImageKey iconImageKey;
    @JsonProperty("imageKey")
    private ImageKey imageKey;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("parentId")
    public Object getParentId() {
        return parentId;
    }

    @JsonProperty("parentId")
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("positionNo")
    public Integer getPositionNo() {
        return positionNo;
    }

    @JsonProperty("positionNo")
    public void setPositionNo(Integer positionNo) {
        this.positionNo = positionNo;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("children")
    public List<String> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<String> children) {
        this.children = children;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("iconImageKey")
    public IconImageKey getIconImageKey() {
        return iconImageKey;
    }

    @JsonProperty("iconImageKey")
    public void setIconImageKey(IconImageKey iconImageKey) {
        this.iconImageKey = iconImageKey;
    }

    @JsonProperty("imageKey")
    public ImageKey getImageKey() {
        return imageKey;
    }

    @JsonProperty("imageKey")
    public void setImageKey(ImageKey imageKey) {
        this.imageKey = imageKey;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
