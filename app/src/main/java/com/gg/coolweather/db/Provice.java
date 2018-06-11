package com.gg.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/11 0011.
 */

public class Provice extends DataSupport {
    private int id;
    private String proviceName;
    private int proviceCode;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
