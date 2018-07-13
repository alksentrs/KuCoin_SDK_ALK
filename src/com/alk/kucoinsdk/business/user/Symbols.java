package com.alk.kucoinsdk.business.user;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class Symbols extends KucoinResponse {

    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{"+
                "success:" +success + "," +
                "code:" + code + "," +
                "msg:" + msg + "," +
                "data:" + data +
                "}";
    }
}

