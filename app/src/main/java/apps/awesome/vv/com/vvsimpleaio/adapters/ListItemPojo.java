package apps.awesome.vv.com.vvsimpleaio.adapters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by venkat on 19-06-2017.
 */

public class ListItemPojo implements Serializable {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("result")
    @Expose
    private List<SubListPojo> result = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubListPojo> getResult() {
        return result;
    }

    public void setResult(List<SubListPojo> result) {
        this.result = result;
    }

}
