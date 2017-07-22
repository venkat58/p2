package apps.awesome.vv.com.vvsimpleaio.adapters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by venkat on 19-06-2017.
 */

public class SubListPojo implements Serializable {

    @SerializedName("webLink")
    @Expose
    private String webLink;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("apkPath")
    @Expose
    private String apkPath;

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApkPath() {
        return apkPath;
    }

    public void setApkPath(String apkPath) {
        this.apkPath = apkPath;
    }
    
}
