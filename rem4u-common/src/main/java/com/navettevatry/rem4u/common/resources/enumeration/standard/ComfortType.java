package com.navettevatry.rem4u.common.resources.enumeration.standard;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * Created by Chakib Daii.
 */
public enum ComfortType implements Serializable /*, Comparator<ComfortType>*/ {
    //old comfort types : Haute gamme / Standard / Eco
    HAUTE_GAMME("HAUTE_GAMME",1),
    BERLIN("COMFORT / BERLINE",2),
    ECO("ECONOMIQUE / STANDARD",3),
    VAN("VAN",4),
    //old comfort types : Business / Standard
    BUSINESS("BUSINESS",1),
    STANDARD("STANDARD",2);

    private String type;
    private int index;

    ComfortType(String type, int index) {
        this.type = type;
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

//    @Override
//    public int compare(ComfortType o1, ComfortType o2) {
//        int returnValue = 0;
//        if (o1.getIndex() > o2.getIndex()) {
//            returnValue = 1;
//        } else if (o1.getIndex() < o2.getIndex()) {
//            returnValue = -1;
//        }
//        return returnValue;
//    }
}
