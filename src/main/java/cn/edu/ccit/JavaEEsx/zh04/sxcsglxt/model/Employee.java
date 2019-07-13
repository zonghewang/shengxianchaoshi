package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model;

public class Employee {
    private Long pkEid;

    private Long pkUid;

    private String empNo;

    private String empName;

    private Byte empSex;

    private Byte empAge;

    private String empTel;

    public Long getPkEid() {
        return pkEid;
    }

    public void setPkEid(Long pkEid) {
        this.pkEid = pkEid;
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Byte getEmpSex() {
        return empSex;
    }

    public void setEmpSex(Byte empSex) {
        this.empSex = empSex;
    }

    public Byte getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Byte empAge) {
        this.empAge = empAge;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel == null ? null : empTel.trim();
    }
}