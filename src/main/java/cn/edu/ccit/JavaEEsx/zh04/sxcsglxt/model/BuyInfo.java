package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class BuyInfo {
    private Long pkBiid;

    private Long pkBid;

    private Long pkPid;

    private Long pkSpid;

    private Integer buyInfoNum;

    private String buyInfoOther;

    public Long getPkBiid() {
        return pkBiid;
    }

    public void setPkBiid(Long pkBiid) {
        this.pkBiid = pkBiid;
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

    public Long getPkSpid() {
        return pkSpid;
    }

    public void setPkSpid(Long pkSpid) {
        this.pkSpid = pkSpid;
    }

    public Integer getBuyInfoNum() {
        return buyInfoNum;
    }

    public void setBuyInfoNum(Integer buyInfoNum) {
        this.buyInfoNum = buyInfoNum;
    }

    public String getBuyInfoOther() {
        return buyInfoOther;
    }

    public void setBuyInfoOther(String buyInfoOther) {
        this.buyInfoOther = buyInfoOther == null ? null : buyInfoOther.trim();
    }
}