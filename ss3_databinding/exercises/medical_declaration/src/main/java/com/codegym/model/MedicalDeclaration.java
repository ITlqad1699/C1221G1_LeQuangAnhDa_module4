package com.codegym.model;

public class MedicalDeclaration {
    private String name;
    private String birthDay;
    private String gender;
    private String Country;
    private String citizenId;
    private String travelingInfo;
    private String transportationInfo;
    private String chairNum;
    private String dateStart;
    private String dateEnd;
    private String cityHasGone;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, String birthDay, String gender, String country, String citizenId, String travelingInfo, String transportationInfo, String chairNum, String dateStart, String dateEnd, String cityHasGone) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        Country = country;
        this.citizenId = citizenId;
        this.travelingInfo = travelingInfo;
        this.transportationInfo = transportationInfo;
        this.chairNum = chairNum;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.cityHasGone = cityHasGone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getTravelingInfo() {
        return travelingInfo;
    }

    public void setTravelingInfo(String travelingInfo) {
        this.travelingInfo = travelingInfo;
    }

    public String getTransportationInfo() {
        return transportationInfo;
    }

    public void setTransportationInfo(String transportationInfo) {
        this.transportationInfo = transportationInfo;
    }

    public String getChairNum() {
        return chairNum;
    }

    public void setChairNum(String chairNum) {
        this.chairNum = chairNum;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCityHasGone() {
        return cityHasGone;
    }

    public void setCityHasGone(String cityHasGone) {
        this.cityHasGone = cityHasGone;
    }
}
