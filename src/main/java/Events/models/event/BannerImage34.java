
package Events.models.event;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class BannerImage34 implements Serializable
{

    private Object imageKey;
    private Object imageUrl;
    private final static long serialVersionUID = 2213728641988373368L;

    public Object getImageKey(Object o) {
        return imageKey;
    }

    public void setImageKey(Object imageKey) {
        this.imageKey = imageKey;
    }

    public Object getImageUrl(Object o) {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BannerImage34 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
