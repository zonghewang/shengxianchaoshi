package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class Product {
    private Long pkPid;

    private String productCategoryName;

    private Integer productCategoryNum;

    private Long productCategoryPrice;

    private Long vipPrice;

    private Long pkPcid;

    public Long getPkPid() {
        return pkPid;
    }

    public void setPkPid(Long pkPid) {
        this.pkPid = pkPid;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    public Integer getProductCategoryNum() {
        return productCategoryNum;
    }

    public void setProductCategoryNum(Integer productCategoryNum) {
        this.productCategoryNum = productCategoryNum;
    }

    public Long getProductCategoryPrice() {
        return productCategoryPrice;
    }

    public void setProductCategoryPrice(Long productCategoryPrice) {
        this.productCategoryPrice = productCategoryPrice;
    }

    public Long getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Long vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Long getPkPcid() {
        return pkPcid;
    }

    public void setPkPcid(Long pkPcid) {
        this.pkPcid = pkPcid;
    }
}