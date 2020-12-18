package com.navettevatry.rem4u.common.resources.dto.bcvtc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * Created by Wael Jlassi.
 * Updated by Chakib Daii.
 */
public class Car  implements Serializable {
    @JsonProperty("CarId")
    private String carId; // 	L'identifiant unique du véhicule
    @JsonProperty("CarPicture")
    private String carPicture; //(String) ou (Bool) 	Lien https/http du véhicule, renvoie false si introuvable
    @JsonProperty("CarBrand")
    private String carBrand; //La marque du véhicule
    @JsonProperty("CarModel")
    private String carModel; //	Le modèle du véhicule
    @JsonProperty("CarVIN")
    private String carVIN; //Numéro d'immatriculation.
    @JsonProperty("CarCo")
    private String carCo; //Emissions de CO2 g/1 km.
    @JsonProperty("CarClass")
    private CarClass carClass; //Regardez la section #Classes

    public Car() {
    }

    public Car(String carId, String carPicture, String carBrand, String carModel, String carVIN, String carCo, CarClass carClass) {
        this.carId = carId;
        this.carPicture = carPicture;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carVIN = carVIN;
        this.carCo = carCo;
        this.carClass = carClass;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarPicture() {
        return carPicture;
    }

    public void setCarPicture(String carPicture) {
        this.carPicture = carPicture;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarVIN() {
        return carVIN;
    }

    public void setCarVIN(String carVIN) {
        this.carVIN = carVIN;
    }

    public String getCarCo() {
        return carCo;
    }

    public void setCarCo(String carCo) {
        this.carCo = carCo;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carPicture='" + carPicture + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carVIN='" + carVIN + '\'' +
                ", carCo='" + carCo + '\'' +
                ", carClass=" + carClass +
                '}';
    }
}

