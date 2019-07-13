package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Refunds {
    private Long pkReid;

    private Long pkSoid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date refundsTime;

    private Long pkCid;

    private Long pkUid;

    private String refundsResult;

    public Long getPkReid() {
        return pkReid;
    }

    public void setPkReid(Long pkReid) {
        this.pkReid = pkReid;
    }

    public Long getPkSoid() {
        return pkSoid;
    }

    public void setPkSoid(Long pkSoid) {
        this.pkSoid = pkSoid;
    }

    public Date getRefundsTime() {
        return refundsTime;
    }

    public void setRefundsTime(Date refundsTime) {
        this.refundsTime = refundsTime;
    }

    public Long getPkCid() {
        return pkCid;
    }

    public void setPkCid(Long pkCid) {
        this.pkCid = pkCid;
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public String getRefundsResult() {
        return refundsResult;
    }

    public void setRefundsResult(String refundsResult) {
        this.refundsResult = refundsResult == null ? null : refundsResult.trim();
    }
}