package com.alk.kucoinsdk.business.marketForUser;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class MarketSymbolsData {

    private String coinType;
    private String trading;
    private String lastDealPrice;
    private Integer buy;
    private Integer sell;
    private String coinTypePair;
    private Integer sort;
    private Double feeRate;
    private Long volValue;
    private Integer high;
    private Long datetime;
    private Long vol;
    private Integer low;
    private Double changeRate;
    private Double change;
    private Boolean stick;
    private Boolean fav;

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public String getTrading() {
        return trading;
    }

    public void setTrading(String trading) {
        this.trading = trading;
    }

    public String getLastDealPrice() {
        return lastDealPrice;
    }

    public void setLastDealPrice(String lastDealPrice) {
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

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
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

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Boolean getStick() {
        return stick;
    }

    public void setStick(Boolean stick) {
        this.stick = stick;
    }

    public Boolean getFav() {
        return fav;
    }

    public void setFav(Boolean fav) {
        this.fav = fav;
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
                "changeRate:" + changeRate + "," +
                "change:" + change + "," +
                "stick:" + stick + "," +
                "fav:" + fav +
                "}";
    }
}
