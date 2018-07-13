package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class CoinInfo extends KucoinResponse {

    private Coin data;

    public Coin getData() {
        return data;
    }

    public void setData(Coin data) {
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
