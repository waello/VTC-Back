package com.navettevatry.rem4u.common.resources.dto.allocab.updated;

public class Direction {
    private String formattedAddress;
    private String type;
    private Position position;
    ///vvide
    private IconContent iconContent;

    public Direction() {
    }

    public Direction(String formattedAddress, String type, Position position, IconContent iconContent) {
        this.formattedAddress = formattedAddress;
        this.type = type;
        this.position = position;
        this.iconContent = iconContent;
    }

    public String getFormattedAddress() { return formattedAddress; }
    public void setFormattedAddress(String value) { this.formattedAddress = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public Position getPosition() { return position; }
    public void setPosition(Position value) { this.position = value; }

    public IconContent getIconContent() { return iconContent; }
    public void setIconContent(IconContent value) { this.iconContent = value; }
}
