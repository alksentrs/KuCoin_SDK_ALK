package com.alk.kucoinsdk.business.user;


/**
 * Created by alksentrs (aleksander medella) on 17/01/18.
 */

public class UserKey {

    private String exchange;
    private String apiKey;
    private String secret;

    public UserKey(String exchange, String apiKey, String secret) {
        this.exchange = exchange;
        this.apiKey = apiKey;
        this.secret = secret;
    }

    public String getExchange() {
        return exchange;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
