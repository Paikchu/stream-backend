package com.db.stream.entity;

public class Company {
    private Integer c_id;
    private String c_name;
    private String c_email;
    private String c_pd;
    private Integer c_permission;

    public Company(Integer c_id, String c_name, String c_email, String c_pd, Integer c_permission) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_email = c_email;
        this.c_pd = c_pd;
        this.c_permission = c_permission;
    }

    public Company() {
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public String getC_pd() {
        return c_pd;
    }

    public void setC_pd(String c_pd) {
        this.c_pd = c_pd;
    }

    public Integer getC_permission() {
        return c_permission;
    }

    public void setC_permission(Integer c_permission) {
        this.c_permission = c_permission;
    }
}
