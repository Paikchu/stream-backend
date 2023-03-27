package com.db.stream.entity;
import java.util.Date;

/*public class Comment {
    private Integer comm_id;
    private Integer g_id;
    private Integer u_id;
    private String comm_content;
    private Double comm_rate;

    public Comment(Integer comm_id,Integer g_id,Integer u_id,String comm_content,Double comm_rate) {
        this.comm_id = comm_id;
        this.g_id = g_id;
        this.u_id = u_id;
        this.comm_content = comm_content;
        this.comm_rate = comm_rate;
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

    public Integer get_commid(){return comm_id;}

    public void set_uid(Integer u_id){ this.u_id = u_id;};

    public void set_comm(String comm){ this.comm_content = comm;};

    public void set_commid(Integer comm_id){ this.comm_id = comm_id;};

    public void set_gid(Integer g_id){ this.g_id = g_id;};

    public void set_rate(Double rate){ this.comm_rate = rate;};

}*/
public class Comment {
    private Integer com_id;
    private String com_content;
    private Date com_data;

    public Comment(Integer com_id,String com_content,Date com_data) {
        this.com_id = com_id;
        this.com_content = com_content;
        this.com_data = com_data;
    }
    public Integer getcom_id() {
        return com_id;
    }
    public String get_comm() {
        return com_content;
    }
    public Date getcom_data(){ return com_data;}
    public void setcom_id(Integer com_id){ this.com_id = com_id;};
    public void setcom_content(String com_content){ this.com_content = com_content;};
    public void setcom_data(Date com_data){ this.com_data = com_data;};
}
