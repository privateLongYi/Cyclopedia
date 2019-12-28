package com.qing.entity;

import java.io.Serializable;

public class CyContent implements Serializable {
    private Integer cyContentId;

    private String cyEntryname;

    private String cyImgurl;

    private Integer cyType;

    @Override
    public String toString() {
        return "CyContent{" +
                "cyContentId=" + cyContentId +
                ", cyEntryname='" + cyEntryname + '\'' +
                ", cyImgurl='" + cyImgurl + '\'' +
                ", cyType=" + cyType +
                '}';
    }

    public Integer getCyContentId() {
        return cyContentId;
    }

    public void setCyContentId(Integer cyContentId) {
        this.cyContentId = cyContentId;
    }

    public String getCyEntryname() {
        return cyEntryname;
    }

    public void setCyEntryname(String cyEntryname) {
        this.cyEntryname = cyEntryname == null ? null : cyEntryname.trim();
    }

    public String getCyImgurl() {
        return cyImgurl;
    }

    public void setCyImgurl(String cyImgurl) {
        this.cyImgurl = cyImgurl == null ? null : cyImgurl.trim();
    }

    public Integer getCyType() {
        return cyType;
    }

    public void setCyType(Integer cyType) {
        this.cyType = cyType;
    }
}