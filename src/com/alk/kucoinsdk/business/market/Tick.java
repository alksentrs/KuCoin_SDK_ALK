package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class Tick extends KucoinResponse {

    private TickData data;

    public TickData getData() {
        return data;
    }

    public void setData(TickData data) {
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
