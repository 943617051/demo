package com.example.demo.or.bean;

public class Tuan {
        private  int id;
        private  int sid;
        private String titlename;
        private  String start_date;
        private String stop_date;
        private String sumprice;
        private String  shopnum;
        private  String  shop_stock;
        private  String jsname;

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

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStop_date() {
        return stop_date;
    }

    public void setStop_date(String stop_date) {
        this.stop_date = stop_date;
    }

    public String getSumprice() {
        return sumprice;
    }

    public void setSumprice(String sumprice) {
        this.sumprice = sumprice;
    }

    public String getShopnum() {
        return shopnum;
    }

    public void setShopnum(String shopnum) {
        this.shopnum = shopnum;
    }

    public String getShop_stock() {
        return shop_stock;
    }

    public void setShop_stock(String shop_stock) {
        this.shop_stock = shop_stock;
    }

    public String getJsname() {
        return jsname;
    }

    public void setJsname(String jsname) {
        this.jsname = jsname;
    }

    public Tuan(int id, int sid, String titlename, String start_date, String stop_date, String sumprice, String shopnum, String shop_stock, String jsname) {
        this.id = id;
        this.sid = sid;
        this.titlename = titlename;
        this.start_date = start_date;
        this.stop_date = stop_date;
        this.sumprice = sumprice;
        this.shopnum = shopnum;
        this.shop_stock = shop_stock;
        this.jsname = jsname;
    }

    public Tuan() {
        super();
    }
}
