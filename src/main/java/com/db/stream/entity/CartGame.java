package com.db.stream.entity;

import java.util.Date;

public class CartGame {
    private Integer cart_uid;
    private Integer cart_gid;
    private Integer g_id;
    private String g_name;
    private String g_intro;
    private Date g_release_date;
    private double g_price;
    private String g_tag;
    private Integer g_cid;

    public CartGame(Integer cart_uid, Integer cart_gid, Integer g_id, String g_name, String g_intro, Date g_release_date, double g_price, String g_tag, Integer g_cid) {
        this.cart_uid = cart_uid;
        this.cart_gid = cart_gid;
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_intro = g_intro;
        this.g_release_date = g_release_date;
        this.g_price = g_price;
        this.g_tag = g_tag;
        this.g_cid = g_cid;
    }

    public Integer getCart_uid() {
        return cart_uid;
    }

    public Integer getCart_gid() {
        return cart_gid;
    }

    public Integer getG_id() {
        return g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public String getG_intro() {
        return g_intro;
    }

    public Date getG_release_date() {
        return g_release_date;
    }

    public double getG_price() {
        return g_price;
    }

    public String getG_tag() {
        return g_tag;
    }

    public Integer getG_cid() {
        return g_cid;
    }

    public void setCart_uid(Integer cart_uid) {
        this.cart_uid = cart_uid;
    }

    public void setCart_gid(Integer cart_gid) {
        this.cart_gid = cart_gid;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public void setG_intro(String g_intro) {
        this.g_intro = g_intro;
    }

    public void setG_release_date(Date g_release_date) {
        this.g_release_date = g_release_date;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    public void setG_tag(String g_tag) {
        this.g_tag = g_tag;
    }

    public void setG_cid(Integer g_cid) {
        this.g_cid = g_cid;
    }



}
