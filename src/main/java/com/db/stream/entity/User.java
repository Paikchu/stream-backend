package com.db.stream.entity;


import java.io.Serializable;

public class User implements Serializable {
    private Integer u_id;
    private String u_name;
    private String u_email;
    private String u_pd;
    private Integer u_permission;



    public Integer getU_permission() {
        return u_permission;
    }

    public void setU_permission(Integer u_permission) {
        this.u_permission = u_permission;
    }

    public User(Integer u_id, String u_name, String u_email, String u_pd, Integer u_permission) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_email = u_email;
        this.u_pd = u_pd;
        this.u_permission = u_permission;
    }
    public User(){

    }
    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_pd() {
        return u_pd;
    }

    public void setU_pd(String u_pd) {
        this.u_pd = u_pd;
    }
}
