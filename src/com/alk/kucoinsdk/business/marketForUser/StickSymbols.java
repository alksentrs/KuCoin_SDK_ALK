package com.alk.kucoinsdk.business.marketForUser;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class StickSymbols extends KucoinResponse {

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
                "data:" + data + "," +
                "msg:" + msg + "," +
                "success:" + success + "," +
                "code:" + code +
                "}";
    }
}
