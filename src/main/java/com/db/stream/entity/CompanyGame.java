package com.db.stream.entity;
import java.io.Serializable;
import java.util.Date;

public class CompanyGame {
    private Integer g_id;
    private String g_name;
    private String g_intro;
    private Date g_release_date;
    private double g_price;
    private String g_tag;
    private Integer g_cid;
    private Integer c_id;
    private String c_name;
    private String c_email;
    private String c_pd;
    private Integer c_permission;
    private Integer game_id;
    private String g_OS;
    private String g_Processor;
    private String g_RAM;
    private String g_Memory;
    private String g_Network;
    private String g_GraphicCard;
    private String g_ExtraRequire;

    public CompanyGame(Integer g_id, String g_name, String g_intro, Date g_release_date, double g_price, String g_tag, Integer g_cid, Integer c_id, String c_name, String c_email, String c_pd, Integer c_permission, Integer game_id, String g_OS, String g_Processor, String g_RAM, String g_Memory, String g_Network, String g_GraphicCard, String g_ExtraRequire) {
        this.g_id = g_id;
        this.g_name = g_name;
        this.g_intro = g_intro;
        this.g_release_date = g_release_date;
        this.g_price = g_price;
        this.g_tag = g_tag;
        this.g_cid = g_cid;
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_email = c_email;
        this.c_pd = c_pd;
        this.c_permission = c_permission;
        this.game_id = game_id;
        this.g_OS = g_OS;
        this.g_Processor = g_Processor;
        this.g_RAM = g_RAM;
        this.g_Memory = g_Memory;
        this.g_Network = g_Network;
        this.g_GraphicCard = g_GraphicCard;
        this.g_ExtraRequire = g_ExtraRequire;
    }

    public Integer getG_id() {
        return g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public String getG_intro() {
        return g_intro;
    }

    public Date getG_release_date() {
        return g_release_date;
    }

    public double getG_price() {
        return g_price;
    }

    public String getG_tag() {
        return g_tag;
    }

    public Integer getG_cid() {
        return g_cid;
    }

    public Integer getC_id() {
        return c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public String getC_email() {
        return c_email;
    }

    public String getC_pd() {
        return c_pd;
    }

    public Integer getC_permission() {
        return c_permission;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public String getG_OS() {
        return g_OS;
    }

    public String getG_Processor() {
        return g_Processor;
    }

    public String getG_RAM() {
        return g_RAM;
    }

    public String getG_Memory() {
        return g_Memory;
    }

    public String getG_Network() {
        return g_Network;
    }

    public String getG_GraphicCard() {
        return g_GraphicCard;
    }

    public String getG_ExtraRequire() {
        return g_ExtraRequire;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public void setG_intro(String g_intro) {
        this.g_intro = g_intro;
    }

    public void setG_release_date(Date g_release_date) {
        this.g_release_date = g_release_date;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    public void setG_tag(String g_tag) {
        this.g_tag = g_tag;
    }

    public void setG_cid(Integer g_cid) {
        this.g_cid = g_cid;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public void setC_pd(String c_pd) {
        this.c_pd = c_pd;
    }

    public void setC_permission(Integer c_permission) {
        this.c_permission = c_permission;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public void setG_OS(String g_OS) {
        this.g_OS = g_OS;
    }

    public void setG_Processor(String g_Processor) {
        this.g_Processor = g_Processor;
    }

    public void setG_RAM(String g_RAM) {
        this.g_RAM = g_RAM;
    }

    public void setG_Memory(String g_Memory) {
        this.g_Memory = g_Memory;
    }

    public void setG_Network(String g_Network) {
        this.g_Network = g_Network;
    }

    public void setG_GraphicCard(String g_GraphicCard) {
        this.g_GraphicCard = g_GraphicCard;
    }

    public void setG_ExtraRequire(String g_ExtraRequire) {
        this.g_ExtraRequire = g_ExtraRequire;
    }
}

