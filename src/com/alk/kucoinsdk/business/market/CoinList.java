package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 12/01/18.
 */
public class CoinList extends KucoinResponse {

    private List<Coin> data;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{success:" +success + "," +
                "code:" + code + "," +
                "msg:" + msg + "," +
                "data:" + data + "}";
    }
}
