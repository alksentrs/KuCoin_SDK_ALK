package com.alk.kucoinsdk.business.assetsOperation;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class Balance extends KucoinResponse {

    private BalanceData data;

    public BalanceData getData() {
        return data;
    }

    public void setData(BalanceData data) {
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
