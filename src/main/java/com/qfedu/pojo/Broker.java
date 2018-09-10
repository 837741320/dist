package com.qfedu.pojo;

public class Broker {
    private Integer brokerId;

    private String username;

    private String passowrd;

    private Integer companyId;

    private String brokerNickname;

    private String brokerRealname;

    private String brokerIdcar;

    private String brokerEmail;

    private String brokerCode;

    private Integer brokerComplain;

    private Integer brokerBlacklist;

    private Integer brokerDeal;

    private Integer brokerCredit;

    private Integer state;

    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd == null ? null : passowrd.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getBrokerNickname() {
        return brokerNickname;
    }

    public void setBrokerNickname(String brokerNickname) {
        this.brokerNickname = brokerNickname == null ? null : brokerNickname.trim();
    }

    public String getBrokerRealname() {
        return brokerRealname;
    }

    public void setBrokerRealname(String brokerRealname) {
        this.brokerRealname = brokerRealname == null ? null : brokerRealname.trim();
    }

    public String getBrokerIdcar() {
        return brokerIdcar;
    }

    public void setBrokerIdcar(String brokerIdcar) {
        this.brokerIdcar = brokerIdcar == null ? null : brokerIdcar.trim();
    }

    public String getBrokerEmail() {
        return brokerEmail;
    }

    public void setBrokerEmail(String brokerEmail) {
        this.brokerEmail = brokerEmail == null ? null : brokerEmail.trim();
    }

    public String getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode == null ? null : brokerCode.trim();
    }

    public Integer getBrokerComplain() {
        return brokerComplain;
    }

    public void setBrokerComplain(Integer brokerComplain) {
        this.brokerComplain = brokerComplain;
    }

    public Integer getBrokerBlacklist() {
        return brokerBlacklist;
    }

    public void setBrokerBlacklist(Integer brokerBlacklist) {
        this.brokerBlacklist = brokerBlacklist;
    }

    public Integer getBrokerDeal() {
        return brokerDeal;
    }

    public void setBrokerDeal(Integer brokerDeal) {
        this.brokerDeal = brokerDeal;
    }

    public Integer getBrokerCredit() {
        return brokerCredit;
    }

    public void setBrokerCredit(Integer brokerCredit) {
        this.brokerCredit = brokerCredit;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}