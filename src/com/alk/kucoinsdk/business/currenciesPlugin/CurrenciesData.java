package com.alk.kucoinsdk.business.currenciesPlugin;

import java.util.List;
import java.util.Map;

/**
 * Created by alksentrs (aleksander medella) on 18/06/18.
 */
public class CurrenciesData {

    private Map<String, Map<String,Double>> rates;
    private List<List<String>> currencies;

    public Map<String, Map<String, Double>> getRates() {
        return rates;
    }

    public void setRates(Map<String, Map<String, Double>> rates) {
        this.rates = rates;
    }

    public List<List<String>> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<List<String>> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "{rates:" + rates + "," +
                "currencies:" + currencies +
                " }";
    }
}
