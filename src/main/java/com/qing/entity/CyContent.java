package com.qing.entity;

import java.io.Serializable;

public class CyContent implements Serializable {
    private Integer cyContentId;

    private String cyEntryName;

    private String cyDetails;

    private String cyImgurl;

    private Integer cyTypeName;

    private Integer cyIspush;

    @Override
    public String toString() {
        return "CyContent{" +
                "cyContentId=" + cyContentId +
                ", cyEntryname='" + cyEntryName + '\'' +
                ", cyDetails='" + cyDetails + '\'' +
                ", cyImgurl='" + cyImgurl + '\'' +
                ", cyType=" + cyTypeName +
                ", cyIspush=" + cyIspush +
                '}';
    }

    public Integer getCyContentId() {
        return cyContentId;
    }

    public void setCyContentId(Integer cyContentId) {
        this.cyContentId = cyContentId;
    }

    public String getCyEntryName() {
        return cyEntryName;
    }

    public void setCyEntryName(String cyEntryName) {
        this.cyEntryName = cyEntryName;
    }

    public String getCyDetails() {
        return cyDetails;
    }

    public void setCyDetails(String cyDetails) {
        this.cyDetails = cyDetails;
    }

    public String getCyImgurl() {
        return cyImgurl;
    }

    public void setCyImgurl(String cyImgurl) {
        this.cyImgurl = cyImgurl;
    }

    public Integer getCyTypeName() {
        return cyTypeName;
    }

    public void setCyTypeName(Integer cyTypeName) {
        this.cyTypeName = cyTypeName;
    }

    public Integer getCyIspush() {
        return cyIspush;
    }

    public void setCyIspush(Integer cyIspush) {
        this.cyIspush = cyIspush;
    }
}