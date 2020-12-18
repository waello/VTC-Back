package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

import java.util.List;

public class Quotation {
    private InitialQuotation price;
    private String key;
    private long vehiclePanelID;
    private String name;
    private String photo;
    private long nbPassengers;
    private long nbBagages;
    private Options options;
    private String availability;
    private boolean sharable;
    private List<Object> departureConstraints;
    private double surge;
    private long receptionPrice;
    private long adwordsExtensionPrice;
    private long priceForLateCancellation;
    private long diffBetweenAllocabPriceAndLECabPrice;
    private boolean keepAllocabPrice;
    private long allocabCalculatedPrice;
    private boolean isLETaxiQuotation;
    private String panelNameKey;

    public InitialQuotation getPrice() { return price; }
    public void setPrice(InitialQuotation value) { this.price = value; }

    public String getKey() { return key; }
    public void setKey(String value) { this.key = value; }

    public long getVehiclePanelID() { return vehiclePanelID; }
    public void setVehiclePanelID(long value) { this.vehiclePanelID = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getPhoto() { return photo; }
    public void setPhoto(String value) { this.photo = value; }

    public long getNbPassengers() { return nbPassengers; }
    public void setNbPassengers(long value) { this.nbPassengers = value; }

    public long getNbBagages() { return nbBagages; }
    public void setNbBagages(long value) { this.nbBagages = value; }

    public Options getOptions() { return options; }
    public void setOptions(Options value) { this.options = value; }

    public String getAvailability() { return availability; }
    public void setAvailability(String value) { this.availability = value; }

    public boolean getSharable() { return sharable; }
    public void setSharable(boolean value) { this.sharable = value; }

    public List<Object> getDepartureConstraints() { return departureConstraints; }
    public void setDepartureConstraints(List<Object> value) { this.departureConstraints = value; }

    public double getSurge() { return surge; }
    public void setSurge(double value) { this.surge = value; }

    public long getReceptionPrice() { return receptionPrice; }
    public void setReceptionPrice(long value) { this.receptionPrice = value; }

    public long getAdwordsExtensionPrice() { return adwordsExtensionPrice; }
    public void setAdwordsExtensionPrice(long value) { this.adwordsExtensionPrice = value; }

    public long getPriceForLateCancellation() { return priceForLateCancellation; }
    public void setPriceForLateCancellation(long value) { this.priceForLateCancellation = value; }

    public long getDiffBetweenAllocabPriceAndLECabPrice() { return diffBetweenAllocabPriceAndLECabPrice; }
    public void setDiffBetweenAllocabPriceAndLECabPrice(long value) { this.diffBetweenAllocabPriceAndLECabPrice = value; }

    public boolean getKeepAllocabPrice() { return keepAllocabPrice; }
    public void setKeepAllocabPrice(boolean value) { this.keepAllocabPrice = value; }

    public long getAllocabCalculatedPrice() { return allocabCalculatedPrice; }
    public void setAllocabCalculatedPrice(long value) { this.allocabCalculatedPrice = value; }

    public boolean getIsLETaxiQuotation() { return isLETaxiQuotation; }
    public void setIsLETaxiQuotation(boolean value) { this.isLETaxiQuotation = value; }

    public String getPanelNameKey() { return panelNameKey; }
    public void setPanelNameKey(String value) { this.panelNameKey = value; }

    @Override
    public String toString() {
        return "Quotation{" +
                "price=" + price +
                ", key='" + key + '\'' +
                ", vehiclePanelID=" + vehiclePanelID +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", nbPassengers=" + nbPassengers +
                ", nbBagages=" + nbBagages +
                ", options=" + options +
                ", availability='" + availability + '\'' +
                ", sharable=" + sharable +
                ", departureConstraints=" + departureConstraints +
                ", surge=" + surge +
                ", receptionPrice=" + receptionPrice +
                ", adwordsExtensionPrice=" + adwordsExtensionPrice +
                ", priceForLateCancellation=" + priceForLateCancellation +
                ", diffBetweenAllocabPriceAndLECabPrice=" + diffBetweenAllocabPriceAndLECabPrice +
                ", keepAllocabPrice=" + keepAllocabPrice +
                ", allocabCalculatedPrice=" + allocabCalculatedPrice +
                ", isLETaxiQuotation=" + isLETaxiQuotation +
                ", panelNameKey='" + panelNameKey + '\'' +
                '}';
    }
}
