package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class SalesOrderInfo {
    private Long pkSoiid;

    private Long pkSoid;

    private Long pkPcid;

    private Integer salesOrderInfoNum;

    private Long salesOrderInfoPrice;

    public Long getPkSoiid() {
        return pkSoiid;
    }

    public void setPkSoiid(Long pkSoiid) {
        this.pkSoiid = pkSoiid;
    }

    public Long getPkSoid() {
        return pkSoid;
    }

    public void setPkSoid(Long pkSoid) {
        this.pkSoid = pkSoid;
    }

    public Long getPkPcid() {
        return pkPcid;
    }

    public void setPkPcid(Long pkPcid) {
        this.pkPcid = pkPcid;
    }

    public Integer getSalesOrderInfoNum() {
        return salesOrderInfoNum;
    }

    public void setSalesOrderInfoNum(Integer salesOrderInfoNum) {
        this.salesOrderInfoNum = salesOrderInfoNum;
    }

    public Long getSalesOrderInfoPrice() {
        return salesOrderInfoPrice;
    }

    public void setSalesOrderInfoPrice(Long salesOrderInfoPrice) {
        this.salesOrderInfoPrice = salesOrderInfoPrice;
    }
}