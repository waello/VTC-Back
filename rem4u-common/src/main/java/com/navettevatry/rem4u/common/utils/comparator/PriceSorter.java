package com.navettevatry.rem4u.common.utils.comparator;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;

import java.util.Comparator;

/**
 * Created by Chakib Daii.
 */
public class PriceSorter implements Comparator<Offer> {
    @Override
    public int compare(Offer o1, Offer o2) {
        // Get the difference
        if(o1.getPrice() != null && o1.getPrice() != null
                && o1.getPrice().getUnitAmount() != null && o2.getPrice().getUnitAmount() != null){
            float difference = o1.getPrice().getUnitAmount() - o2.getPrice().getUnitAmount();

            if (difference == 0) {
                // Both are equal
                return 0;
            }
            else if (difference < 0) {
                // o1 < 2
                return -1;
            }
            else {
                // o1 > o2
                return 1;
            }
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "PriceSorter{}";
    }
}
