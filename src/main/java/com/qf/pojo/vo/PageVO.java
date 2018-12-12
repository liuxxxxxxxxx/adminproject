package com.qf.pojo.vo;

import java.util.List;

public class PageVO<T> {
    private int total;//商品总数
    private int pageIndex;//当前页
    private int pageSize;//每页显示条数
    private int offset;//偏移量（pageIndex-1）offset
    private List<T> date;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getDate() {
        return date;
    }

    public void setDate(List<T> date) {
        this.date = date;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "PageVO{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", offset=" + offset +
                ", date=" + date +
                '}';
    }
}
