package com.alk.kucoinsdk.business.assetsOperation;

import com.alk.kucoinsdk.business.KucoinResponse;

/**
 * Created by alksentrs (aleksander medella) on 06/07/18.
 */
public class ListRecords extends KucoinResponse {

    private ListRecordsData data;

    public ListRecordsData getData() {
        return data;
    }

    public void setData(ListRecordsData data) {
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
