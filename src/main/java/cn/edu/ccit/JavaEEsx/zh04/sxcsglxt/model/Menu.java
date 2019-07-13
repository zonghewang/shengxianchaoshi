package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class Menu {
    private Long pkMid;

    private String menuName;

    private Long menuMid;

    private Byte isParent;

    private String menuUrl;

    public Long getPkMid() {
        return pkMid;
    }

    public void setPkMid(Long pkMid) {
        this.pkMid = pkMid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Long getMenuMid() {
        return menuMid;
    }

    public void setMenuMid(Long menuMid) {
        this.menuMid = menuMid;
    }

    public Byte getIsParent() {
        return isParent;
    }

    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }
}