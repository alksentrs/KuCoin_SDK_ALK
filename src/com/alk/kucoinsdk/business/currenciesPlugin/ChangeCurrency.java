package com.alk.kucoinsdk.business.currenciesPlugin;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 19/06/18.
 */
public class ChangeCurrency extends KucoinResponse {

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
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
