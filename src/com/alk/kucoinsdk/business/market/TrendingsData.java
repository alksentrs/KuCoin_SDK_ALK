package com.alk.kucoinsdk.business.market;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class TrendingsData {

   private String coinPair;
   private List<List<Long>> deals;

    public String getCoinPair() {
        return coinPair;
    }

    public void setCoinPair(String coinPair) {
        this.coinPair = coinPair;
    }

    public List<List<Long>> getDeals() {
        return deals;
    }

    public void setDeals(List<List<Long>> deals) {
        this.deals = deals;
    }

    @Override
    public String toString() {
        return "{coinPair:" + coinPair + "," +
                "deals:" + deals + "}";
    }
}
