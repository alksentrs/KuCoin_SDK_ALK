package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDetails extends KucoinResponse {

   private Long timestamp;
   private OrderDetailsData data;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public OrderDetailsData getData() {
        return data;
    }

    public void setData(OrderDetailsData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "timestamp:" + timestamp + "," +
                "data:" + data + "," +
                "msg:" + msg + "," +
                "success:" + success + "," +
                "code:" + code +
                "}";
    }
}
