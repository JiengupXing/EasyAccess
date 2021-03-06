package com.example.easyaccess.Item;
import com.example.easyaccess.utils.NetworkImageUtils;

import static com.example.easyaccess.utils.NetworkImageUtils.networkImageLoad;
public class DownloadItem {
    private String name;
    private String desc;
    private String iconUrl;
    private String downloadUrl;
    private String belongToCourse;
    private NetworkImageUtils networkImageUtils;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getBelongToCourse() {
        return belongToCourse;
    }

    public void setBelongToCourse(String belongToCourse) {
        this.belongToCourse = belongToCourse;
    }
}


