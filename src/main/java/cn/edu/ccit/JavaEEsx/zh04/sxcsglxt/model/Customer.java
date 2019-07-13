package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Customer {
    private Long pkCid;

    private String customerName;

    private Byte customerAge;

    private Byte customerSex;

    private String customerIdNo;

    private String customerAddr;

    private String customerTel;

    private Byte isVip;

    private String vipNo;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date vipDate;

    private String vipWhoUse;

    private Integer vipGread;

    private String vipPcid;

    public Long getPkCid() {
        return pkCid;
    }

    public void setPkCid(Long pkCid) {
        this.pkCid = pkCid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Byte getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Byte customerAge) {
        this.customerAge = customerAge;
    }

    public Byte getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Byte customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerIdNo() {
        return customerIdNo;
    }

    public void setCustomerIdNo(String customerIdNo) {
        this.customerIdNo = customerIdNo == null ? null : customerIdNo.trim();
    }

    public String getCustomerAddr() {
        return customerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr == null ? null : customerAddr.trim();
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public Byte getIsVip() {
        return isVip;
    }

    public void setIsVip(Byte isVip) {
        this.isVip = isVip;
    }

    public String getVipNo() {
        return vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo == null ? null : vipNo.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getVipDate() {
        return vipDate;
    }

    public void setVipDate(Date vipDate) {
        this.vipDate = vipDate;
    }

    public String getVipWhoUse() {
        return vipWhoUse;
    }

    public void setVipWhoUse(String vipWhoUse) {
        this.vipWhoUse = vipWhoUse == null ? null : vipWhoUse.trim();
    }

    public Integer getVipGread() {
        return vipGread;
    }

    public void setVipGread(Integer vipGread) {
        this.vipGread = vipGread;
    }

    public String getVipPcid() {
        return vipPcid;
    }

    public void setVipPcid(String vipPcid) {
        this.vipPcid = vipPcid == null ? null : vipPcid.trim();
    }
}