package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.Date;

public class Storehouse {
    private Long pkSid;

    private String storehouseName;

    private Long pkPid;

    private Integer storehouseNum;

    private Date storehouseTime;

    private Integer storehouseMin;

    private Integer storehouseMax;

    public Long getPkSid() {
        return pkSid;
    }

    public void setPkSid(Long pkSid) {
        this.pkSid = pkSid;
    }

    public String getStorehouseName() {
        return storehouseName;
    }

    public void setStorehouseName(String storehouseName) {
        this.storehouseName = storehouseName == null ? null : storehouseName.trim();
    }

    public Long getPkPid() {
        return pkPid;
    }

    public void setPkPid(Long pkPid) {
        this.pkPid = pkPid;
    }

    public Integer getStorehouseNum() {
        return storehouseNum;
    }

    public void setStorehouseNum(Integer storehouseNum) {
        this.storehouseNum = storehouseNum;
    }

    public Date getStorehouseTime() {
        return storehouseTime;
    }

    public void setStorehouseTime(Date storehouseTime) {
        this.storehouseTime = storehouseTime;
    }

    public Integer getStorehouseMin() {
        return storehouseMin;
    }

    public void setStorehouseMin(Integer storehouseMin) {
        this.storehouseMin = storehouseMin;
    }

    public Integer getStorehouseMax() {
        return storehouseMax;
    }

    public void setStorehouseMax(Integer storehouseMax) {
        this.storehouseMax = storehouseMax;
    }
}