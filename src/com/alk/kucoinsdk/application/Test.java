package com.alk.kucoinsdk.application;

import com.alk.kucoinsdk.business.KucoinConnection;

/**
 * Created by alksentrs (aleksander medella) on 15/02/18.
 */
public class Test {

    public static void main(String[] args) {


        KucoinConnection kucoinConnection = new KucoinConnection();
        String [] coins = {"BTC", "NEO", "GAS"};
        String coin = "XRB";

        String [] symbols = {"NEO-BTC"};
        String symbol = "NEO-BTC";

        String [] markets = {"BTC"};
        String market = "BTC";

        String [] filters = {""}; //{"FAVOURITE","STICK"};
        String filter = ""; //"FAVOURITE"; "STICK";

        String currency = "BRL";
        String language = "en_US";

        String address = "adddress";
        String txOid = "txOid";
        String orderOid = "orderOid";

        String [] type = {"0"};
        String type2 = "DEPOSIT"; //"WITHDRAW";
        String type3 = ""; //"SELL";"BUY";

        String [] resolution = {"0"};

        String status = "FINISHED"; //"CANCEL"; "PENDING";

        double amount = 1;
        int page = 1;
        int limit = 12;
        double price = 0.00000001;

        long since = 1507479171l;
        long before = 1507480171l;

        boolean active = true;

        try {
            //OPEN
            System.out.println(kucoinConnection.open.getCurrencies().toString());
            System.out.println(kucoinConnection.open.getLanguageList().toString());
            System.out.println(kucoinConnection.open.getMarketTick(symbols).toString());
            System.out.println(kucoinConnection.open.getMarketOrderBooks(symbols,2,3,"").toString());
            System.out.println(kucoinConnection.open.getMarketOrderBooksBuy(symbols,2,3).toString());
            System.out.println(kucoinConnection.open.getMarketOrderBooksSell(symbols,2,3).toString());
            System.out.println(kucoinConnection.open.getMarketRecentlyDealOrders(symbols,2,3).toString());
            System.out.println(kucoinConnection.open.getMarketTradingMarkets().toString());
            System.out.println(kucoinConnection.open.getTrending(markets).toString());
            System.out.println(kucoinConnection.open.getMarketKLine(symbols,type,since,before,10).toString());
            System.out.println(kucoinConnection.open.getChartConfig().toString());
            System.out.println(kucoinConnection.open.getChartSymbols(symbol).toString());
            System.out.println(kucoinConnection.open.getChartHistory(symbol,resolution,since,before).toString());
            System.out.println(kucoinConnection.open.getCoinInfo(coin).toString());
            System.out.println(kucoinConnection.open.getCoins().toString());

            //LOGIN REQUIRED
            kucoinConnection.setApiKey("key");
            kucoinConnection.setSecret("secret");
            System.out.println(kucoinConnection.restrict.getUserInfo().toString());
            System.out.println(kucoinConnection.restrict.getUserTradingSymbolsTick(markets, symbols, filters).toString());
            System.out.println(kucoinConnection.restrict.setCurrency(currency).toString()); //not work
            System.out.println(kucoinConnection.restrict.setLanguage(language).toString()); //not work
            System.out.println(kucoinConnection.restrict.getDealtOrders(symbol).toString());
            System.out.println(kucoinConnection.restrict.getCoinDepositAddress(coin).toString());
             System.out.println(kucoinConnection.restrict.setWithdrawalApply(coin,amount,address).toString()); //not tested
             System.out.println(kucoinConnection.restrict.cancelWithdrawal(coin,txOid).toString()); //not tested
            System.out.println(kucoinConnection.restrict.getRecords(coin, type2, status, page).toString());
            System.out.println(kucoinConnection.restrict.getBalance(coin).toString());
            System.out.println(kucoinConnection.restrict.getBalanceList(limit,page).toString());
            System.out.println(kucoinConnection.restrict.getBalanceList(limit,page).toString());
             System.out.println(kucoinConnection.restrict.addOrder(symbol, type3, price, amount).toString()); //not tested
            System.out.println(kucoinConnection.restrict.getActiveOrders(symbol, type3).toString());
            System.out.println(kucoinConnection.restrict.getActiveOrders(symbol).toString());
            System.out.println(kucoinConnection.restrict.getActiveOrdersKv(symbol, type3).toString());
             System.out.println(kucoinConnection.restrict.cancelOrder(symbol, orderOid, type3).toString()); //not tested
             System.out.println(kucoinConnection.restrict.cancelAllOrder(symbol, type3).toString()); //not tested
            System.out.println(kucoinConnection.restrict.getDealtOrders(symbol, type3, limit, page, since, before).toString());
            System.out.println(kucoinConnection.restrict.getDealtOrdersSpecific(symbol, type3, limit, page).toString());
            System.out.println(kucoinConnection.restrict.getAllOrders(symbol, type3, active, limit, page, since, before).toString());
            System.out.println(kucoinConnection.restrict.getOrderDetails(symbol, type3, limit, page, orderOid).toString());
            System.out.println(kucoinConnection.restrict.getTradingSymbolsTick(market, symbol, filter).toString());
            System.out.println(kucoinConnection.restrict.getStickSymbols().toString());
            System.out.println(kucoinConnection.restrict.getFvouriteSymbols().toString());
            System.out.println(kucoinConnection.restrict.setFavouriteSymbol(symbol,1).toString()); //not work
            System.out.println(kucoinConnection.restrict.setStickSymbol(symbol,1).toString()); //not work


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

