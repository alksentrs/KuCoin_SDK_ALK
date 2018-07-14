package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDealtSpecificDataDatas {

    private String coinType;
    private Double amount;
    private Double dealValue;
    private Double fee;
    private String dealDirection;
    private String coinTypePair;
    private String oid;
    private Double dealPrice;
    private String orderOid;
    private Double feeRate;
    private Long createdAt;
    private String id;
    private String direction;

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
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

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getDealDirection() {
        return dealDirection;
    }

    public void setDealDirection(String dealDirection) {
        this.dealDirection = dealDirection;
    }

    public String getCoinTypePair() {
        return coinTypePair;
    }

    public void setCoinTypePair(String coinTypePair) {
        this.coinTypePair = coinTypePair;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Double getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }

    public String getOrderOid() {
        return orderOid;
    }

    public void setOrderOid(String orderOid) {
        this.orderOid = orderOid;
    }

    public Double getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Double feeRate) {
        this.feeRate = feeRate;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "{" +
                "coinType:" + coinType + "," +
                "amount:" + amount + "," +
                "dealValue:" + dealValue + "," +
                "fee:" + fee + "," +
                "dealDirection:" + dealDirection + "," +
                "coinTypePair:" + coinTypePair + "," +
                "oid:" + oid + "," +
                "dealPrice:" + dealPrice + "," +
                "orderOid:" + orderOid + "," +
                "feeRate:" + feeRate + "," +
                "createdAt:" + createdAt + "," +
                "id:" + id + "," +
                "direction:" + direction +
                "}";
    }
}
