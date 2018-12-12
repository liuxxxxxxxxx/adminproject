package com.qf.pojo.po;

import java.sql.Date;

public class Item {
    private int id;
    private String name;
    private String path;
    private String url;
    private String info;
    private String cname;
    private Date update_time;
    private String cid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", url='" + url + '\'' +
                ", info='" + info + '\'' +
                ", cname='" + cname + '\'' +
                ", update_time=" + update_time +
                ", cid=" + cid +
                '}';
    }
}
