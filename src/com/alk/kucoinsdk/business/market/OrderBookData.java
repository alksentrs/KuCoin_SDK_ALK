package com.alk.kucoinsdk.business.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class OrderBookData {

    private Long timestamp;
    @JsonProperty("SELL")
    private List<List<Float>> SELL;
    @JsonProperty("BUY")
    private List<List<Float>> BUY;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public List<List<Float>> getSELL() {
        return SELL;
    }

    public void setSELL(List<List<Float>> SELL) {
        this.SELL = SELL;
    }

    public List<List<Float>> getBUY() {
        return BUY;
    }

    public void setBUY(List<List<Float>> BUY) {
        this.BUY = BUY;
    }


    @Override
    public String toString() {
        return "{" +
                "timestamp:" + timestamp + "," +
                "SELL:" + SELL + "," +
                "BUY:" + BUY +
                "}";
    }
}
