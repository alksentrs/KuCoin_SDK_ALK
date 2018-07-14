package com.alk.kucoinsdk.business.market;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class Coin {

    private Double withdrawMinFee;
    private String coinType;
    private Double withdrawMinAmount;
    private String withdrawRemark;
    private String orgAddress;
    private String txUrl;
    private String userAddressName;
    private Double withdrawFeeRate;
    private Integer confirmationCount;
    private String infoUrl;
    private Boolean enable;
    private String name;
    private Integer tradePrecision;
    private String depositRemark;
    private Boolean enableWithdraw;
    private Boolean enableDeposit;
    private String coin;

    public Double getWithdrawMinFee() {
        return withdrawMinFee;
    }

    public void setWithdrawMinFee(Double withdrawMinFee) {
        this.withdrawMinFee = withdrawMinFee;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public Double getWithdrawMinAmount() {
        return withdrawMinAmount;
    }

    public void setWithdrawMinAmount(Double withdrawMinAmount) {
        this.withdrawMinAmount = withdrawMinAmount;
    }

    public String getWithdrawRemark() {
        return withdrawRemark;
    }

    public void setWithdrawRemark(String withdrawRemark) {
        this.withdrawRemark = withdrawRemark;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getTxUrl() {
        return txUrl;
    }

    public void setTxUrl(String txUrl) {
        this.txUrl = txUrl;
    }

    public String getUserAddressName() {
        return userAddressName;
    }

    public void setUserAddressName(String userAddressName) {
        this.userAddressName = userAddressName;
    }

    public Double getWithdrawFeeRate() {
        return withdrawFeeRate;
    }

    public void setWithdrawFeeRate(Double withdrawFeeRate) {
        this.withdrawFeeRate = withdrawFeeRate;
    }

    public Integer getConfirmationCount() {
        return confirmationCount;
    }

    public void setConfirmationCount(Integer confirmationCount) {
        this.confirmationCount = confirmationCount;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTradePrecision() {
        return tradePrecision;
    }

    public void setTradePrecision(Integer tradePrecision) {
        this.tradePrecision = tradePrecision;
    }

    public String getDepositRemark() {
        return depositRemark;
    }

    public void setDepositRemark(String depositRemark) {
        this.depositRemark = depositRemark;
    }

    public Boolean getEnableWithdraw() {
        return enableWithdraw;
    }

    public void setEnableWithdraw(Boolean enableWithdraw) {
        this.enableWithdraw = enableWithdraw;
    }

    public Boolean getEnableDeposit() {
        return enableDeposit;
    }

    public void setEnableDeposit(Boolean enableDeposit) {
        this.enableDeposit = enableDeposit;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return "{" +
                "withdrawMinFee:" + withdrawMinFee + "," +
                "coinType:" + coinType + "," +
                "withdrawMinAmount:" + withdrawMinAmount + "," +
                "withdrawRemark:" + withdrawRemark + "," +
                "orgAddress:" + orgAddress + "," +
                "txUrl:" + txUrl + "," +
                "userAddressName:" + userAddressName + "," +
                "withdrawFeeRate:" + withdrawFeeRate + "," +
                "confirmationCount:" + confirmationCount + "," +
                "infoUrl:" + infoUrl + "," +
                "enable:" + enable + "," +
                "name:" + name + "," +
                "tradePrecision:" + tradePrecision + "," +
                "depositRemark:" + depositRemark + "," +
                "enableWithdraw:" + enableWithdraw + "," +
                "enableDeposit:" + enableDeposit + "," +
                "coin:" + coin +
                "}";
    }
}
