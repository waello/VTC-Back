package com.navettevatry.rem4u.common.resources.dto.uber.updated;

public class StatusStatus {
    private ClientStatus clientStatus;
    private Eyeball eyeball;
    private City city;
    private Metadata metadata;

    public ClientStatus getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(ClientStatus value) {
        this.clientStatus = value;
    }

    public Eyeball getEyeball() {
        return eyeball;
    }

    public void setEyeball(Eyeball value) {
        this.eyeball = value;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City value) {
        this.city = value;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    @Override
    public String toString() {
        return "StatusStatus{" +
                "clientStatus=" + clientStatus +
                ", eyeball=" + eyeball +
                ", city=" + city +
                ", metadata=" + metadata +
                '}';
    }
}
