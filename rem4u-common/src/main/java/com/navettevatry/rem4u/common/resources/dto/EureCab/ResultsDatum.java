package com.navettevatry.rem4u.common.resources.dto.EureCab;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsDatum implements Serializable {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("company")
    private String company;
    @JsonProperty("seo")
    private String seo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_car_seat")
    private Boolean isCarSeat;
    @JsonProperty("is_hybrid")
    private Boolean isHybrid;
    @JsonProperty("is_electric")
    private Boolean isElectric;
    @JsonProperty("is_wifi")
    private Boolean isWifi;
    @JsonProperty("is_woman")
    private Boolean isWoman;
    @JsonProperty("is_covid_protect")
    private Boolean isCovidProtect;
    @JsonProperty("is_di")
    private Boolean isDi;
    @JsonProperty("is_airport")
    private Boolean isAirport;
    @JsonProperty("is_multiple_drivers")
    private Boolean isMultipleDrivers;
    @JsonProperty("ghost_until")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ghostUntil;
    @JsonProperty("type_activity")
    private Integer typeActivity;
    @JsonProperty("vote_average")
    private String voteAverage;
    @JsonProperty("vote_count")
    private Integer voteCount;
    @JsonProperty("is_central")
    private Boolean isCentral;
    @JsonProperty("price_final")
    private Float priceFinal;
    @JsonProperty("rank_score")
    private Float rankScore;
    @JsonProperty("rank_quality")
    private Integer rankQuality;
    @JsonProperty("profile_pic")
    private String profilePic;
    @JsonProperty("timeout")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date timeout;
    @JsonProperty("immediate_accept")
    private Boolean immediateAccept;
    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("has_discount")
    private Boolean hasDiscount;
    @JsonProperty("price_discount")
    private Float priceDiscount;
    @JsonProperty("discount_code")
    private String discountCode;
    @JsonProperty("vehicle")
    private Vehicle vehicle;
    @JsonProperty("is_superdriver")
    private Boolean isSuperdriver;
    @JsonProperty("score_quality")
    private Integer scoreQuality;
    @JsonProperty("price_text")
    private /*AcceptLabel*/ String priceText;

    public ResultsDatum() {
    }

    public ResultsDatum(Integer id, String company, String seo, String name, Boolean isCarSeat, Boolean isHybrid, Boolean isElectric, Boolean isWifi, Boolean isWoman, Boolean isCovidProtect, Boolean isDi, Boolean isAirport, Boolean isMultipleDrivers, Date ghostUntil, Integer typeActivity, String voteAverage, Integer voteCount, Boolean isCentral, Float priceFinal, Float rankScore, Integer rankQuality, String profilePic, Date timeout, Boolean immediateAccept, Boolean favorite, Boolean hasDiscount, Float priceDiscount, String discountCode, Vehicle vehicle, Boolean isSuperdriver, Integer scoreQuality, String priceText) {
        this.id = id;
        this.company = company;
        this.seo = seo;
        this.name = name;
        this.isCarSeat = isCarSeat;
        this.isHybrid = isHybrid;
        this.isElectric = isElectric;
        this.isWifi = isWifi;
        this.isWoman = isWoman;
        this.isCovidProtect = isCovidProtect;
        this.isDi = isDi;
        this.isAirport = isAirport;
        this.isMultipleDrivers = isMultipleDrivers;
        this.ghostUntil = ghostUntil;
        this.typeActivity = typeActivity;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.isCentral = isCentral;
        this.priceFinal = priceFinal;
        this.rankScore = rankScore;
        this.rankQuality = rankQuality;
        this.profilePic = profilePic;
        this.timeout = timeout;
        this.immediateAccept = immediateAccept;
        this.favorite = favorite;
        this.hasDiscount = hasDiscount;
        this.priceDiscount = priceDiscount;
//        this.discountCode = discountCode;
        this.vehicle = vehicle;
        this.isSuperdriver = isSuperdriver;
        this.scoreQuality = scoreQuality;
        this.priceText = priceText;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Boolean getCovidProtect() {
        return isCovidProtect;
    }

    public void setCovidProtect(Boolean covidProtect) {
        isCovidProtect = covidProtect;
    }

    public Boolean getDi() {
        return isDi;
    }

    public void setDi(Boolean di) {
        isDi = di;
    }

    public Boolean getAirport() {
        return isAirport;
    }

    public void setAirport(Boolean airport) {
        isAirport = airport;
    }

    public Boolean getMultipleDrivers() {
        return isMultipleDrivers;
    }

    public void setMultipleDrivers(Boolean multipleDrivers) {
        isMultipleDrivers = multipleDrivers;
    }

    public Date getGhostUntil() {
        return ghostUntil;
    }

    public void setGhostUntil(Date ghostUntil) {
        this.ghostUntil = ghostUntil;
    }

    public Integer getTypeActivity() {
        return typeActivity;
    }

    public void setTypeActivity(Integer typeActivity) {
        this.typeActivity = typeActivity;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Boolean getCentral() {
        return isCentral;
    }

    public void setCentral(Boolean central) {
        isCentral = central;
    }

    public Float getPriceFinal() {
        return priceFinal;
    }

    public void setPriceFinal(Float priceFinal) {
        this.priceFinal = priceFinal;
    }

    public Float getRankScore() {
        return rankScore;
    }

    public void setRankScore(Float rankScore) {
        this.rankScore = rankScore;
    }

    public Integer getRankQuality() {
        return rankQuality;
    }

    public void setRankQuality(Integer rankQuality) {
        this.rankQuality = rankQuality;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Boolean getImmediateAccept() {
        return immediateAccept;
    }

    public void setImmediateAccept(Boolean immediateAccept) {
        this.immediateAccept = immediateAccept;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Float getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Float priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

//    public String getDiscountCode() {
//        return discountCode;
//    }
//
//    public void setDiscountCode(String discountCode) {
//        this.discountCode = discountCode;
//    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean getSuperdriver() {
        return isSuperdriver;
    }

    public void setSuperdriver(Boolean superdriver) {
        isSuperdriver = superdriver;
    }

    public Integer getScoreQuality() {
        return scoreQuality;
    }

    public void setScoreQuality(Integer scoreQuality) {
        this.scoreQuality = scoreQuality;
    }

    public String getPriceText() {
        return priceText;
    }

    public void setPriceText(String priceText) {
        this.priceText = priceText;
    }

    @Override
    public String toString() {
        return "ResultsDatum{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", seo='" + seo + '\'' +
                ", name='" + name + '\'' +
                ", isCarSeat=" + isCarSeat +
                ", isHybrid=" + isHybrid +
                ", isElectric=" + isElectric +
                ", isWifi=" + isWifi +
                ", isWoman=" + isWoman +
                ", isCovidProtect=" + isCovidProtect +
                ", isDi=" + isDi +
                ", isAirport=" + isAirport +
                ", isMultipleDrivers=" + isMultipleDrivers +
                ", ghostUntil=" + ghostUntil +
                ", typeActivity=" + typeActivity +
                ", voteAverage='" + voteAverage + '\'' +
                ", voteCount=" + voteCount +
                ", isCentral=" + isCentral +
                ", priceFinal=" + priceFinal +
                ", rankScore=" + rankScore +
                ", rankQuality=" + rankQuality +
                ", profilePic='" + profilePic + '\'' +
                ", timeout=" + timeout +
                ", immediateAccept=" + immediateAccept +
                ", favorite=" + favorite +
                ", hasDiscount=" + hasDiscount +
                ", priceDiscount=" + priceDiscount +
//                ", discountCode='" + discountCode + '\'' +
                ", vehicle=" + vehicle +
                ", isSuperdriver=" + isSuperdriver +
                ", scoreQuality=" + scoreQuality +
                ", priceText='" + priceText + '\'' +
                '}';
    }
}
