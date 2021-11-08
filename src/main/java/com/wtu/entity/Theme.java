package com.wtu.entity;

public class Theme {
    private Integer tid;
    private String tname;
    private String host;
    private Integer status;

    public Theme() {
    }

    public Theme(Integer tid, String tname, String host, Integer status) {
        this.tid = tid;
        this.tname = tname;
        this.host = host;
        this.status = status;
    }

    public Theme(String tname, String host, Integer status) {
        this.tname = tname;
        this.host = host;
        this.status = status;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", host='" + host + '\'' +
                ", status=" + status +
                '}';
    }
}