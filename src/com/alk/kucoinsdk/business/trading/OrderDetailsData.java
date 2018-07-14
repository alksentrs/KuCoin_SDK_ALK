package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDetailsData {

    private String coinType;
    private Double dealValueTotal;
    private Double dealPriceAverage;
    private Double feeTotal;
    private String userOid;
    private Integer dealAmount;
    private String coinTypePair;
    private Double orderPrice;
    private String type;
    private String orderOid;
    private Double pendingAmount;
    private Boolean isActive;
    private DealOrders dealOrders;

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public Double getDealValueTotal() {
        return dealValueTotal;
    }

    public void setDealValueTotal(Double dealValueTotal) {
        this.dealValueTotal = dealValueTotal;
    }

    public Double getDealPriceAverage() {
        return dealPriceAverage;
    }

    public void setDealPriceAverage(Double dealPriceAverage) {
        this.dealPriceAverage = dealPriceAverage;
    }

    public Double getFeeTotal() {
        return feeTotal;
    }

    public void setFeeTotal(Double feeTotal) {
        this.feeTotal = feeTotal;
    }

    public String getUserOid() {
        return userOid;
    }

    public void setUserOid(String userOid) {
        this.userOid = userOid;
    }

    public Integer getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Integer dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getCoinTypePair() {
        return coinTypePair;
    }

    public void setCoinTypePair(String coinTypePair) {
        this.coinTypePair = coinTypePair;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderOid() {
        return orderOid;
    }

    public void setOrderOid(String orderOid) {
        this.orderOid = orderOid;
    }

    public Double getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(Double pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public DealOrders getDealOrders() {
        return dealOrders;
    }

    public void setDealOrders(DealOrders dealOrders) {
        this.dealOrders = dealOrders;
    }

    @Override
    public String toString() {
        return "{" +
                "coinType:" + coinType + "," +
                "dealValueTotal:" + dealValueTotal + "," +
                "dealPriceAverage:" + dealPriceAverage + "," +
                "feeTotal:" + feeTotal + "," +
                "userOid:" + userOid + "," +
                "dealAmount:" + dealAmount + "," +
                "coinTypePair:" + coinTypePair + "," +
                "orderPrice:" + orderPrice + "," +
                "type:" + type + "," +
                "orderOid:" + orderOid + "," +
                "pendingAmount:" + pendingAmount + "," +
                "isActive:" + isActive + "," +
                "dealOrders:" + dealOrders +
                "}";
    }
}
