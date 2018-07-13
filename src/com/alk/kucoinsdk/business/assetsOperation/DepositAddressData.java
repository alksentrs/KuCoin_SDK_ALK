package com.alk.kucoinsdk.business.assetsOperation;

/**
 * Created by alksentrs (aleksander medella) on 20/06/18.
 */
public class DepositAddressData {

    private String oid;
    private String address;
    private String context;
    private String userOid;
    private String coinType;
    private Long createdAt;
    private Long deletedAt;
    private Long updatedAt;
    private Long lastReceivedAt;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getLastReceivedAt() {
        return lastReceivedAt;
    }

    public void setLastReceivedAt(Long lastReceivedAt) {
        this.lastReceivedAt = lastReceivedAt;
    }

    @Override
    public String toString() {
        return "{" +
                "oid:" + oid + "," +
                "address:" + address + "," +
                "context:" + context + "," +
                "userOid:" + userOid + "," +
                "coinType:" + coinType + "," +
                "createdAt:" + createdAt + "," +
                "deletedAt:" + deletedAt + "," +
                "updatedAt:" + updatedAt + "," +
                "lastReceivedAt:" + lastReceivedAt +
                "}";
    }
}
