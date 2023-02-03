package com.db.stream.entity;

public class Company {

    private Integer com_id;
    private String com_name;
    private String com_email;
    private String com_pwd;
    private Integer com_permission;

    public Company(Integer com_id, String com_name, String com_email, String com_pwd, Integer com_permission) {
        this.com_id = com_id;
        this.com_name = com_name;
        this.com_email = com_email;
        this.com_pwd = com_pwd;
        this.com_permission = com_permission;
    }

    public Company() {
    }

    public Integer getCom_id() {
        return com_id;
    }

    public void setCom_id(Integer com_id) {
        this.com_id = com_id;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public String getCom_email() {
        return com_email;
    }

    public void setCom_email(String com_email) {
        this.com_email = com_email;
    }

    public String getCom_pwd() {
        return com_pwd;
    }

    public void setCom_pwd(String com_pwd) {
        this.com_pwd = com_pwd;
    }

    public Integer getCom_permission() {
        return com_permission;
    }

    public void setCom_permission(Integer com_permission) {
        this.com_permission = com_permission;
    }
}
