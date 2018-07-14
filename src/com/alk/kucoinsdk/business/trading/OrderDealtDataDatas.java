package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDealtDataDatas {

    private Long createdAt;
    private Double amount;
    private Double dealValue;
    private Double dealPrice;
    private Double fee;
    private Double feeRate;
    private String oid;
    private String orderOid;
    private String coinType;
    private String coinTypePair;
    private String direction;
    private String dealDirection;

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDealValue() {
        return dealValue;
    }

    public void setDealValue(Double dealValue) {
        this.dealValue = dealValue;
    }

    public Double getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Double feeRate) {
        this.feeRate = feeRate;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOrderOid() {
        return orderOid;
    }

    public void setOrderOid(String orderOid) {
        this.orderOid = orderOid;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public String getCoinTypePair() {
        return coinTypePair;
    }

    public void setCoinTypePair(String coinTypePair) {
        this.coinTypePair = coinTypePair;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDealDirection() {
        return dealDirection;
    }

    public void setDealDirection(String dealDirection) {
        this.dealDirection = dealDirection;
    }

    @Override
    public String toString() {
        return "{" +
                "createdAt:" + createdAt + "," +
                "amount:" + amount + "," +
                "dealValue:" + dealValue + "," +
                "dealPrice:" + dealPrice + "," +
                "fee:" + fee + "," +
                "feeRate:" + feeRate + "," +
                "oid:" + oid + "," +
                "orderOid:" + orderOid + "," +
                "coinType:" + coinType + "," +
                "coinTypePair:" + coinTypePair + "," +
                "direction:" + direction + "," +
                "dealDirection:" + dealDirection + "}";
    }
}
