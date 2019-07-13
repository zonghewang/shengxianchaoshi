package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SalesOrder {
    private Long pkSoid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date salesOrderTime;

    private Long pkUid;

    private Long salesOrderPay;

    private Long pkCid;

    private String salesOrderInfo;

    public Long getPkSoid() {
        return pkSoid;
    }

    public void setPkSoid(Long pkSoid) {
        this.pkSoid = pkSoid;
    }

    public Date getSalesOrderTime() {
        return salesOrderTime;
    }

    public void setSalesOrderTime(Date salesOrderTime) {
        this.salesOrderTime = salesOrderTime;
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public Long getSalesOrderPay() {
        return salesOrderPay;
    }

    public void setSalesOrderPay(Long salesOrderPay) {
        this.salesOrderPay = salesOrderPay;
    }

    public Long getPkCid() {
        return pkCid;
    }

    public void setPkCid(Long pkCid) {
        this.pkCid = pkCid;
    }

    public String getSalesOrderInfo() {
        return salesOrderInfo;
    }

    public void setSalesOrderInfo(String salesOrderInfo) {
        this.salesOrderInfo = salesOrderInfo == null ? null : salesOrderInfo.trim();
    }
}