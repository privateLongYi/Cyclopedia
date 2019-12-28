package com.qing.entity;

import java.io.Serializable;

public class CyClassify implements Serializable {
    private Integer cyClassifyId;

    private String cyType;

    @Override
    public String toString() {
        return "CyClassify{" +
                "cyClassifyId=" + cyClassifyId +
                ", cyType='" + cyType + '\'' +
                '}';
    }

    public Integer getCyClassifyId() {
        return cyClassifyId;
    }

    public void setCyClassifyId(Integer cyClassifyId) {
        this.cyClassifyId = cyClassifyId;
    }

    public String getCyType() {
        return cyType;
    }

    public void setCyType(String cyType) {
        this.cyType = cyType == null ? null : cyType.trim();
    }
}