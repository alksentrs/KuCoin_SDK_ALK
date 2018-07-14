package com.alk.kucoinsdk.business.market;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class SymbolTickData {

    protected String coinType;
    protected Boolean trading;
    protected Double lastDealPrice;
    protected Double buy;
    protected Double sell;
    protected String coinTypePair;
    protected Integer sort;
    protected Double feeRate;
    protected Double volValue;
    protected Double high;
    protected Long datetime;
    protected Double vol;
    protected Double low;
    protected Double changeRate;

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public Boolean getTrading() {
        return trading;
    }

    public void setTrading(Boolean trading) {
        this.trading = trading;
    }

    public Double getLastDealPrice() {
        return lastDealPrice;
    }

    public void setLastDealPrice(Double lastDealPrice) {
        this.lastDealPrice = lastDealPrice;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getSell() {
        return sell;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }

    public String getCoinTypePair() {
        return coinTypePair;
    }

    public void setCoinTypePair(String coinTypePair) {
        this.coinTypePair = coinTypePair;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Double getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Double feeRate) {
        this.feeRate = feeRate;
    }

    public Double getVolValue() {
        return volValue;
    }

    public void setVolValue(Double volValue) {
        this.volValue = volValue;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    public Double getVol() {
        return vol;
    }

    public void setVol(Double vol) {
        this.vol = vol;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    @Override
    public String toString() {
        return "{" +
                "coinType:" + coinType + "," +
                "trading:" + trading + "," +
                "lastDealPrice:" + lastDealPrice + "," +
                "buy:" + buy + "," +
                "sell:" + sell + "," +
                "coinTypePair:" + coinTypePair + "," +
                "sort:" + sort + "," +
                "feeRate:" + feeRate + "," +
                "volValue:" + volValue + "," +
                "high:" + high + "," +
                "datetime:" + datetime + "," +
                "vol:" + vol + "," +
                "low:" + low + "," +
                "changeRate:" + changeRate +
                "}";
    }
}
