package com.alk.kucoinsdk.business.language;

/**
 * Created by alksentrs (aleksander medella) on 20/06/18.
 */
public class ChangeLanguage {

    private Boolean success;
    private String code;
    private String msg;

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

    @Override
    public String toString() {
        return "{success:" + success + "," +
                "code:"+ code + "," +
                "msg:\"" + msg + "\"" +
                "}";
    }
}
