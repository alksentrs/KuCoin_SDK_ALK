package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrdersDataDatas {

    private String oid;
    private String userOid;
    private String coinType;
    private String coinTypePair;
    private String direction;
    private Double price;
    private Integer dealAmount;
    private Integer pendingAmount;
    private String createdAt;
    private String updatedAt;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getUserOid() {
        return userOid;
    }

    public void setUserOid(String userOid) {
        this.userOid = userOid;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Integer dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Integer getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(Integer pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "{" +
                "oid:" + oid + "," +
                "userOid:" + userOid + "," +
                "coinType:" + coinType + "," +
                "coinTypePair:" + coinTypePair + "," +
                "direction:" + direction + "," +
                "price:" + price + "," +
                "dealAmount:" + dealAmount + "," +
                "pendingAmount:" + pendingAmount + "," +
                "createdAt:" + createdAt + "," +
                "updatedAt:" + updatedAt +
                "}";
    }
}
