package com.funweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private  int proviceCode;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public  String getProviceName()
    {
        return proviceName;
    }
    public void setProviceName(String name)
    {
        this.proviceName = name;
    }
    public int getProviceCode()
    {
        return  proviceCode;
    }
    public void setProviceCode(int code)
    {
        this.proviceCode = code;
    }
}
