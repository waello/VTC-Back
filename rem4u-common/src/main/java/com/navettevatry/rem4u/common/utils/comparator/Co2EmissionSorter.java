package com.navettevatry.rem4u.common.utils.comparator;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;

import java.util.Comparator;

/**
 * Created by Chakib Daii.
 */
public class Co2EmissionSorter implements Comparator<Offer> {
    @Override
    public int compare(Offer o1, Offer o2) {
        if(o1.getVehicle() != null && o2.getVehicle() != null
                && o1.getVehicle().getComfort()!= null && o2.getVehicle().getComfort() != null){
            // Get the difference
            float difference = o1.getVehicle().getCo2Emission() - o2.getVehicle().getCo2Emission();

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
        return "Co2EmissionSorter{}";
    }
}
