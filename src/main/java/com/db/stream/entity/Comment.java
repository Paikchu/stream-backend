package com.db.stream.entity;
import java.util.Date;
public class Comment {
    private Integer com_id;
    private Integer com_gid;
    private String com_content;
    private Date com_date;

    public Comment(Integer com_id, Integer com_gid, String com_content, Date com_date) {
        this.com_id = com_id;
        this.com_gid = com_gid;
        this.com_content = com_content;
        this.com_date = com_date;
    }

    public Integer getCom_id() {
        return com_id;
    }

    public Integer getCom_gid() {
        return com_gid;
    }

    public String getCom_content() {
        return com_content;
    }

    public Date getCom_date() {
        return com_date;
    }

    public void setCom_id(Integer com_id) {
        this.com_id = com_id;
    }

    public void setCom_gid(Integer com_gid) {
        this.com_gid = com_gid;
    }

    public void setCom_content(String com_content) {
        this.com_content = com_content;
    }

    public void setCom_date(Date com_date) {
        this.com_date = com_date;
    }
}

