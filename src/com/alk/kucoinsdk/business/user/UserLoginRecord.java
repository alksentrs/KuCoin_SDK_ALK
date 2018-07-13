package com.alk.kucoinsdk.business.user;

/**
 * Created by alksentrs (aleksander medella) on 19/06/18.
 */
public class UserLoginRecord {

    private String country;
    private String city;
    private String ip;
    private String context;
    private Long time;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "{" +
                "country:" + country + "," +
                "city:" + city + "," +
                "ip:" + ip + "," +
                "context:" + context + "," +
                "time:" + time +
                "}";
    }
}
