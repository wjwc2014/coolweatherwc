package com.example.wcc.coolweather.model;

/**
 * Created by wcc on 17/1/13.
 */

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public String getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
