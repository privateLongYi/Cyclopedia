package com.qing.entity;

import java.io.Serializable;

public class CyClassify implements Serializable {
    private Integer cyClassifyId;

    private String cyTypeName;

    @Override
    public String toString() {
        return "CyClassify{" +
                "cyClassifyId=" + cyClassifyId +
                ", cyType='" + cyTypeName + '\'' +
                '}';
    }

    public Integer getCyClassifyId() {
        return cyClassifyId;
    }

    public void setCyClassifyId(Integer cyClassifyId) {
        this.cyClassifyId = cyClassifyId;
    }

    public String getCyType() {
        return cyTypeName;
    }

    public void setCyType(String cyType) {
        this.cyTypeName = cyType == null ? null : cyType.trim();
    }
}