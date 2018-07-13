package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class Order extends KucoinResponse {

    private OrderData data;

    public OrderData getData() {
        return data;
    }

    public void setData(OrderData data) {
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
