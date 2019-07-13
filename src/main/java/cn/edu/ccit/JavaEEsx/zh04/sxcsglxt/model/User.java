package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class User {
    private Long pkUid;

    private String userName;

    private String userPassword;

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}