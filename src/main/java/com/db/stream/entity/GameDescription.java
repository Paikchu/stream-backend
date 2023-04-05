package com.db.stream.entity;

public class GameDescription {
    private Integer game_id;
    private String g_OS;
    private String g_Processor;
    private String g_RAM;
    private String g_Memory;
    private String g_Network;

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

    private String g_GraphicCard;
    private String g_ExtraRequire;

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

    public GameDescription(Integer game_id, String g_OS, String g_Processor, String g_RAM, String g_Memory, String g_Network, String g_GraphicCard, String g_ExtraRequire) {
        this.game_id = game_id;
        this.g_OS = g_OS;
        this.g_Processor = g_Processor;
        this.g_RAM = g_RAM;
        this.g_Memory = g_Memory;
        this.g_Network = g_Network;
        this.g_GraphicCard = g_GraphicCard;
        this.g_ExtraRequire = g_ExtraRequire;
    }


}
