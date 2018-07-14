package com.alk.kucoinsdk.business.trading;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderDealtSpecificData {

    private Integer total;
    private Boolean firstPage;
    private Boolean lastPage;
    private List<OrderDealtSpecificDataDatas> datas;
    private Integer currPageNo;
    private Integer limit;
    private Integer pageNos;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
    }

    public Boolean getLastPage() {
        return lastPage;
    }

    public void setLastPage(Boolean lastPage) {
        this.lastPage = lastPage;
    }

    public List<OrderDealtSpecificDataDatas> getDatas() {
        return datas;
    }

    public void setDatas(List<OrderDealtSpecificDataDatas> datas) {
        this.datas = datas;
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

    @Override
    public String toString() {
        return "{" +
                "total:" + total + "," +
                "firstPage:" + firstPage + "," +
                "lastPage:" + lastPage + "," +
                "datas:" + datas + "," +
                "currPageNo:" + currPageNo + "," +
                "limit:" + limit + "," +
                "pageNos:" + pageNos +
                "}";
    }
}
