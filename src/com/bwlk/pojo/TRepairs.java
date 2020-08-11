package com.bwlk.pojo;

public class TRepairs {
    private Integer repairid;

    private String dormbuildname;

    private Integer dormname;

    private String remarks;

    private String answer;

    private Integer flag;

    private Integer repairtel;

    private String marks;

    private String assess;

    private String repairer;

    private String piid;

    private String username;

    public Integer getRepairid() {
        return repairid;
    }

    public void setRepairid(Integer repairid) {
        this.repairid = repairid;
    }

    public String getDormbuildname() {
        return dormbuildname;
    }

    public void setDormbuildname(String dormbuildname) {
        this.dormbuildname = dormbuildname == null ? null : dormbuildname.trim();
    }

    public Integer getDormname() {
        return dormname;
    }

    public void setDormname(Integer dormname) {
        this.dormname = dormname;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getRepairtel() {
        return repairtel;
    }

    public void setRepairtel(Integer repairtel) {
        this.repairtel = repairtel;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    public String getAssess() {
        return assess;
    }

    public void setAssess(String assess) {
        this.assess = assess == null ? null : assess.trim();
    }

    public String getRepairer() {
        return repairer;
    }

    public void setRepairer(String repairer) {
        this.repairer = repairer == null ? null : repairer.trim();
    }

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid == null ? null : piid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}