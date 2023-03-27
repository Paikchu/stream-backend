package com.db.stream.entity;

public class Library {
    private Integer lib_uid;
    private Integer lib_gid;
    public Integer getlib_uid() {
        return lib_uid;
    }
    public void setlib_uid(Integer lib_uid) {
        this.lib_uid = lib_uid;
    }
    public Integer getlib_gid() {
        return lib_gid;
    }
    public void setlib_gid(Integer lib_gid) {
        this.lib_gid = lib_gid;
    }
    public Library (Integer lib_uid,Integer lib_gid){
        this.lib_uid = lib_uid;
        this.lib_gid = lib_gid;
    }
}
