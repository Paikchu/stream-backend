package com.db.stream.entity;
import java.io.Serializable;
import java.util.Date;

public class Order {
    private Integer oid;
    private Integer o_gid;
    private Integer o_uid;
    private Double o_value;
    private Date o_time;
    private Integer g_id;
    private String g_name;
    private String g_intro;
    private Date g_release_date;
    private double g_price;
    private String g_tag;
    private Integer g_cid;

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public void setO_gid(Integer o_gid) {
        this.o_gid = o_gid;
    }

    public void setO_uid(Integer o_uid) {
        this.o_uid = o_uid;
    }

    public void setO_value(Double o_value) {
        this.o_value = o_value;
    }

    public void setO_time(Date o_time) {
        this.o_time = o_time;
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

    public Integer getOid() {
        return oid;
    }

    public Integer getO_gid() {
        return o_gid;
    }

    public Integer getO_uid() {
        return o_uid;
    }

    public Double getO_value() {
        return o_value;
    }

    public Date getO_time() {
        return o_time;
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
    public Order(Integer oid, Integer o_gid, Integer o_uid, Double o_value, Date o_time, Integer g_id, String g_name, String g_intro, Date g_release_date, double g_price, String g_tag, Integer g_cid) {
        this.oid = oid;
        this.o_gid = o_gid;
        this.o_uid = o_uid;
        this.o_value = o_value;
        this.o_time = o_time;
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_intro = g_intro;
        this.g_release_date = g_release_date;
        this.g_price = g_price;
        this.g_tag = g_tag;
        this.g_cid = g_cid;
    }
}
