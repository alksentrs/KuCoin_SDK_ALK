package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDealt extends KucoinResponse {

   private Long timestamp;
   private OrderDealtData data;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public OrderDealtData getData() {
        return data;
    }

    public void setData(OrderDealtData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "success:" + success + "," +
                "code:" + code + "," +
                "msg:" + msg + "," +
                "timestamp:" + timestamp + "," +
                "data:" + data + "}";
    }

}
