package com.alk.kucoinsdk.business.market;

import com.alk.kucoinsdk.business.KucoinResponse;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 26/06/18.
 */
public class ChartHistory {

    private String s;
    private List<Double> c;
    private List<Double> t;
    private List<Double> v;
    private List<Double> h;
    private List<Double> l;
    private List<Double> o;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public List<Double> getC() {
        return c;
    }

    public void setC(List<Double> c) {
        this.c = c;
    }

    public List<Double> getT() {
        return t;
    }

    public void setT(List<Double> t) {
        this.t = t;
    }

    public List<Double> getV() {
        return v;
    }

    public void setV(List<Double> v) {
        this.v = v;
    }

    public List<Double> getH() {
        return h;
    }

    public void setH(List<Double> h) {
        this.h = h;
    }

    public List<Double> getL() {
        return l;
    }

    public void setL(List<Double> l) {
        this.l = l;
    }

    public List<Double> getO() {
        return o;
    }

    public void setO(List<Double> o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "{" +
                "s:" + s + "," +
                "c:" + c + "," +
                "t:" + t + "," +
                "v:" + v + "," +
                "h:" + h + "," +
                "l:" + l + "," +
                "o:" + o +
                "}";
    }
}
