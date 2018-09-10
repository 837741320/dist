package com.qfedu.pojo;

public class Order {
    private Integer orederId;

    private Integer userId;

    private Integer brokerId;

    private Integer houseId;

    private String price;

    private Integer state;

    public Integer getOrederId() {
        return orederId;
    }

    public void setOrederId(Integer orederId) {
        this.orederId = orederId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}