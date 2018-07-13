package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class OrderBook extends KucoinResponse {

    private OrderBookData data;

    public OrderBookData getData() {
        return data;
    }

    public void setData(OrderBookData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{success:" +success + "," +
                "code:" + code + "," +
                "msg:" + msg + "," +
                "data:" + data + "}";
    }
}
