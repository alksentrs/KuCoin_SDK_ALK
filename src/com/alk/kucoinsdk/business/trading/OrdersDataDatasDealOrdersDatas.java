package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrdersDataDatasDealOrdersDatas {

    private Integer amount;
    private Double dealValue;
    private Double fee;
    private Double dealPrice;
    private Integer feeRate;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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

    public Double getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Integer getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Integer feeRate) {
        this.feeRate = feeRate;
    }


    @Override
    public String toString() {
        return "{" +
                "amount:" + amount + "," +
                "dealValue:" + dealValue + "," +
                "fee:" + fee + "," +
                "dealPrice:" + dealPrice + "," +
                "feeRate:" + feeRate +
                "}";
    }
}
