package com.alk.kucoinsdk.business.user;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class TradingSymbolsTick extends KucoinResponse {

    private List<TradingSymbolTickData> data;

    public List<TradingSymbolTickData> getData() {
        return data;
    }

    public void setData(List<TradingSymbolTickData> data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "{" +
                "msg:" + msg + "," +
                "timestamp:" + timestamp + "," +
                "success:" + success + "," +
                "code:" + code + "," +
                "data:" + data +
                "}";
    }
}