package com.alk.kucoinsdk.business.trading;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class ActiveOrderKvData {

    @JsonProperty("SELL")
    private List<ActiveOrderKvDataDetails> sell;
    @JsonProperty("BUY")
    private List<ActiveOrderKvDataDetails> buy;

    public List<ActiveOrderKvDataDetails> getSell() {
        return sell;
    }

    public void setSell(List<ActiveOrderKvDataDetails> sell) {
        this.sell = sell;
    }

    public List<ActiveOrderKvDataDetails> getBuy() {
        return buy;
    }

    public void setBuy(List<ActiveOrderKvDataDetails> buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "{" +
                "sell:" + sell + "," +
                "buy:" + buy +
                "}";
    }
}
