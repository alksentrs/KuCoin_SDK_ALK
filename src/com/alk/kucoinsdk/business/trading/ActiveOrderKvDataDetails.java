package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class ActiveOrderKvDataDetails {

    private String oid;
    private String type;
    private String userOid;
    private String coinType;
    private String coinTypePair;
    private String direction;
    private Double price;
    private Double dealAmount;
    private Double pendingAmount;
    private Long createdAt;
    private Long updatedAt;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Double getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Double getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(Double pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "{" +
                "oid:" + oid + "," +
                "type:" + type + "," +
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
