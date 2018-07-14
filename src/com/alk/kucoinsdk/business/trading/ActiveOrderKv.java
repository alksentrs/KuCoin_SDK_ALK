package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class ActiveOrderKv extends KucoinResponse {

    private ActiveOrderKvData data;

    public ActiveOrderKvData getData() {
        return data;
    }

    public void setData(ActiveOrderKvData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "data:" + data + "," +
                "msg:" + msg + "," +
                "timestamp:" + timestamp + "," +
                "success:" + success + "," +
                "code:" + code +
                "}";
    }
}
