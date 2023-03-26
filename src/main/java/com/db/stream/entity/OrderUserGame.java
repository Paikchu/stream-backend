package com.db.stream.entity;

import java.sql.Date;

public class OrderUserGame {

    Integer o_id;
    String u_name;
    String g_name;
    Double o_value;
    Date o_time;

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public Double getO_value() {
        return o_value;
    }

    public void setO_value(Double o_value) {
        this.o_value = o_value;
    }

    public Date getO_time() {
        return o_time;
    }

    public void setO_time(Date o_time) {
        this.o_time = o_time;
    }




    public OrderUserGame(Integer o_id, String u_name, String g_name, Double o_value, Date o_time) {
        this.o_id = o_id;
        this.u_name = u_name;
        this.g_name = g_name;
        this.o_value = o_value;
        this.o_time = o_time;
    }

}
