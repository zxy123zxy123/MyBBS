package com.wtu.entity;

public class Comment {
    private Integer cid;
    private Integer tid;
    private String content;

    public Comment() {
    }

    public Comment(Integer cid, Integer tid, String content) {
        this.cid = cid;
        this.tid = tid;
        this.content = content;
    }

    public Comment(Integer tid, String content) {
        this.tid = tid;
        this.content = content;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", tid=" + tid +
                ", content='" + content + '\'' +
                '}';
    }
}
