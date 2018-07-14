package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class SymbolsTick extends KucoinResponse {

    private List<SymbolTickData> data;

    public List<SymbolTickData> getData() {
        return data;
    }

    public void setData(List<SymbolTickData> data) {
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
