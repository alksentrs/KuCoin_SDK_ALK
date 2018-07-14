package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class TradingMarkets extends KucoinResponse {

    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{success:" +success + "," +
                "code:" + code + "," +
                "msg:" + msg +  "," +
                "timestamp:" + timestamp + "," +
                "data:" + data + "}";
    }
}
