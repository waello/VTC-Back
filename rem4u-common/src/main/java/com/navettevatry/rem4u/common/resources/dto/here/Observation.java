package com.navettevatry.rem4u.common.resources.dto.here;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 *
 * Created by Ala Hadj Brahim & Ichrak Ben Abdallah.
 * Updated by Chakib DAII
 */
public class Observation {
    private String daylight;
    private String description;
    private float skyInfo;
    private String skyDescription;
    private  float temperature;
    private String temperatureDesc;
    private float comfort;
    private float highTemperature;
    private float lowTemperature;
    private float humidity;
    private float dewPoint;
    private float precipitation1H;
    private  float precipitation3H;
    private float precipitation6H;
    private float precipitation12H;
    private  float precipitation24H;
    private String precipitationDesc;
    private float airInfo;
    private String airDescription;
    private  float windSpeed;
    private float windDirection;
    private String windDesc;
    private String windDescShort;
    private float barometerPressure;
    private String barometerTrend;
    private float  visibility;
    private  String snowCover;
    private float icon;
    private String iconName;
    private String iconLink;
    private float ageMinutes;
    private float activeAlerts;
    private String country;
    private String state;
    private String city;
    private float latitude;
    private float longitude;
    private float distance;
    private float elevation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date utcTime;

    public Observation(){

    }

    public Observation(String daylight, String description, float skyInfo, String skyDescription, String temperatureDesc, float comfort, float highTemperature, float lowTemperature, float humidity, float dewPoint, float precipitation1H, float precipitation3H, float precipitation6H, float precipitation12H, float precipitation24H, float airInfo, String airDescription, float windDirection, String windDesc, String windDescShort, float barometerPressure, String barometerTrend, float visibility, float icon, String iconName, String iconLink, float ageMinutes, float activeAlerts, String country, String state, String city, float latitude, float longitude, float distance, float elevation, Date utcTime) {
        this.daylight = daylight;
        this.description = description;
        this.skyInfo = skyInfo;
        this.skyDescription = skyDescription;
        this.temperatureDesc = temperatureDesc;
        this.comfort = comfort;
        this.highTemperature = highTemperature;
        this.lowTemperature = lowTemperature;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.precipitation1H = precipitation1H;
        this.precipitation3H = precipitation3H;
        this.precipitation6H = precipitation6H;
        this.precipitation12H = precipitation12H;
        this.precipitation24H = precipitation24H;
        this.airInfo = airInfo;
        this.airDescription = airDescription;
        this.windDirection = windDirection;
        this.windDesc = windDesc;
        this.windDescShort = windDescShort;
        this.barometerPressure = barometerPressure;
        this.barometerTrend = barometerTrend;
        this.visibility = visibility;
        this.icon = icon;
        this.iconName = iconName;
        this.iconLink = iconLink;
        this.ageMinutes = ageMinutes;
        this.activeAlerts = activeAlerts;
        this.country = country;
        this.state = state;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
        this.elevation = elevation;
        this.utcTime = utcTime;
    }

    public String getDaylight() {
        return daylight;
    }

    public void setDaylight(String daylight) {
        this.daylight = daylight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSkyInfo() {
        return skyInfo;
    }

    public void setSkyInfo(float skyInfo) {
        this.skyInfo = skyInfo;
    }

    public String getSkyDescription() {
        return skyDescription;
    }

    public void setSkyDescription(String skyDescription) {
        this.skyDescription = skyDescription;
    }

    public  float getTemperature() {
        return temperature;
    }

    public  void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureDesc() {
        return temperatureDesc;
    }

    public void setTemperatureDesc(String temperatureDesc) {
        this.temperatureDesc = temperatureDesc;
    }

    public float getComfort() {
        return comfort;
    }

    public void setComfort(float comfort) {
        this.comfort = comfort;
    }

    public float getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(float highTemperature) {
        this.highTemperature = highTemperature;
    }

    public float getLowTemperature() {
        return lowTemperature;
    }

    public void setLowTemperature(float lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public float getPrecipitation1H() {
        return precipitation1H;
    }

    public void setPrecipitation1H(float precipitation1H) {
        this.precipitation1H = precipitation1H;
    }

    public  float getPrecipitation3H() {
        return precipitation3H;
    }

    public void setPrecipitation3H(float precipitation3H) {
        this.precipitation3H = precipitation3H;
    }

    public float getPrecipitation6H() {
        return precipitation6H;
    }

    public void setPrecipitation6H(float precipitation6H) {
        this.precipitation6H = precipitation6H;
    }

    public float getPrecipitation12H() {
        return precipitation12H;
    }

    public void setPrecipitation12H(float precipitation12H) {
        this.precipitation12H = precipitation12H;
    }

    public  float getPrecipitation24H() {
        return precipitation24H;
    }

    public  void setPrecipitation24H(float precipitation24H) {
        this.precipitation24H = precipitation24H;
    }

    public  String getPrecipitationDesc() {
        return precipitationDesc;
    }

    public void setPrecipitationDesc(String precipitationDesc) {
        this.precipitationDesc = precipitationDesc;
    }

    public float getAirInfo() {
        return airInfo;
    }

    public void setAirInfo(float airInfo) {
        this.airInfo = airInfo;
    }

    public String getAirDescription() {
        return airDescription;
    }

    public void setAirDescription(String airDescription) {
        this.airDescription = airDescription;
    }

    public  float getWindSpeed() {
        return windSpeed;
    }

    public  void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(float windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindDesc() {
        return windDesc;
    }

    public void setWindDesc(String windDesc) {
        this.windDesc = windDesc;
    }

    public String getWindDescShort() {
        return windDescShort;
    }

    public void setWindDescShort(String windDescShort) {
        this.windDescShort = windDescShort;
    }

    public float getBarometerPressure() {
        return barometerPressure;
    }

    public void setBarometerPressure(float barometerPressure) {
        this.barometerPressure = barometerPressure;
    }

    public String getBarometerTrend() {
        return barometerTrend;
    }

    public void setBarometerTrend(String barometerTrend) {
        this.barometerTrend = barometerTrend;
    }

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public  String getSnowCover() {
        return snowCover;
    }

    public  void setSnowCover(String snowCover) {
        this.snowCover = snowCover;
    }

    public float getIcon() {
        return icon;
    }

    public void setIcon(float icon) {
        this.icon = icon;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getIconLink() {
        return iconLink;
    }

    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    public float getAgeMinutes() {
        return ageMinutes;
    }

    public void setAgeMinutes(float ageMinutes) {
        this.ageMinutes = ageMinutes;
    }

    public float getActiveAlerts() {
        return activeAlerts;
    }

    public void setActiveAlerts(float activeAlerts) {
        this.activeAlerts = activeAlerts;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getElevation() {
        return elevation;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public Date getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(Date utcTime) {
        this.utcTime = utcTime;
    }
}


