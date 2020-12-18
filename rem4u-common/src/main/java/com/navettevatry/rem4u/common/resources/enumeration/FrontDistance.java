package com.navettevatry.rem4u.common.resources.enumeration;
import java.util.List;

public class FrontDistance {
    //f
    private List<String> destinationAddresses;
    private List<String> originAddresses;
    private List<Row> rows;
    private String status;

    @Override
    public String toString() {
        return "FrontDistance{" +
                "destinationAddresses=" + destinationAddresses +
                ", originAddresses=" + originAddresses +
                ", rows=" + rows +
                ", status='" + status + '\'' +
                '}';
    }

    public List<String> getDestinationAddresses() { return destinationAddresses; }
    public void setDestinationAddresses(List<String> value) { this.destinationAddresses = value; }

    public List<String> getOriginAddresses() { return originAddresses; }
    public void setOriginAddresses(List<String> value) { this.originAddresses = value; }

    public List<Row> getRows() { return rows; }
    public void setRows(List<Row> value) { this.rows = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }
}

