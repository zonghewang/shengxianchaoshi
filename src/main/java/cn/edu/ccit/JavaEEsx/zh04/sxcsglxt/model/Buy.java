package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Buy {
    private Long pkBid;

    private String buyName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date buyTime;

    private Long pkUid;

    private Byte isSeasonal;

    private Byte isInStorehouse;

    private String buyInfo;

    public Long getPkBid() {
        return pkBid;
    }

    public void setPkBid(Long pkBid) {
        this.pkBid = pkBid;
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName == null ? null : buyName.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public Byte getIsSeasonal() {
        return isSeasonal;
    }

    public void setIsSeasonal(Byte isSeasonal) {
        this.isSeasonal = isSeasonal;
    }

    public Byte getIsInStorehouse() {
        return isInStorehouse;
    }

    public void setIsInStorehouse(Byte isInStorehouse) {
        this.isInStorehouse = isInStorehouse;
    }

    public String getBuyInfo() {
        return buyInfo;
    }

    public void setBuyInfo(String buyInfo) {
        this.buyInfo = buyInfo == null ? null : buyInfo.trim();
    }
}