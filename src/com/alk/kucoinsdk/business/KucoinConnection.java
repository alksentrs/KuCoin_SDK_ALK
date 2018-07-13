package com.alk.kucoinsdk.business;


import android.util.Base64;

import com.alk.kucoinsdk.business.assetsOperation.*;
import com.alk.kucoinsdk.business.currenciesPlugin.ChangeCurrency;
import com.alk.kucoinsdk.business.currenciesPlugin.Currencies;
import com.alk.kucoinsdk.business.language.ChangeLanguage;
import com.alk.kucoinsdk.business.language.LanguageList;
import com.alk.kucoinsdk.business.market.*;
import com.alk.kucoinsdk.business.trading.*;
import com.alk.kucoinsdk.business.user.UserInfo;
import com.alk.kucoinsdk.business.user.Symbols;
import com.alk.kucoinsdk.business.user.TradingSymbolsTick;
import com.alk.kucoinsdk.network.HttpsClient;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;


/**
 * Created by alksentrs (aleksander medella) on 15/02/18.
 */

public class KucoinConnection {

    private static final String ENCRYPTION_ALGORITHM_SHA512 = "HmacSHA512";
    private static final String ENCRYPTION_ALGORITHM_SHA256 = "HmacSHA256";

    private static final String HOST_DEMO_2 = "https://private-anon-46dbcaee9f-kucoinapidocs.apiary-proxy.com";
    private static final String HOST_DEMO_1 = "https://private-anon-84f1edbc7c-kucoinapidocs.apiary-proxy.com";
    private static final String HOST_PRODUCTION = "https://api.kucoin.com";
    private static final String HOST = HOST_PRODUCTION;
    private static final String VERSION = "/v1";

    private static final String CURRENCIES = VERSION +               "/open/currencies";
    private static final String LANG_LIST = VERSION +                "/open/lang-list";
    private static final String MARKET_TICK = VERSION +              "/open/tick";
    private static final String MARKET_ORDERS = VERSION +            "/open/orders";
    private static final String MARKET_ORDERS_BUY = VERSION +        "/open/orders-buy";
    private static final String MARKET_ORDERS_SELL = VERSION +       "/open/orders-sell";
    private static final String MARKET_DEAL_ORDERS = VERSION +       "/open/deal-orders";
    private static final String MARKET_TRADING_MARKETS = VERSION +   "/open/markets";
    private static final String MARKET_KLINE = VERSION +             "/open/kline";
    private static final String MARKET_CHART_CONFIG = VERSION +      "/open/chart/config";
    private static final String MARKET_CHART_SYMBOLS = VERSION +     "/open/chart/symbols";
    private static final String MARKET_CHART_HISTORY = VERSION +     "/open/chart/history";

    private static final String MARKET_TRADING_SYMBOLS_TICK = VERSION +  "/market/open/symbols";
    private static final String MARKET_TRENDINGS = VERSION +             "/market/open/coins-trending";
    private static final String MARKET_COIN_INFO = VERSION +             "/market/open/coin-info";
    private static final String MARKET_COINS = VERSION +                 "/market/open/coins";

    private static final String MARKET_SYMBOLS = VERSION +          "/market/symbols";
    private static final String MARKET_STICK_SYMBOLS = VERSION +    "/market/stick-symbols";
    private static final String MARKET_FAVORITE_SYMBOLS = VERSION + "/market/fav-symbols";
    private static final String MARKET_SYMBOL_FAVORITE = VERSION +  "/market/symbol/fav";
    private static final String MARKET_SYMBOL_STICK = VERSION +     "/market/symbol/stick";

    private static final String USER_INFO = VERSION +            "/user/info";
    private static final String USER_CHANGE_CURRENCY = VERSION + "/user/change-currency";
    private static final String USER_CHANGE_LANGUAGE = VERSION + "/user/change-lang";

    private static final String ACCOUNT  = VERSION + "/account";
    private static final String _BALANCE =           "/balance";
    private static final String _WALLET_RECORDS =    "/wallet/records";
    private static final String _WALLET_ADDRESS =    "/wallet/address";
    private static final String _WITHDRAW_APPLY =    "/withdraw/apply";
    private static final String _WITHDRAW_CANCEL =   "/withdraw/cancel";
    private static final String _BALANCES =          "/balances";

    private static final String ORDER = VERSION +            "/order";
    private static final String ORDER_ACTIVE = VERSION +     "/order/active";
    private static final String ORDER_ACTIVE_MAP = VERSION + "/order/active-map";
    private static final String CANCEL_ORDER = VERSION +     "/cancel-order";
    private static final String ORDER_CANCEL_ALL = VERSION + "/order/cancel-all";
    private static final String ORDER_DEALT = VERSION +      "/order/dealt";
    private static final String ORDERS = VERSION +           "/orders";
    private static final String DEAL_ORDERS = VERSION +           "/deal-orders";
    private static final String ORDER_DETAIL = VERSION +     "/order/detail";


    private static final String QUERY_COIN = "coin";
    private static final String QUERY_COINS = "coins";
    private static final String QUERY_PAGE = "page";
    private static final String QUERY_SYMBOL = "symbol";
    private static final String QUERY_GROUP = "group";
    private static final String QUERY_LIMIT = "limit";
    private static final String QUERY_DIRECTION = "direction";
    private static final String QUERY_TYPE = "type";
    private static final String QUERY_STATUS = "status";
    private static final String QUERY_CURRENCY = "currency";
    private static final String QUERY_LANGUAGE = "lang";
    private static final String QUERY_MARKET = "market";
    private static final String QUERY_FROM = "from";
    private static final String QUERY_TO = "to";
    private static final String QUERY_FILTER = "filter";
    private static final String QUERY_FAV = "fav";
    private static final String QUERY_RESOLUTION = "resolution";
    private static final String QUERY_AMOUNT = "amount";
    private static final String QUERY_ADDRESS = "address";
    private static final String QUERY_TX_OID = "txOid";
    private static final String QUERY_PRICE = "price";
    private static final String QUERY_ORDER_OID ="orderOid";
    private static final String QUERY_SINCE = "since";
    private static final String QUERY_BEFORE = "before";
    private static final String QUERY_ACTIVE = "active";
    private static final String QUERY_STICK = "stick";

    private static final String HEADER_KC_API_KEY = "KC-API-KEY";
    private static final String HEADER_KC_API_NONCE = "KC-API-NONCE";
    private static final String HEADER_KC_API_SIGNATURE = "KC-API-SIGNATURE";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String HEADER_CONTENT_TYPE_VALUE = "application/json";

    public static final String BUY = "BUY";
    public static final String SELL = "SELL";
    public static final String DEPOSIT = "DEPOSIT";
    public static final String WITHDRAW = "WITHDRAW";
    public static final String FINISHED = "FINISHED";
    public static final String CANCEL = "CANCEL";
    public static final String PENDING = "PENDING";
    public static final String FAVOURITE = "FAVOURITE";
    public static final String STICK = "STICK";
    public static final String [] FILTER = {"FAVOURITE","STICK"};
    public static final String [] STATUS = {"FINISHED","CANCEL","PENDING"};
    public static final String [] DIRECTION = {"BUY","SELL"};

    private String apiKey;
    private String secret;
    private HttpsClient httpsClient;
    private ObjectMapper objectMapper = new ObjectMapper();

    public Open open;
    public Restrict restrict;

    public KucoinConnection() {
        httpsClient = new HttpsClient();
        open = new Open();
        restrict = new Restrict();
    }

    public KucoinConnection(String apiKey, String secret) {
        httpsClient = new HttpsClient();
        open = new Open();
        restrict = new Restrict();
        this.apiKey = apiKey;
        this.secret = secret;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    private byte [] fixBytesArray(byte [] in) {

        byte [] aux = new byte[in.length];
        int k = 0;
        for (int i=0; i<in.length; i++) if (in[i] != 10) aux[k++]=in[i];
        byte [] out = new byte[k];
        for (int i=0; i<k; i++)  out[i]=aux[i];

        return out;
    }

    private String getQueryString(String [] querys, String delimiter) {
        Arrays.sort(querys);
        return join(querys,delimiter);
    }

    private String join(String [] array, String delimiter) {
        String join = ("" + Arrays.asList(array)).replaceAll("(^.|.$)", "").replace(", ", delimiter );
        return join;
    }

    private String encode(String key, String data, String encryptionAlgorithm) throws Exception {
        if ((null!=key)&&(null!=data)) {
            Mac sha256_HMAC = Mac.getInstance(encryptionAlgorithm);
            byte [] keyBytes = key.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, encryptionAlgorithm);
            sha256_HMAC.init(secretKeySpec);

            byte [] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            dataBytes = fixBytesArray(dataBytes);
            byte [] bytes = sha256_HMAC.doFinal(dataBytes);

            Formatter formatter = new Formatter();
            for (byte b : bytes) formatter.format("%02x", b);
            return formatter.toString();
        }
        return "";
    }

    private Map<String,String> getHeaders(String forSign, String nonce) throws Exception {

        String signatureEncoded = Base64.encodeToString(forSign.getBytes("UTF-8"),Base64.DEFAULT);
        String signature = encode(secret, signatureEncoded,ENCRYPTION_ALGORITHM_SHA256);

        Map<String,String> headers = new HashMap<>();
        headers.put(HEADER_KC_API_KEY,apiKey);
        headers.put(HEADER_KC_API_SIGNATURE,signature);
        headers.put(HEADER_KC_API_NONCE,nonce);

        return headers;
    }

    private String connect(String url, Map<String,String> headers) {
        String ret = null;
        try {
            ret = httpsClient.connect(url,headers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    private String getResponse(String action, boolean isOpen, String [] query) throws Exception {

        String url;
        String queryString = null;
        if (null!=query) {
            queryString = getQueryString(query,"&");
            url = HOST + action + "?" + queryString;
        } else {
            url = HOST + action;
        }
        Map<String, String> headers = null;
        if (!isOpen) {
            String nonce = String.valueOf(getServerTime());
            String forSign = action + "/" + nonce + "/";
            if (null!=query) {
                forSign =  forSign + queryString ;
            }
            headers = getHeaders(forSign, nonce);
        }

        return connect(url, headers);
    }

    private Long getServerTime() throws Exception {

        String[] query = {QUERY_COINS + "=BTC"};
        String resp = getResponse(CURRENCIES, true, query);
        if (null != resp) {
            Currencies curr = objectMapper.readValue(resp, Currencies.class);
            return curr.getTimestamp();
        }
        return null;
    }

    public class Open {

        public Currencies getCurrencies() throws Exception {

            String resp = getResponse(CURRENCIES, true, null);

            if (null != resp) {
                Currencies curr = objectMapper.readValue(resp, Currencies.class);
                return curr;
            }
            return null;
        }

        public LanguageList getLanguageList() throws Exception {

            String[] query = null; //{ QUERY_USER_NAME+"="+username,
            //QUERY_PASSWORD+"="+password};
            String resp = getResponse(LANG_LIST, true, query);

            if (null != resp) {
                LanguageList languageList = objectMapper.readValue(resp, LanguageList.class);
                return languageList;
            }
            return null;
        }

        public Tick getMarketTick(String[] symbols) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + join(symbols, ",")};
            String resp = getResponse(MARKET_TICK, true, query);

            if (null != resp) {
                Tick tick = objectMapper.readValue(resp, Tick.class);
                return tick;
            }
            return null;
        }

        public OrderBook getMarketOrderBooks(String[] symbols, int group, int limit, String direction) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + join(symbols, ","),
                    QUERY_GROUP + "=" + group,
                    QUERY_LIMIT + "=" + limit,
                    QUERY_DIRECTION + "=" + direction};
            String resp = getResponse(MARKET_ORDERS, true, query);

            if (null != resp) {
                OrderBook orderBook = objectMapper.readValue(resp, OrderBook.class);
                return orderBook;
            }
            return null;
        }

        public OrderBookDirection getMarketOrderBooksBuy(String[] symbols, int group, int limit) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + join(symbols, ","),
                    QUERY_GROUP + "=" + group,
                    QUERY_LIMIT + "=" + limit};
            String resp = getResponse(MARKET_ORDERS_BUY, true, query);

            if (null != resp) {
                OrderBookDirection orderBook = objectMapper.readValue(resp, OrderBookDirection.class);
                return orderBook;
            }
            return null;
        }

        public OrderBookDirection getMarketOrderBooksSell(String[] symbols, int group, int limit) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + join(symbols, ","),
                    QUERY_GROUP + "=" + group,
                    QUERY_LIMIT + "=" + limit};
            String resp = getResponse(MARKET_ORDERS_SELL, true, query);

            if (null != resp) {
                OrderBookDirection orderBook = objectMapper.readValue(resp, OrderBookDirection.class);
                return orderBook;
            }
            return null;
        }

        public DealOrder getMarketRecentlyDealOrders(String[] symbols, int group, int limit) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + join(symbols, ","),
                    QUERY_GROUP + "=" + group,
                    QUERY_LIMIT + "=" + limit};
            String resp = getResponse(MARKET_DEAL_ORDERS, true, query);

            if (null != resp) {
                DealOrder dealOrder = objectMapper.readValue(resp, DealOrder.class);
                return dealOrder;
            }
            return null;
        }

        public TradingMarkets getMarketTradingMarkets() throws Exception {

            String[] query = null;
            String resp = getResponse(MARKET_TRADING_MARKETS, true, query);

            if (null != resp) {
                TradingMarkets tradingMarkets = objectMapper.readValue(resp, TradingMarkets.class);
                return tradingMarkets;
            }
            return null;
        }

        public SymbolsTick getTradingSymbolsTick(String[] markets) throws Exception {

            String[] query = {QUERY_MARKET + "=" + join(markets, ",")};
            String resp = getResponse(MARKET_TRADING_SYMBOLS_TICK, true, query);
            if (null != resp) {
                SymbolsTick symbolsTick = objectMapper.readValue(resp, SymbolsTick.class);
                return symbolsTick;
            }
            return null;
        }

        public Trendings getTrending(String[] markets) throws Exception {

            String[] query = {QUERY_MARKET + "=" + join(markets, ",")};
            String resp = getResponse(MARKET_TRENDINGS, true, query);

            if (null != resp) {
                Trendings trendings = objectMapper.readValue(resp, Trendings.class);
                return trendings;
            }
            return null;
        }

        public KLine getMarketKLine(String[] symbols, String[] type, Long from, Long to, int limit) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + join(symbols, ","),
                    QUERY_FROM + "=" + from,
                    QUERY_TO + "=" + to,
                    QUERY_LIMIT + "=" + limit};
            String resp = getResponse(MARKET_KLINE, true, query);

            if (null != resp) {
                KLine kLine = objectMapper.readValue(resp, KLine.class);
                return kLine;
            }
            return null;
        }

        public ChartConfig getChartConfig() throws Exception {

            String[] query = null;
            String resp = getResponse(MARKET_CHART_CONFIG, true, query);

            if (null != resp) {
                ChartConfig kLineConfig = objectMapper.readValue(resp, ChartConfig.class);
                return kLineConfig;
            }
            return null;
        }

        public ChartSymbols getChartSymbols(String symbol) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + symbol};
            String resp = getResponse(MARKET_CHART_SYMBOLS, true, query);

            if (null != resp) {
                ChartSymbols chartSymbols = objectMapper.readValue(resp, ChartSymbols.class);
                return chartSymbols;
            }
            return null;
        }

        public ChartHistory getChartHistory(String symbol, String[] resolution, Long from, Long to) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + symbol, ",",
                    QUERY_RESOLUTION + "=" + join(resolution, ","),
                    QUERY_FROM + "=" + from, ",",
                    QUERY_TO + "=" + to};
            String resp = getResponse(MARKET_CHART_HISTORY, true, query);

            if (null != resp) {
                ChartHistory chartHistory = objectMapper.readValue(resp, ChartHistory.class);
                return chartHistory;
            }
            return null;
        }

        public CoinInfo getCoinInfo(String coin) throws Exception {

            String[] query = {QUERY_COIN + "=" + coin};
            String resp = getResponse(MARKET_COIN_INFO, true, query);

            if (null != resp) {
                CoinInfo coinInfo = objectMapper.readValue(resp, CoinInfo.class);
                return coinInfo;
            }
            return null;
        }

        public CoinList getCoins() throws Exception {

            String[] query = null;
            String resp = getResponse(MARKET_COINS, true, query);

            if (null != resp) {
                CoinList coins = objectMapper.readValue(resp, CoinList.class);
                return coins;
            }
            return null;
        }

    }

    public class Restrict {

        public ChangeCurrency setCurrency(String currency) throws Exception {

            String[] query = {QUERY_CURRENCY + "=" + currency};
            String resp = getResponse(USER_CHANGE_CURRENCY, false, query);
            System.out.println(resp);
            if (null != resp) {
                ChangeCurrency changeCurrency = objectMapper.readValue(resp, ChangeCurrency.class);
                return changeCurrency;
            }
            return null;
        }

        public ChangeLanguage setLanguage(String lang) throws Exception {

            String[] query = {QUERY_LANGUAGE + "=" + lang};
            String resp = getResponse(USER_CHANGE_LANGUAGE, false, query);

            if (null != resp) {
                ChangeLanguage changeLanguage = objectMapper.readValue(resp, ChangeLanguage.class);
                return changeLanguage;
            }
            return null;

        }

        public UserInfo getUserInfo() throws Exception {

            String resp = getResponse(USER_INFO, false, null);

            if (null != resp) {
                UserInfo userInfo = objectMapper.readValue(resp, UserInfo.class);
                return userInfo;
            }
            return null;
        }

        public OrderDealtSpecific getDealtOrders(String symbol) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + symbol};
            String resp = getResponse(DEAL_ORDERS, false, query);

            if (null != resp) {
                OrderDealtSpecific orderDealtSpecific = objectMapper.readValue(resp, OrderDealtSpecific.class);
                return orderDealtSpecific;
            }
            return null;
        }

        public TradingSymbolsTick getUserTradingSymbolsTick(String[] markets, String[] symbols, String[] filters) throws Exception {

            String[] query = {QUERY_MARKET + "=" + join(markets, ","),
                    QUERY_SYMBOL + "=" + join(symbols, ","),
                    QUERY_FILTER + "=" + join(filters, ",")};
            String resp = getResponse(MARKET_SYMBOLS, false, query);

            if (null != resp) {
                TradingSymbolsTick userSymbolsTick = objectMapper.readValue(resp, TradingSymbolsTick.class);
                return userSymbolsTick;
            }
            return null;
        }

        public Symbols getUserStickSymbols() throws Exception {

            String[] query = null;
            String resp = getResponse(MARKET_STICK_SYMBOLS, false, query);
            if (null != resp) {
                Symbols userSymbols = objectMapper.readValue(resp, Symbols.class);
                return userSymbols;
            }
            return null;
        }

        public Symbols getUserFavoriteSymbols() throws Exception {

            String[] query = null;
            String resp = getResponse(MARKET_FAVORITE_SYMBOLS, false, query);
            if (null != resp) {
                Symbols userSymbols = objectMapper.readValue(resp, Symbols.class);
                return userSymbols;
            }
            return null;
        }

        public KucoinResponse setUserFavoriteSymbol(String symbol, int fav) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_FAV + "=" + fav};
            String resp = getResponse(MARKET_SYMBOL_FAVORITE, false, query);
            if (null != resp) {
                KucoinResponse kucoinResponse = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse;
            }
            return null;
        }

        public KucoinResponse setUserStickSymbol(String symbol, int fav) throws Exception {

            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_FAV + "=" + fav};
            String resp = getResponse(MARKET_SYMBOL_STICK, false, query);

            if (null != resp) {
                KucoinResponse kucoinResponse2 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse2;
            }
            return null;
        }

        public DepositAddress getCoinDepositAddress(String coin) throws Exception {

            String[] query = null;
            String action = ACCOUNT + "/" + coin.toUpperCase() + _WALLET_ADDRESS;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                DepositAddress depositAddress = objectMapper.readValue(resp, DepositAddress.class);
                return depositAddress;
            }
            return null;
        }

        public KucoinResponse setWithdrawalApply(String coin, Double amount, String address) throws Exception {
            String[] query = {QUERY_COIN + "=" + coin,
                    QUERY_AMOUNT + "=" + amount,
                    QUERY_ADDRESS + "=" + address};
            String action = ACCOUNT + "/" + coin.toUpperCase() + _WITHDRAW_APPLY;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                KucoinResponse kucoinResponse1 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse1;
            }
            return null;
        }

        public KucoinResponse cancelWithdrawal(String coin, String txOid) throws Exception {
            String[] query = {QUERY_COIN + "=" + coin,
                    QUERY_TX_OID + "=" + txOid};
            String action = ACCOUNT + "/" + coin.toUpperCase() + _WITHDRAW_CANCEL;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                KucoinResponse kucoinResponse1 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse1;
            }
            return null;
        }

        public ListRecords getRecords(String coin, String type, String status, int page) throws Exception {
            String[] query = {QUERY_COIN + "=" + coin,
                    QUERY_TYPE + "=" + type,
                    QUERY_STATUS + "=" + status,
                    QUERY_PAGE + "=" + page};
            String action = ACCOUNT + "/" + coin.toUpperCase() + _WALLET_RECORDS;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                ListRecords listRecords = objectMapper.readValue(resp, ListRecords.class);
                return listRecords;
            }
            return null;
        }

        public Balance getBalance(String coin) throws Exception {
            String[] query = null;
            String action = ACCOUNT + "/" + coin.toUpperCase() + _BALANCE;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                Balance balance = objectMapper.readValue(resp, Balance.class);
                return balance;
            }
            return null;
        }

        public BalanceList getBalanceList(int limit, int page) throws Exception {
            String[] query = {QUERY_LIMIT + "=" + limit,
                    QUERY_PAGE + "=" + page};
            String action = ACCOUNT + _BALANCES;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                BalanceList balanceList = objectMapper.readValue(resp, BalanceList.class);
                return balanceList;
            }
            return null;
        }

        public Order addOrder(String symbol, String type, double price, double amount) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type,
                    QUERY_PRICE + "=" + price,
                    QUERY_AMOUNT + "=" + amount};
            String action = ORDER;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                Order order = objectMapper.readValue(resp, Order.class);
                return order;
            }
            return null;
        }

        public ActiveOrder getActiveOrders(String symbol, String type) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type};
            String action = ORDER_ACTIVE;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                ActiveOrder activeOrder = objectMapper.readValue(resp, ActiveOrder.class);
                return activeOrder;
            }
            return null;
        }

        public ActiveOrderFull getActiveOrders(String symbol) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol};
            String action = ORDER_ACTIVE;
            String resp = getResponse(action, false, query);

            if (null != resp) {
                ActiveOrderFull activeOrder = objectMapper.readValue(resp, ActiveOrderFull.class);
                return activeOrder;
            }
            return null;
        }

        public ActiveOrderKv getActiveOrdersKv(String symbol, String type) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type};
            String action = ORDER_ACTIVE_MAP;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                ActiveOrderKv activeOrder = objectMapper.readValue(resp, ActiveOrderKv.class);
                return activeOrder;
            }
            return null;
        }

        public KucoinResponse cancelOrder(String symbol, String orderOid, String type) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_ORDER_OID + "=" + orderOid,
                    QUERY_TYPE + "=" + type};
            String action = CANCEL_ORDER;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                KucoinResponse kucoinResponse1 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse1;
            }
            return null;
        }

        public KucoinResponse cancelAllOrder(String symbol, String type) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type};
            String action = ORDER_CANCEL_ALL;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                KucoinResponse kucoinResponse1 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse1;
            }
            return null;
        }

        public OrderDealt getDealtOrders(String symbol, String type, int limit, int page, long since, long before) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type,
                    QUERY_LIMIT + "=" + limit,
                    QUERY_PAGE + "=" + page,
                    QUERY_SINCE + "=" + since,
                    QUERY_BEFORE + "=" + before};
            String action = ORDER_DEALT;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                OrderDealt orderDealt = objectMapper.readValue(resp, OrderDealt.class);
                return orderDealt;
            }
            return null;
        }

        public OrderDealtSpecific getDealtOrdersSpecific(String symbol, String type, int limit, int page) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type,
                    QUERY_LIMIT + "=" + limit,
                    QUERY_PAGE + "=" + page};
            String action = DEAL_ORDERS;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                OrderDealtSpecific orderDealtSpecific = objectMapper.readValue(resp, OrderDealtSpecific.class);
                return orderDealtSpecific;
            }
            return null;
        }

        public Orders getAllOrders(String symbol, String direction, boolean active, int limit, int page, long since, long before) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_DIRECTION + "=" + direction,
                    QUERY_ACTIVE + "=" + active,
                    QUERY_LIMIT + "=" + limit,
                    QUERY_PAGE + "=" + page,
                    QUERY_SINCE + "=" + since,
                    QUERY_BEFORE + "=" + before};
            String action = ORDERS;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                Orders orders = objectMapper.readValue(resp, Orders.class);
                return orders;
            }
            return null;
        }

        public OrderDetails getOrderDetails(String symbol, String type, int limit, int page, String orderOid) throws Exception {
            String[] query = {QUERY_SYMBOL + "=" + symbol,
                    QUERY_TYPE + "=" + type,
                    QUERY_LIMIT + "=" + limit,
                    QUERY_PAGE + "=" + page,
                    QUERY_ORDER_OID + "=" + orderOid};
            String action = ORDER_DETAIL;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                OrderDetails orderDetails = objectMapper.readValue(resp, OrderDetails.class);
                return orderDetails;
            }
            return null;
        }

        public TradingSymbolsTick getTradingSymbolsTick(String market, String symbol, String filter) throws Exception {
            String[] query = {QUERY_MARKET + "=" + market,
                    QUERY_SYMBOL + "=" + symbol,
                    QUERY_FILTER + "=" + filter};
            String action = MARKET_SYMBOLS;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                TradingSymbolsTick tradingSymbolsTick = objectMapper.readValue(resp, TradingSymbolsTick.class);
                return tradingSymbolsTick;
            }
            return null;
        }

        public Symbols getStickSymbols() throws Exception {
            String[] query = null;
            String action = MARKET_STICK_SYMBOLS;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                Symbols stickSymbols = objectMapper.readValue(resp, Symbols.class);
                return stickSymbols;
            }
            return null;
        }

        public Symbols getFvouriteSymbols() throws Exception {
            String[] query = null;
            String action = MARKET_FAVORITE_SYMBOLS;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                Symbols stickSymbols = objectMapper.readValue(resp, Symbols.class);
                return stickSymbols;
            }
            return null;
        }

        public KucoinResponse setFavouriteSymbol(String symbol, int fav) throws Exception {
            String[] query = {QUERY_FAV + "=" + fav, QUERY_SYMBOL + "=" + symbol};
            String action = MARKET_SYMBOL_FAVORITE;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                KucoinResponse kucoinResponse1 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse1;
            }
            return null;
        }

        public KucoinResponse setStickSymbol(String symbol, int stick) throws Exception {
            String[] query = {QUERY_STICK + "=" + stick,
                    QUERY_SYMBOL + "=" + symbol};
            String action = MARKET_SYMBOL_STICK;
            String resp = getResponse(action, false, query);
            if (null != resp) {
                KucoinResponse kucoinResponse1 = objectMapper.readValue(resp, KucoinResponse.class);
                return kucoinResponse1;
            }
            return null;
        }
    }
}
