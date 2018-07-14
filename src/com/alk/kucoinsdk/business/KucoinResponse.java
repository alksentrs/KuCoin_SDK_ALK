package com.alk.kucoinsdk.business;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class KucoinResponse {

    protected Boolean success;
    protected String code;
    protected String msg;
    protected Long timestamp;

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

    @Override
    public String toString() {
        return "{" +
                "success:" + success + "," +
                "code:" + code + "," +
                "msg:" + msg + "," +
                "timestamp:" + timestamp +
                "}";
    }
}
