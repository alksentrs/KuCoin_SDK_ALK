package com.alk.kucoinsdk.business.assetsOperation;

/**
 * Created by alksentrs (aleksander medella) on 06/07/18.
 */
public class ListRecordsDataDatas {

    private  Integer fee;
    private  String oid;
    private  String type;
    private  Long amount;
    private  String remark;
    private  String status;
    private  String address;
    private  String context;
    private  String userOid;
    private  String coinType;
    private  Long createdAt;
    private  Long deletedAt;
    private  Long updatedAt;
    private  String outerWalletTxid;

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getOuterWalletTxid() {
        return outerWalletTxid;
    }

    public void setOuterWalletTxid(String outerWalletTxid) {
        this.outerWalletTxid = outerWalletTxid;
    }

    @Override
    public String toString() {
        return "{"+
                "fee:" + fee + "," +
                "oid:" + oid + "," +
                "type:" + type + "," +
                "amount:" + amount + "," +
                "remark:" + remark + "," +
                "status:" + status + "," +
                "address:" + address + "," +
                "context:" + context + "," +
                "userOid:" + userOid + "," +
                "coinType:" + coinType + "," +
                "createdAt:" + createdAt + "," +
                "deletedAt:" + deletedAt + "," +
                "updatedAt:" + updatedAt + "," +
                "outerWalletTxid:" + outerWalletTxid + "}";
    }
}
