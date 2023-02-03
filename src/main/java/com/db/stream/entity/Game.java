package com.db.stream.entity;

import java.io.Serializable;

public class Game implements Serializable {
    private Integer g_id;
    private String g_name;
    private String g_intro;
    private String g_rlsdate;
    private double g_price;
    private String g_tag;
    private double income;
    private Integer g_volume;
    private double g_income;
    private Integer g_compid;

    public Game(Integer g_id, String g_name, String g_intro, String g_rlsdate, double g_price, String g_tag, double income, Integer g_volume, double g_income, Integer g_compid) {
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_intro = g_intro;
        this.g_rlsdate = g_rlsdate;
        this.g_price = g_price;
        this.g_tag = g_tag;
        this.income = income;
        this.g_volume = g_volume;
        this.g_income = g_income;
        this.g_compid = g_compid;
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

    public String getG_rlsdate() {
        return g_rlsdate;
    }

    public double getG_price() {
        return g_price;
    }

    public String getG_tag() {
        return g_tag;
    }

    public double getIncome() {
        return income;
    }

    public Integer getG_volume() {
        return g_volume;
    }

    public double getG_income() {
        return g_income;
    }

    public Integer getG_compid() {
        return g_compid;
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

    public void setG_rlsdate(String g_rlsdate) {
        this.g_rlsdate = g_rlsdate;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    public void setG_tag(String g_tag) {
        this.g_tag = g_tag;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setG_volume(Integer g_volume) {
        this.g_volume = g_volume;
    }

    public void setG_income(double g_income) {
        this.g_income = g_income;
    }

    public void setG_compid(Integer g_compid) {
        this.g_compid = g_compid;
    }
}
