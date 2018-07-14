package com.alk.kucoinsdk.business.assetsOperation;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 20/06/18.
 */
public class DepositAddress extends KucoinResponse {

    private DepositAddressData data;

    public DepositAddressData getData() {
        return data;
    }

    public void setData(DepositAddressData data) {
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
