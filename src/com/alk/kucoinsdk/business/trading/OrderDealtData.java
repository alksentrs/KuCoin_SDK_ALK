package com.alk.kucoinsdk.business.trading;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDealtData {

    private Integer total;
    private List<OrderDealtDataDatas> datas;
    private Integer limit;
    private Integer page;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<OrderDealtDataDatas> getDatas() {
        return datas;
    }

    public void setDatas(List<OrderDealtDataDatas> datas) {
        this.datas = datas;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "{" +
                "total:" + total + "," +
                "datas:" + datas + "," +
                "limit:" + limit + "," +
                "page:" + page + "}";
    }
}
