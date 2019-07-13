package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class SupplierProduct {
    private Long pkSpid;

    private String supplierName;

    private String supplierTel;

    private Long pkPid;

    private String supplierAddr;

    public Long getPkSpid() {
        return pkSpid;
    }

    public void setPkSpid(Long pkSpid) {
        this.pkSpid = pkSpid;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierTel() {
        return supplierTel;
    }

    public void setSupplierTel(String supplierTel) {
        this.supplierTel = supplierTel == null ? null : supplierTel.trim();
    }

    public Long getPkPid() {
        return pkPid;
    }

    public void setPkPid(Long pkPid) {
        this.pkPid = pkPid;
    }

    public String getSupplierAddr() {
        return supplierAddr;
    }

    public void setSupplierAddr(String supplierAddr) {
        this.supplierAddr = supplierAddr == null ? null : supplierAddr.trim();
    }
}