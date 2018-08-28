package com.funweather.android.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String name)
    {
        this.countryName = name;
    }

    public String getWeatherId() {
        return weatherId;
    }
    public void  setWeatherId(String id)
    {
        this.weatherId = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}