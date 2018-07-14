package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class Orders extends KucoinResponse {

    private Long timestamp;
    private OrdersData data;


    @Override
    public String toString() {
        return "{" +
                "timestamp:" + timestamp + "," +
                "msg:" + msg + "," +
                "success:" + success + "," +
                "code:" + code + "," +
                "data:" + data +
                "}";
    }
}
