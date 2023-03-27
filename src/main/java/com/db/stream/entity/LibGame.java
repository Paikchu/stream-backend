package com.db.stream.entity;
import java.io.Serializable;
import java.util.Date;

public class LibGame {
    private Integer lib_uid;
    private Integer lib_gid;
    public Integer getlib_uid() {
        return lib_uid;
    }
    public void setlib_uid(Integer lib_uid) {
        this.lib_uid = lib_uid;
    }
    public Integer getlib_gid() {
        return lib_gid;
    }
    public void setlib_gid(Integer lib_gid) {
        this.lib_gid = lib_gid;
    }

    private Integer g_id;
    private String g_name;
    private String g_intro;
    private Date g_release_date;
    private double g_price;
    private String g_tag;
    private Integer g_cid;

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

    public String getG_intro() {
        return g_intro;
    }

    public void setG_intro(String g_intro) {
        this.g_intro = g_intro;
    }

    public Date getG_release_date() {
        return g_release_date;
    }

    public void setG_release_date(Date g_release_date) {
        this.g_release_date = g_release_date;
    }

    public double getG_price() {
        return g_price;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    public String getG_tag() {
        return g_tag;
    }

    public void setG_tag(String g_tag) {
        this.g_tag = g_tag;
    }

    public Integer getG_cid() {
        return g_cid;
    }

    public void setG_cid(Integer g_cid) {
        this.g_cid = g_cid;
    }

    public LibGame(Integer lib_uid,Integer lib_gid,Integer g_id, String g_name, String g_intro, Date g_release_date, double g_price, String g_tag, Integer g_cid){
        this.lib_uid = lib_uid;
        this.lib_gid = lib_gid;
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_intro = g_intro;
        this.g_release_date = g_release_date;
        this.g_price = g_price;
        this.g_tag = g_tag;
        this.g_cid = g_cid;

    }
}
