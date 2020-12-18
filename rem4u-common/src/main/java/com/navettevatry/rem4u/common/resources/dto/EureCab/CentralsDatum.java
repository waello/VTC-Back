
package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CentralsDatum implements Serializable {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("company")
    private String company;
    @JsonProperty("seo")
    private String seo;
    @JsonProperty("description")
    private String description;
    @JsonProperty("accept_flag")
    private Boolean acceptFlag;
    @JsonProperty("is_car_seat")
    private Boolean isCarSeat;
    @JsonProperty("is_hybrid")
    private Boolean isHybrid;
    @JsonProperty("is_electric")
    private Boolean isElectric;
    @JsonProperty("is_delivery_man")
    private Boolean isDeliveryMan;
    @JsonProperty("is_covid_protect")
    private Boolean isCovidProtect;
    @JsonProperty("is_wifi")
    private Boolean isWifi;
    @JsonProperty("is_woman")
    private Boolean isWoman;
    @JsonProperty("is_immediate_accept")
    private Boolean isImmediateAccept;
    @JsonProperty("vote_count")
    private Integer voteCount;
    @JsonProperty("vote_average")
    private Float voteAverage;
    @JsonProperty("date_create")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateCreate;
    @JsonProperty("date_update")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateUpdate;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("is_central")
    private Boolean isCentral;
    @JsonProperty("central_type")
    private Integer centralType;
    @JsonProperty("central_model")
    private Integer centralModel;
    @JsonProperty("profile_pic")
    private String profilePic;
    @JsonProperty("accept_label")
    private /*AcceptLabel*/ String acceptLabel;
    @JsonProperty("is_multiple_drivers")
    private Boolean isMultipleDrivers;
    @JsonProperty("vehicles")
    private Vehicles vehicles;

    public CentralsDatum() {
    }


    public CentralsDatum(Integer id, String company, String seo, String description, Boolean acceptFlag, Boolean isCarSeat, Boolean isHybrid, Boolean isElectric, Boolean isDeliveryMan, Boolean isCovidProtect, Boolean isWifi, Boolean isWoman, Boolean isImmediateAccept, Integer voteCount, Float voteAverage, Date dateCreate, Date dateUpdate, Integer status, Boolean isCentral, Integer centralType, Integer centralModel, String profilePic, String acceptLabel, Boolean isMultipleDrivers, Vehicles vehicles) {
        this.id = id;
        this.company = company;
        this.seo = seo;
//        this.description = description;
        this.acceptFlag = acceptFlag;
        this.isCarSeat = isCarSeat;
        this.isHybrid = isHybrid;
        this.isElectric = isElectric;
        this.isDeliveryMan = isDeliveryMan;
        this.isCovidProtect = isCovidProtect;
        this.isWifi = isWifi;
        this.isWoman = isWoman;
        this.isImmediateAccept = isImmediateAccept;
        this.voteCount = voteCount;
        this.voteAverage = voteAverage;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
        this.status = status;
        this.isCentral = isCentral;
        this.centralType = centralType;
        this.centralModel = centralModel;
        this.profilePic = profilePic;
        this.acceptLabel = acceptLabel;
        this.isMultipleDrivers = isMultipleDrivers;
        this.vehicles = vehicles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Boolean getAcceptFlag() {
        return acceptFlag;
    }

    public void setAcceptFlag(Boolean acceptFlag) {
        this.acceptFlag = acceptFlag;
    }

    public Boolean getCarSeat() {
        return isCarSeat;
    }

    public void setCarSeat(Boolean carSeat) {
        isCarSeat = carSeat;
    }

    public Boolean getHybrid() {
        return isHybrid;
    }

    public void setHybrid(Boolean hybrid) {
        isHybrid = hybrid;
    }

    public Boolean getElectric() {
        return isElectric;
    }

    public void setElectric(Boolean electric) {
        isElectric = electric;
    }

    public Boolean getDeliveryMan() {
        return isDeliveryMan;
    }

    public void setDeliveryMan(Boolean deliveryMan) {
        isDeliveryMan = deliveryMan;
    }

    public Boolean getCovidProtect() {
        return isCovidProtect;
    }

    public void setCovidProtect(Boolean covidProtect) {
        isCovidProtect = covidProtect;
    }

    public Boolean getWifi() {
        return isWifi;
    }

    public void setWifi(Boolean wifi) {
        isWifi = wifi;
    }

    public Boolean getWoman() {
        return isWoman;
    }

    public void setWoman(Boolean woman) {
        isWoman = woman;
    }

    public Boolean getImmediateAccept() {
        return isImmediateAccept;
    }

    public void setImmediateAccept(Boolean immediateAccept) {
        isImmediateAccept = immediateAccept;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getCentral() {
        return isCentral;
    }

    public void setCentral(Boolean central) {
        isCentral = central;
    }

    public Integer getCentralType() {
        return centralType;
    }

    public void setCentralType(Integer centralType) {
        this.centralType = centralType;
    }

    public Integer getCentralModel() {
        return centralModel;
    }

    public void setCentralModel(Integer centralModel) {
        this.centralModel = centralModel;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getAcceptLabel() {
        return acceptLabel;
    }

    public void setAcceptLabel(String acceptLabel) {
        this.acceptLabel = acceptLabel;
    }

    public Boolean getMultipleDrivers() {
        return isMultipleDrivers;
    }

    public void setMultipleDrivers(Boolean multipleDrivers) {
        isMultipleDrivers = multipleDrivers;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "CentralsDatum{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", seo='" + seo + '\'' +
//                ", description='" + description + '\'' +
                ", acceptFlag=" + acceptFlag +
                ", isCarSeat=" + isCarSeat +
                ", isHybrid=" + isHybrid +
                ", isElectric=" + isElectric +
                ", isDeliveryMan=" + isDeliveryMan +
                ", isCovidProtect=" + isCovidProtect +
                ", isWifi=" + isWifi +
                ", isWoman=" + isWoman +
                ", isImmediateAccept=" + isImmediateAccept +
                ", voteCount=" + voteCount +
                ", voteAverage=" + voteAverage +
                ", dateCreate=" + dateCreate +
                ", dateUpdate=" + dateUpdate +
                ", status=" + status +
                ", isCentral=" + isCentral +
                ", centralType=" + centralType +
                ", centralModel=" + centralModel +
                ", profilePic='" + profilePic + '\'' +
                ", acceptLabel='" + acceptLabel + '\'' +
                ", isMultipleDrivers=" + isMultipleDrivers +
                ", vehicles=" + vehicles +
                '}';
    }
}