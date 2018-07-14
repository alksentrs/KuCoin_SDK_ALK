package com.alk.kucoinsdk.business.language;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 20/06/18.
 */
public class LanguageList extends KucoinResponse {

    private List<List<String>> data;

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "success:"+ success + "," +
                "code:"+ code + "," +
                "msg=" + msg + "," +
                "data:" + data +
                "}";
    }
}
