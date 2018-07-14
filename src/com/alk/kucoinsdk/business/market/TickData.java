package com.alk.kucoinsdk.business.market;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class TickData {

    private String coinType;
    private Boolean trading;
    private String symbol;
    private Integer lastDealPrice;
    private Integer buy;
    private Integer sell;
    private Double change;
    private String coinTypePair;
    private Integer sort;
    private Double feeRate;
    private Long volValue;
    private Long high;
    private Long datetime;
    private Long vol;
    private Long low;
    private Double changeRate;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getLastDealPrice() {
        return lastDealPrice;
    }

    public void setLastDealPrice(Integer lastDealPrice) {
        this.lastDealPrice = lastDealPrice;
    }

    public Integer getBuy() {
        return buy;
    }

    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    public Integer getSell() {
        return sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
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

    public Long getVolValue() {
        return volValue;
    }

    public void setVolValue(Long volValue) {
        this.volValue = volValue;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    public Long getVol() {
        return vol;
    }

    public void setVol(Long vol) {
        this.vol = vol;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
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
                "symbol:" + symbol + "," +
                "lastDealPrice:" + lastDealPrice + "," +
                "buy:" + buy + "," +
                "sell:" + sell + "," +
                "change:" + change + "," +
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
