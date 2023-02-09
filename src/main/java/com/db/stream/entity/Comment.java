package com.db.stream.entity;

public class Comment {
    private Integer g_id;
    private Integer u_id;
    private String comm_content;
    private Double comm_rate;

    public Comment(){

    }
    public Integer getg_id() {
        return g_id;
    }

    public Integer getu_id() {
        return u_id;
    }

    public String get_comm() {
        return comm_content;
    }

    public Double get_rate(){ return comm_rate;}
}
