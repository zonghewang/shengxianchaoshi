package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OutgoingRecord {
    private Long pkOrid;

    private Long pkSid;

    private Byte isGoing;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date outgoingRecordTime;

    private Long pkBid;

    private Long pkPid;

    private Integer outgoingRecordNum;

    private Long pkUid;

    private String outgoingRecordResult;

    public Long getPkOrid() {
        return pkOrid;
    }

    public void setPkOrid(Long pkOrid) {
        this.pkOrid = pkOrid;
    }

    public Long getPkSid() {
        return pkSid;
    }

    public void setPkSid(Long pkSid) {
        this.pkSid = pkSid;
    }

    public Byte getIsGoing() {
        return isGoing;
    }

    public void setIsGoing(Byte isGoing) {
        this.isGoing = isGoing;
    }

    public Date getOutgoingRecordTime() {
        return outgoingRecordTime;
    }

    public void setOutgoingRecordTime(Date outgoingRecordTime) {
        this.outgoingRecordTime = outgoingRecordTime;
    }

    public Long getPkBid() {
        return pkBid;
    }

    public void setPkBid(Long pkBid) {
        this.pkBid = pkBid;
    }

    public Long getPkPid() {
        return pkPid;
    }

    public void setPkPid(Long pkPid) {
        this.pkPid = pkPid;
    }

    public Integer getOutgoingRecordNum() {
        return outgoingRecordNum;
    }

    public void setOutgoingRecordNum(Integer outgoingRecordNum) {
        this.outgoingRecordNum = outgoingRecordNum;
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public String getOutgoingRecordResult() {
        return outgoingRecordResult;
    }

    public void setOutgoingRecordResult(String outgoingRecordResult) {
        this.outgoingRecordResult = outgoingRecordResult == null ? null : outgoingRecordResult.trim();
    }
}