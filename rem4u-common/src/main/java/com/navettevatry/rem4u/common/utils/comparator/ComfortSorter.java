package com.navettevatry.rem4u.common.utils.comparator;

import com.navettevatry.rem4u.common.resources.dto.standard.Offer;

import java.util.Comparator;

/**
 * Created by Chakib Daii.
 */
public class ComfortSorter implements Comparator<Offer> {
    @Override
    public int compare(Offer o1, Offer o2) {
        int returnValue = 0;
        if(o1.getVehicle() != null && o2.getVehicle() != null
                && o1.getVehicle().getComfort() != null && o2.getVehicle().getComfort() != null){
            if (o1.getVehicle().getComfort().getIndex() > o2.getVehicle().getComfort().getIndex()) {
                returnValue = 1;
            } else if (o1.getVehicle().getComfort().getIndex() < o2.getVehicle().getComfort().getIndex()) {
                returnValue = -1;
            }
        }
        return returnValue;
    }

    @Override
    public String toString() {
        return "ComfortSorter{}";
    }
}
