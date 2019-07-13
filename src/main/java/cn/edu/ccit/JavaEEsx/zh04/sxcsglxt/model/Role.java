package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class Role {
    private Long pkRid;

    private String roleName;

    private String roleDescription;

    public Long getPkRid() {
        return pkRid;
    }

    public void setPkRid(Long pkRid) {
        this.pkRid = pkRid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }
}