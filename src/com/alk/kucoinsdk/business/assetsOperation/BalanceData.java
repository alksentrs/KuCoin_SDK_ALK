package com.alk.kucoinsdk.business.assetsOperation;

/**
 * Created by alksentrs (aleksander medella) on 06/07/18.
 */
public class BalanceData {

    private String coinType;
    private String balanceStr;
    private Double freezeBalance;
    private Double balance;
    private String freezeBalanceStr;

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public String getBalanceStr() {
        return balanceStr;
    }

    public void setBalanceStr(String balanceStr) {
        this.balanceStr = balanceStr;
    }

    public Double getFreezeBalance() {
        return freezeBalance;
    }

    public void setFreezeBalance(Double freezeBalance) {
        this.freezeBalance = freezeBalance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getFreezeBalanceStr() {
        return freezeBalanceStr;
    }

    public void setFreezeBalanceStr(String freezeBalanceStr) {
        this.freezeBalanceStr = freezeBalanceStr;
    }

    @Override
    public String toString() {
        return "{" +
                "coinType:" + coinType + "," +
                "balanceStr:" + balanceStr + "," +
                "freezeBalance:" + freezeBalance + "," +
                "balance:" + balance + "," +
                "freezeBalanceStr:" + freezeBalanceStr +
                "}";
    }
}
