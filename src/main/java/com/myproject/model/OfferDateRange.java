package com.myproject.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferDateRange {
    private List<Integer> travelStartDate = null;
    private List<Integer> travelEndDate = null;
    private Integer lengthOfStay;

    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }


}
