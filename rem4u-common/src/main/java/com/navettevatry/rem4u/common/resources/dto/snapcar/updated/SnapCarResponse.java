package com.navettevatry.rem4u.common.resources.dto.snapcar.updated;

public class SnapCarResponse {
    private String executive;
    private String classic;
    private String van;

    @Override
    public String toString() {
        return ""
                 + executive  +
                "," + classic  +
                "," + van +
                "";
    }

    public String getExecutive() { return executive; }
    public void setExecutive(String value) { this.executive = value; }

    public String getClassic() { return classic; }
    public void setClassic(String value) { this.classic = value; }

    public String getVan() { return van; }
    public void setVan(String value) { this.van = value; }
}
