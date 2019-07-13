package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class ProductCategory {
    private Long pkPcid;

    private String productCategoryName;

    private Long pid;

    public Long getPkPcid() {
        return pkPcid;
    }

    public void setPkPcid(Long pkPcid) {
        this.pkPcid = pkPcid;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}