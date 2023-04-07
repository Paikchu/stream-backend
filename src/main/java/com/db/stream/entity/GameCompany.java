package com.db.stream.entity;

import java.sql.Date;

public class GameCompany {
    Integer g_id;
    String g_name;
    Date g_release_date;
    Double g_price;
    String g_tag;

    String c_name;

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public Date getG_release_date() {
        return g_release_date;
    }

    public void setG_release_date(Date g_release_date) {
        this.g_release_date = g_release_date;
    }

    public Double getG_price() {
        return g_price;
    }

    public void setG_price(Double g_price) {
        this.g_price = g_price;
    }

    public String getG_tag() {
        return g_tag;
    }

    public void setG_tag(String g_tag) {
        this.g_tag = g_tag;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }


    public GameCompany(Integer g_id, String g_name, Date g_release_date, Double g_price, String g_tag, String c_name) {
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_release_date = g_release_date;
        this.g_price = g_price;
        this.g_tag = g_tag;
        this.c_name = c_name;
    }




}
