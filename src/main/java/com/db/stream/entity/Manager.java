package com.db.stream.entity;

public class Manager {
    private Integer m_id;
    private String m_name;
    private String m_email;
    private String m_pd;


    public Manager(Integer m_id, String m_name, String m_email, String m_pd) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_email = m_email;
        this.m_pd = m_pd;
    }

    public Manager() {
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_email() {
        return m_email;
    }

    public void setM_email(String m_email) {
        this.m_email = m_email;
    }

    public String getM_pd() {
        return m_pd;
    }

    public void setM_pwd(String m_pd) {
        this.m_pd = m_pd;
    }
}
