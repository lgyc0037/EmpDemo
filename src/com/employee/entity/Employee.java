package com.employee.entity;

import java.util.Date;

public class Employee {
        private String id;//ID
        private String xm;//姓名
        private String xb;//性别
        private int nl;//年龄
        private Date csrq;//出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public int getNl() {
        return nl;
    }

    public void setNl(int nl) {
        this.nl = nl;
    }

    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", nl=" + nl +
                ", csrq=" + csrq +
                '}';
    }
}
