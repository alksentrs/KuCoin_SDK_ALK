package com.alk.kucoinsdk.business.user;

import com.alk.kucoinsdk.business.market.SymbolTickData;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class TradingSymbolTickData extends SymbolTickData {

    private String symbol;
    private Double change;
    private Boolean stick;
    private Boolean fav;
    private Boolean plus;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public Boolean getPlus() {
        return plus;
    }

    public void setPlus(Boolean plus) {
        this.plus = plus;
    }

    @Override
    public String toString() {
        return "{" +
                "symbol:" + symbol + "," +
                "change:" + change + "," +
                "stick:" + stick + "," +
                "fav:" + fav + "," +
                "plus:" + plus + "," +
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
