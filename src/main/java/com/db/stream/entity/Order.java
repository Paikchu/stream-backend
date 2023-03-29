package com.db.stream.entity;
import java.io.Serializable;
import java.util.Date;

public class Order {
    private Integer oid;
    private Integer o_gid;
    private Integer o_uid;
    private Double o_value;
    private Date o_time;

    public Order(Integer oid, Integer o_gid, Integer o_uid, Double o_value, Date o_time) {
        this.oid = oid;
        this.o_gid = o_gid;
        this.o_uid = o_uid;
        this.o_value = o_value;
        this.o_time = o_time;
    }

    public Integer getoid(){ return oid;}
    public Integer geto_gid(){ return o_gid;}
    public Integer geto_uid(){ return o_uid;}
    public Double geto_value(){ return o_value;}
    public Date geto_time(){ return o_time;}
    public void setoid(Integer oid){ this.oid = oid;}
    public void seto_gid(Integer o_gid){ this.o_gid = o_gid;}
    public void seto_uid(Integer o_uid){ this.o_uid = o_uid;}
    public void seto_value(Double o_value){ this.o_value = o_value;}
    public void seto_time(Date o_time){ this.o_time = o_time;}

}
