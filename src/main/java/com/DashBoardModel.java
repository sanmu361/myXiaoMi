package com;


import java.math.BigDecimal;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2017-09-29 15:59
 **/
public class DashBoardModel {
    private String regionName;

    private long regionId;
    private String tradeAmount = "0";
    private long phoneNum;
    private long activeUser;
    private BigDecimal avgAmount  = BigDecimal.ZERO;

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;

    }


    String a = "{\"id\":14,\"templetId\":25,\"name\":\"测试\",\"startTime\":1523462400000,\"startTimeStr\":\"2018年04月12日 00:00:00\",\"endTime\":1523548799000,\"endTimeStr\":\"2018年04月12日 23:59:59\",\"creator\":\"李军\",\"creatorEmail\":\"lijun7@xiaomi.com\",\"logic\":\"[{\\\"property\\\":\\\"couponMoney\\\",\\\"propertyName\\\":\\\"折扣券金额\\\",\\\"expectedValue\\\":\\\"1\\\",\\\"logic\\\":\\\"\\u003c\\\"},{\\\"property\\\":\\\"couponMoney\\\",\\\"propertyName\\\":\\\"折扣券金额\\\",\\\"expectedValue\\\":\\\"20\\\",\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"couponCount\\\",\\\"propertyName\\\":\\\"券总数量\\\",\\\"expectedValue\\\":\\\"23\\\",\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"couponAmount\\\",\\\"propertyName\\\":\\\"券总金额\\\",\\\"expectedValue\\\":\\\"23\\\",\\\"logic\\\":\\\"\\u003e\\u003d\\\"},{\\\"property\\\":\\\"userChannelScope\\\",\\\"propertyName\\\":\\\"渠道\\\",\\\"expectedValue\\\":[\\\"1\\\",\\\"2\\\"],\\\"logic\\\":\\\"in\\\"},{\\\"property\\\":\\\"userRegion\\\",\\\"propertyName\\\":\\\"区域\\\",\\\"expectedValue\\\":[{\\\"scope\\\":\\\"0/2\\\",\\\"scope_name\\\":\\\"北京\\\"}],\\\"logic\\\":\\\"not in\\\"},{\\\"property\\\":\\\"userTag\\\",\\\"propertyName\\\":\\\"标签\\\",\\\"expectedValue\\\":[\\\"1\\\",\\\"2\\\"],\\\"logic\\\":\\\"not in\\\"},{\\\"property\\\":\\\"userSaleScope\\\",\\\"propertyName\\\":\\\"串货分\\\",\\\"expectedValue\\\":\\\"1\\\",\\\"logic\\\":\\\"\\u003c\\\"},{\\\"property\\\":\\\"userSaleScope\\\",\\\"propertyName\\\":\\\"串货分\\\",\\\"expectedValue\\\":\\\"34\\\",\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"oneShopReward\\\",\\\"propertyName\\\":\\\"单店奖励金额\\\",\\\"expectedValue\\\":\\\"34\\\",\\\"param\\\":{\\\"startTime\\\":1523462400000,\\\"endTime\\\":1523548800000},\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"oneShopRewardCount\\\",\\\"propertyName\\\":\\\"单店奖励数量\\\",\\\"expectedValue\\\":\\\"23\\\",\\\"param\\\":{\\\"before\\\":\\\"4\\\"},\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"oneShopRewardUseRatio\\\",\\\"propertyName\\\":\\\"店铺券使用率\\\",\\\"expectedValue\\\":\\\"67\\\",\\\"param\\\":{\\\"before\\\":\\\"3\\\"},\\\"logic\\\":\\\"\\u003c\\\"},{\\\"property\\\":\\\"oneShopAdmittedCount\\\",\\\"propertyName\\\":\\\"单店单次提报数量\\\",\\\"expectedValue\\\":\\\"23\\\",\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"oneShopStoreTurnDay\\\",\\\"propertyName\\\":\\\"店铺库存周转天数\\\",\\\"expectedValue\\\":\\\"56\\\",\\\"param\\\":{\\\"startTime\\\":1523376000000,\\\"endTime\\\":1524067200000},\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"oneShopStoreAll\\\",\\\"propertyName\\\":\\\"店铺总库存\\\",\\\"expectedValue\\\":\\\"12\\\",\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"couponNotUseCount\\\",\\\"propertyName\\\":\\\"店铺已有未使用券数量\\\",\\\"expectedValue\\\":\\\"23\\\",\\\"logic\\\":\\\"\\u003e\\\"},{\\\"property\\\":\\\"couponNotUseAmount\\\",\\\"propertyName\\\":\\\"店铺已有未使用券金额\\\",\\\"expectedValue\\\":\\\"34\\\",\\\"logic\\\":\\\"\\u003e\\\"}]\",\"logicBeanList\":[{\"property\":\"couponMoney\",\"propertyName\":\"折扣券金额\",\"expectedValue\":\"1\",\"logic\":\"\\u003c\"},{\"property\":\"couponMoney\",\"propertyName\":\"折扣券金额\",\"expectedValue\":\"20\",\"logic\":\"\\u003e\"},{\"property\":\"couponCount\",\"propertyName\":\"券总数量\",\"expectedValue\":\"23\",\"logic\":\"\\u003e\"},{\"property\":\"couponAmount\",\"propertyName\":\"券总金额\",\"expectedValue\":\"23\",\"logic\":\"\\u003e\\u003d\"},{\"property\":\"userChannelScope\",\"propertyName\":\"渠道\",\"expectedValue\":[\"1\",\"2\"],\"logic\":\"in\"},{\"property\":\"userRegion\",\"propertyName\":\"区域\",\"expectedValue\":[{\"scope\":\"0/2\",\"scope_name\":\"北京\"}],\"logic\":\"not in\"},{\"property\":\"userTag\",\"propertyName\":\"标签\",\"expectedValue\":[\"1\",\"2\"],\"logic\":\"not in\"},{\"property\":\"userSaleScope\",\"propertyName\":\"串货分\",\"expectedValue\":\"1\",\"logic\":\"\\u003c\"},{\"property\":\"userSaleScope\",\"propertyName\":\"串货分\",\"expectedValue\":\"34\",\"logic\":\"\\u003e\"},{\"property\":\"oneShopReward\",\"propertyName\":\"单店奖励金额\",\"expectedValue\":\"34\",\"logic\":\"\\u003e\",\"param\":{\"startTime\":1.5234624E12,\"endTime\":1.5235488E12}},{\"property\":\"oneShopRewardCount\",\"propertyName\":\"单店奖励数量\",\"expectedValue\":\"23\",\"logic\":\"\\u003e\",\"param\":{\"before\":\"4\"}},{\"property\":\"oneShopRewardUseRatio\",\"propertyName\":\"店铺券使用率\",\"expectedValue\":\"67\",\"logic\":\"\\u003c\",\"param\":{\"before\":\"3\"}},{\"property\":\"oneShopAdmittedCount\",\"propertyName\":\"单店单次提报数量\",\"expectedValue\":\"23\",\"logic\":\"\\u003e\"},{\"property\":\"oneShopStoreTurnDay\",\"propertyName\":\"店铺库存周转天数\",\"expectedValue\":\"56\",\"logic\":\"\\u003e\",\"param\":{\"startTime\":1.523376E12,\"endTime\":1.5240672E12}},{\"property\":\"oneShopStoreAll\",\"propertyName\":\"店铺总库存\",\"expectedValue\":\"12\",\"logic\":\"\\u003e\"},{\"property\":\"couponNotUseCount\",\"propertyName\":\"店铺已有未使用券数量\",\"expectedValue\":\"23\",\"logic\":\"\\u003e\"},{\"property\":\"couponNotUseAmount\",\"propertyName\":\"店铺已有未使用券金额\",\"expectedValue\":\"34\",\"logic\":\"\\u003e\"}],\"addedTime\":1523015412235,\"status\":-1}";

    String b = "{\"id\":274,\"fromType\":4,\"fromId\":0,\"type\":\"DISCOUNT\",\"entityName\":\"折扣券jjj\",\"startTime\":1523462400000,\"endTime\":1523548799000,\"totalNum\":1,\"userNum\":1,\"totalAmount\":10.00,\"batchId\":\"20180412145219\",\"remark\":\"侧事故\",\"operator\":\"李军\",\"ischeck\":1,\"checkStatement\":\"无\",\"time\":1523515939366,\"templetId\":25,\"discountType\":2,\"amount\":10,\"userListJson\":\"\",\"usedNum\":0,\"usedAmount\":0,\"useRate\":0}";

    String c = "[{\"applyId\":274,\"num\":1,\"amount\":10,\"usedNum\":0,\"usedAmount\":0,\"unusedNum\":0,\"unusedAmount\":0,\"checkStatus\":0,\"userId\":362195,\"userName\":\"樊浩宇\",\"miId\":1000118461,\"tel\":\"15011592644\",\"salesScope\":\"中国 北京\",\"salesScopeValue\":\"0/2\",\"tagIds\":\"1,82,137\",\"tagNames\":\"家属，分期授信，直供点\",\"openedTime\":1496231421391,\"openDayTime\":1496203200000,\"saleScore\":1,\"tagList\":[1,82,137],\"channelScope\":1}]";

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setActiveUser(long activeUser) {
        this.activeUser = activeUser;
    }

    public void setAvgAmount(BigDecimal avgAmount) {
        this.avgAmount = avgAmount;
    }

    public String getRegionName() {
        return regionName;
    }

    public long getRegionId() {
        return regionId;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public long getActiveUser() {
        if(activeUser != 0){
            avgAmount = new BigDecimal(tradeAmount).divide(new BigDecimal(activeUser), 2, BigDecimal.ROUND_HALF_UP);
            tradeAmount = String.valueOf(new BigDecimal(tradeAmount).setScale(2,BigDecimal.ROUND_HALF_UP));
        }
        return activeUser;
    }

    public BigDecimal getAvgAmount() {
        return avgAmount;
    }


}
