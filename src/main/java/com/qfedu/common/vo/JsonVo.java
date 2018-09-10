package com.qfedu.common.vo;


import java.util.List;

public  class  JsonVo <T>{

    static JsonVo jsonVo;

    private int code;

    private String msg;

    private List<T> data;

    private  int oid;
    private  String username;
    private  String brokername;
    private  String brokeremail;
    private String houseprice;
    private String housename;
    private String houseinfo;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBrokername() {
        return brokername;
    }

    public void setBrokername(String brokername) {
        this.brokername = brokername;
    }

    public String getBrokeremail() {
        return brokeremail;
    }

    public void setBrokeremail(String brokeremail) {
        this.brokeremail = brokeremail;
    }

    public String getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(String houseprice) {
        this.houseprice = houseprice;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getHouseinfo() {
        return houseinfo;
    }

    public void setHouseinfo(String houseinfo) {
        this.houseinfo = houseinfo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public JsonVo(int code, String msg, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public  static <M> JsonVo R (int code,String msg,List<M> data){
        jsonVo = new JsonVo();
        jsonVo.setMsg(msg);
        jsonVo.setCode(code);
        jsonVo.setData(data);
        return jsonVo;
    }
    public JsonVo() {
    }

    @Override
    public String toString() {
        return "JsonVo{" +
                "oid=" + oid +
                ", username='" + username + '\'' +
                ", brokername='" + brokername + '\'' +
                ", brokeremail='" + brokeremail + '\'' +
                ", houseprice='" + houseprice + '\'' +
                ", housename='" + housename + '\'' +
                ", houseinfo='" + houseinfo + '\'' +
                '}';
    }
}
