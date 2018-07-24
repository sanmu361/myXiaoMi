package com.sanmu.myXiaoMi;

import java.math.BigDecimal;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-10-24 12:19
 **/
public class GDP {
    private String regionName;
    private BigDecimal avgGdp;
    private BigDecimal avgPer;
    private BigDecimal squerKil;
    private BigDecimal perNum;
    private BigDecimal gdp;

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setAvgGdp(BigDecimal avgGdp) {
        this.avgGdp = avgGdp;
    }

    public void setAvgPer(BigDecimal avgPer) {
        this.avgPer = avgPer;
    }

    public void setSquerKil(BigDecimal squerKil) {
        this.squerKil = squerKil;
    }

    public void setPerNum(BigDecimal perNum) {
        this.perNum = perNum;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }

    public String getRegionName() {
        return regionName;
    }

    public BigDecimal getAvgGdp() {
        return avgGdp;
    }

    public BigDecimal getAvgPer() {
        return avgPer;
    }

    public BigDecimal getPerNum() {
        return perNum;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public BigDecimal getSquerKil() {
        return squerKil;
    }
}
