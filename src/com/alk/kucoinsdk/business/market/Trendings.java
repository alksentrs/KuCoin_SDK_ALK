package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class Trendings extends KucoinResponse {

    private List<TrendingsData> data;

    public List<TrendingsData> getData() {
        return data;
    }

    public void setData(List<TrendingsData> data) {
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
