
package Events.models.event;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class BannerImageKey implements Serializable
{

    private String imageKey;
    private String imageUrl;
    private final static long serialVersionUID = -4099557860515721364L;

    public String getImageKey() {
        return imageKey;
    }

    public void setImageKey(String imageKey) {
        this.imageKey = imageKey;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BannerImageKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("imageKey");
        sb.append('=');
        sb.append(((this.imageKey == null)?"<null>":this.imageKey));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
