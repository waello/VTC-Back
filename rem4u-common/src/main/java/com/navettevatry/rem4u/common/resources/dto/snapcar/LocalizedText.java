package com.navettevatry.rem4u.common.resources.dto.snapcar;

import java.io.Serializable;

/**
 *
 * Created by Chakib Daii.
 */
public class LocalizedText implements Serializable {
    private String fr; /*French translation*/
    private String en; /*English translation*/

    public LocalizedText() {
    }

    public LocalizedText(String fr, String en) {
        this.fr = fr;
        this.en = en;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "LocalizedText{" +
                "fr='" + fr + '\'' +
                ", en='" + en + '\'' +
                '}';
    }
}
