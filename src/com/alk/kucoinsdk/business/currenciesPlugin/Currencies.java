package com.alk.kucoinsdk.business.currenciesPlugin;

/**
 * Created by alksentrs (aleksander medella) on 18/06/18.
 */
public class Currencies {

    private Boolean success;
    private String code;
    private String msg;
    private Long timestamp;
    private CurrenciesData data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public CurrenciesData getData() {
        return data;
    }

    public void setData(CurrenciesData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{success:" + success + "," +
                "msg:\""+ msg + "\"," +
                "code:"+ code + "," +
                "timestamp=" + timestamp + "," +
                "data:" + data +
                "}";
    }
}
