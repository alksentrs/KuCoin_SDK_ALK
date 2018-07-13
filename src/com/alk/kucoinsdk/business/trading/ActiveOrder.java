package com.alk.kucoinsdk.business.trading;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class ActiveOrder extends KucoinResponse {

    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
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
