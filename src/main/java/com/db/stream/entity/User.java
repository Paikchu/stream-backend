package com.db.stream.entity;


import java.io.Serializable;

public class User implements Serializable {
    private Integer u_id;
    private String u_name;
    private String u_email;
    private String u_pwd;
    private Integer u_permission;

    public Integer getU_permission() {
        return u_permission;
    }

    public void setU_permission(Integer u_permission) {
        this.u_permission = u_permission;
    }

    public User(Integer u_id, String u_name, String u_email, String u_pwd, Integer u_permission) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_email = u_email;
        this.u_pwd = u_pwd;
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

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }
}
