package com.alk.kucoinsdk.business.market;

import java.util.List;

/**
 * Created by alksentrs (aleksander medella) on 25/06/18.
 */
public class ChartConfig {

    private Boolean supports_marks;
    private Boolean supports_time;
    private Boolean supports_search;
    private Boolean supports_group_request;
    private List<String> supported_resolutions;

    public Boolean getSupports_marks() {
        return supports_marks;
    }

    public void setSupports_marks(Boolean supports_marks) {
        this.supports_marks = supports_marks;
    }

    public Boolean getSupports_time() {
        return supports_time;
    }

    public void setSupports_time(Boolean supports_time) {
        this.supports_time = supports_time;
    }

    public Boolean getSupports_search() {
        return supports_search;
    }

    public void setSupports_search(Boolean supports_search) {
        this.supports_search = supports_search;
    }

    public Boolean getSupports_group_request() {
        return supports_group_request;
    }

    public void setSupports_group_request(Boolean supports_group_request) {
        this.supports_group_request = supports_group_request;
    }

    public List<String> getSupported_resolutions() {
        return supported_resolutions;
    }

    public void setSupported_resolutions(List<String> supported_resolutions) {
        this.supported_resolutions = supported_resolutions;
    }

    @Override
    public String toString() {
        return "{supports_marks:"+supports_marks+","+
                "supports_time:"+supports_time+","+
                "supports_search:"+supports_search+","+
                "supports_group_request:"+supports_group_request+","+
                "supported_resolutions:"+supported_resolutions+"}";
    }
}
