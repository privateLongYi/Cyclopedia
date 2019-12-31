package com.qing.entity;

import java.io.Serializable;

public class CyContent implements Serializable {
    private Integer cyContentId;

    private String cyEntryname;

    private String cyDetails;

    private String cyImgurl;

    private Integer cyType;

    private Integer cyIspush;

    @Override
    public String toString() {
        return "CyContent{" +
                "cyContentId=" + cyContentId +
                ", cyEntryname='" + cyEntryname + '\'' +
                ", cyDetails='" + cyDetails + '\'' +
                ", cyImgurl='" + cyImgurl + '\'' +
                ", cyType=" + cyType +
                ", cyIspush=" + cyIspush +
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
        this.cyEntryname = cyEntryname;
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

    public Integer getCyType() {
        return cyType;
    }

    public void setCyType(Integer cyType) {
        this.cyType = cyType;
    }

    public Integer getCyIspush() {
        return cyIspush;
    }

    public void setCyIspush(Integer cyIspush) {
        this.cyIspush = cyIspush;
    }
}