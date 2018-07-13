package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class OrderBookDirection extends KucoinResponse {

    private List<List<Float>> data;

    public List<List<Float>> getData() {
        return data;
    }

    public void setData(List<List<Float>> data) {
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
