package com.alk.kucoinsdk.business.trading;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class ActiverOrderData {

    @JsonProperty("SELL")
    private List<List<String>> SELL;
    @JsonProperty("BUY")
    private List<List<String>> BUY;

    public List<List<String>> getSELL() {
        return SELL;
    }

    public void setSELL(List<List<String>> SELL) {
        this.SELL = SELL;
    }

    @Override
    public String toString() {
        return "{" +
                "SELL:" + SELL + "," +
                "BUY:" + BUY +
                "}";
    }
}
