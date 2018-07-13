package com.alk.kucoinsdk.business.trading;

/**
 * Created by alksentrs (aleksander medella) on 07/07/18.
 */
public class OrderData {

    private String orderOid;

    public String getOrderOid() {
        return orderOid;
    }

    public void setOrderOid(String orderOid) {
        this.orderOid = orderOid;
    }

    @Override
    public String toString() {
        return "{orderOid:"+orderOid+"}";
    }
}
