package com.example.demo.or.bean;

public class Shop {
    private int id;
    private int sid;
    private String shopname;
    private String totleprice;
    private String totlenum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getTotleprice() {
        return totleprice;
    }

    public void setTotleprice(String totleprice) {
        this.totleprice = totleprice;
    }

    public String getTotlenum() {
        return totlenum;
    }

    public void setTotlenum(String totlenum) {
        this.totlenum = totlenum;
    }

    public Shop(int id, int sid, String shopname, String totleprice, String totlenum) {
        this.id = id;
        this.sid = sid;
        this.shopname = shopname;
        this.totleprice = totleprice;
        this.totlenum = totlenum;
    }

    public Shop() {
        super();
    }
}
