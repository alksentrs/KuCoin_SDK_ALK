package com.alk.kucoinsdk.business.trading;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrdersData {

    private Integer total;
    private Integer limit;
    private Integer pageNos;
    private Integer currPageNo;
    private List<Integer> navigatePageNos;
    private String userOid;
    private String oid;
    private String since;
    private String before;
    private Boolean firstPage;
    private Boolean lastPage;
    private Integer startRow;
    private List<OrdersDataDatas> datas;

    public List<OrdersDataDatas> getDatas() {
        return datas;
    }

    public void setDatas(List<OrdersDataDatas> datas) {
        this.datas = datas;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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

    public Integer getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
    }

    public List<Integer> getNavigatePageNos() {
        return navigatePageNos;
    }

    public void setNavigatePageNos(List<Integer> navigatePageNos) {
        this.navigatePageNos = navigatePageNos;
    }

    public String getUserOid() {
        return userOid;
    }

    public void setUserOid(String userOid) {
        this.userOid = userOid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
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

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    @Override
    public String toString() {
        return "{" +
                "datas:" + datas + "," +
                "total:" + total + "," +
                "limit:" + limit + "," +
                "pageNos:" + pageNos + "," +
                "currPageNo:" + currPageNo + "," +
                "navigatePageNos:" + navigatePageNos + "," +
                "userOid:" + userOid + "," +
                "oid:" + oid + "," +
                "since:" + since + "," +
                "before:" + before + "," +
                "firstPage:" + firstPage + "," +
                "lastPage:" + lastPage + "," +
                "startRow:" + startRow +
                "}";
    }
}
