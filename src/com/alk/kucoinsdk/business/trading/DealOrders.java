package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class DealOrders {

    private Integer total;
    private Boolean firstPage;
    private Boolean lastPage;
    private Integer currPageNo;
    private Integer limit;
    private Integer pageNos;
    private DealOrdersDada datas;

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

    public DealOrdersDada getDatas() {
        return datas;
    }

    public void setDatas(DealOrdersDada datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "{" +
                "total:" + total + "," +
                "firstPage:" + firstPage + "," +
                "lastPage:" + lastPage + "," +
                "currPageNo:" + currPageNo + "," +
                "limit:" + limit + "," +
                "pageNos:" + pageNos + "," +
                "datas:" + datas +
                "}";
    }
}
