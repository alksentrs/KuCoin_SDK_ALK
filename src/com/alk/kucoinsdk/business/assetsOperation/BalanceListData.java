package com.alk.kucoinsdk.business.assetsOperation;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 12/07/18.
 */
public class BalanceListData {

    private Integer total;
    private Integer currPageNo;
    private Integer limit;
    private Integer pageNos;
    private List<BalanceData> datas;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPageNos() {
        return pageNos;
    }

    public void setPageNos(Integer pageNos) {
        this.pageNos = pageNos;
    }

    public List<BalanceData> getDatas() {
        return datas;
    }

    public void setDatas(List<BalanceData> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "{" +
                "total:" + total + "," +
                "currPageNo:" + currPageNo + "," +
                "limit:" + limit + "," +
                "pageNos:" + pageNos + "," +
                "datas:" + datas +
                "}";
    }
}
