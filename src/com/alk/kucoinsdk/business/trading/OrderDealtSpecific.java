package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDealtSpecific extends KucoinResponse {

    private OrderDealtSpecificData data;

    public OrderDealtSpecificData getData() {
        return data;
    }

    public void setData(OrderDealtSpecificData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{"+
                "success:" + success + "," +
                "code:" + code + "," +
                "msg:" + msg + "," +
                "data:" + data +
                "}";
    }
}
