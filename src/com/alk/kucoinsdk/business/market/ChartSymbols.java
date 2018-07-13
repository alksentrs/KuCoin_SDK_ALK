package com.alk.kucoinsdk.business.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 26/06/18.
 */
public class ChartSymbols {

    private String ticker;
    private Integer minmov;
    private Integer minmov2;
    private String session;
    private String timezone;
    private Boolean has_intraday;
    private String description;
    private List<String> supported_resolutions;
    private String type;
    private String currency_code;
    @JsonProperty("exchange-listed")
    private String exchange_listed;
    private Integer volume_precision;
    private Integer pointvalue;
    private String name;
    @JsonProperty("exchange-traded")
    private String exchange_traded;
    private Long pricescale;
    private Boolean has_no_volume;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Integer getMinmov() {
        return minmov;
    }

    public void setMinmov(Integer minmov) {
        this.minmov = minmov;
    }

    public Integer getMinmov2() {
        return minmov2;
    }

    public void setMinmov2(Integer minmov2) {
        this.minmov2 = minmov2;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getHas_intraday() {
        return has_intraday;
    }

    public void setHas_intraday(Boolean has_intraday) {
        this.has_intraday = has_intraday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSupported_resolutions() {
        return supported_resolutions;
    }

    public void setSupported_resolutions(List<String> supported_resolutions) {
        this.supported_resolutions = supported_resolutions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getExchange_listed() {
        return exchange_listed;
    }

    public void setExchange_listed(String exchange_listed) {
        this.exchange_listed = exchange_listed;
    }

    public Integer getVolume_precision() {
        return volume_precision;
    }

    public void setVolume_precision(Integer volume_precision) {
        this.volume_precision = volume_precision;
    }

    public Integer getPointvalue() {
        return pointvalue;
    }

    public void setPointvalue(Integer pointvalue) {
        this.pointvalue = pointvalue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange_traded() {
        return exchange_traded;
    }

    public void setExchange_traded(String exchange_traded) {
        this.exchange_traded = exchange_traded;
    }

    public Long getPricescale() {
        return pricescale;
    }

    public void setPricescale(Long pricescale) {
        this.pricescale = pricescale;
    }

    public Boolean getHas_no_volume() {
        return has_no_volume;
    }

    public void setHas_no_volume(Boolean has_no_volume) {
        this.has_no_volume = has_no_volume;
    }

    @Override
    public String toString() {
        return "{" +
                "ticker:" + ticker + "," +
                "minmov:" + minmov + "," +
                "minmov2:" + minmov2 + "," +
                "session:" + session + "," +
                "timezone:" + timezone + "," +
                "has_intraday:" + has_intraday + "," +
                "description:" + description + "," +
                "supported_resolutions:" + supported_resolutions + "," +
                "type:" + type + "," +
                "currency_code:" + currency_code + "," +
                "exchange-listed:" + exchange_listed + "," +
                "volume_precision:" + volume_precision + "," +
                "pointvalue:" + pointvalue + "," +
                "name:" + name + "," +
                "exchange-traded:" + exchange_traded + "," +
                "pricescale:" + pricescale + "," +
                "has_no_volume:" + has_no_volume + "}";
    }
}
