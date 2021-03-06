package com.planet.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ExoPlanet {


    @JsonProperty("PlanetIdentifier")
    private String planetIdentifier;
    @JsonProperty("TypeFlag")
    private Integer typeFlag;
    @JsonProperty("PlanetaryMassJpt")
    private Double planetaryMassJpt;
    @JsonProperty("RadiusJpt")
    private Double radiusJpt;
    @JsonProperty("PeriodDays")
    private Double periodDays;
    @JsonProperty("SemiMajorAxisAU")
    private Double semiMajorAxisAU;
    @JsonProperty("Eccentricity")
    private Double eccentricity;
    @JsonProperty("PeriastronDeg")
    private Double periastronDeg;
    @JsonProperty("LongitudeDeg")
    private Double longitudeDeg;
    @JsonProperty("AscendingNodeDeg")
    private Double ascendingNodeDeg;
    @JsonProperty("InclinationDeg")
    private Double inclinationDeg;
    @JsonProperty("SurfaceTempK")
    private Double surfaceTempK;
    @JsonProperty("AgeGyr")
    private Integer ageGyr;
    @JsonProperty("DiscoveryMethod")
    private String discoveryMethod;
    @JsonProperty("DiscoveryYear")
    private Integer discoveryYear;
    @JsonProperty("LastUpdated")
    private String lastUpdated;
    @JsonProperty("RightAscension")
    private String rightAscension;
    @JsonProperty("Declination")
    private String declination;
    @JsonProperty("HostStarAgeGyr")
    private Integer hostStarAgeGyr;
    @JsonProperty("DistFromSunParsec")
    private Double distFromSunParsec;
    @JsonProperty("HostStarMassSlrMass")
    private Double hostStarMassSlrMass;
    @JsonProperty("HostStarRadiusSlrRad")
    private Double hostStarRadiusSlrRad;
    @JsonProperty("HostStarMetallicity")
    private Double hostStarMetallicity;
    @JsonProperty("HostStarTempK")
    private Double hostStarTempK;

    public String getPlanetIdentifier() {
        return planetIdentifier;
    }

    public void setPlanetIdentifier(String planetIdentifier) {
        this.planetIdentifier = planetIdentifier;
    }

    public Integer getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(Integer typeFlag) {
        this.typeFlag = typeFlag;
    }

    public Double getPlanetaryMassJpt() {
        return planetaryMassJpt;
    }

    public void setPlanetaryMassJpt(Double planetaryMassJpt) {
        this.planetaryMassJpt = planetaryMassJpt;
    }

    public Double getRadiusJpt() {
        return radiusJpt;
    }

    public void setRadiusJpt(Double radiusJpt) {
        this.radiusJpt = radiusJpt;
    }

    public Double getPeriodDays() {
        return periodDays;
    }

    public void setPeriodDays(Double periodDays) {
        this.periodDays = periodDays;
    }

    public Double getSemiMajorAxisAU() {
        return semiMajorAxisAU;
    }

    public void setSemiMajorAxisAU(Double semiMajorAxisAU) {
        this.semiMajorAxisAU = semiMajorAxisAU;
    }

    public Double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Double getPeriastronDeg() {
        return periastronDeg;
    }

    public void setPeriastronDeg(Double periastronDeg) {
        this.periastronDeg = periastronDeg;
    }

    public Double getLongitudeDeg() {
        return longitudeDeg;
    }

    public void setLongitudeDeg(Double longitudeDeg) {
        this.longitudeDeg = longitudeDeg;
    }

    public Double getAscendingNodeDeg() {
        return ascendingNodeDeg;
    }

    public void setAscendingNodeDeg(Double ascendingNodeDeg) {
        this.ascendingNodeDeg = ascendingNodeDeg;
    }

    public Double getInclinationDeg() {
        return inclinationDeg;
    }

    public void setInclinationDeg(Double inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    public Double getSurfaceTempK() {
        return surfaceTempK;
    }

    public void setSurfaceTempK(Double surfaceTempK) {
        this.surfaceTempK = surfaceTempK;
    }

    public Integer getAgeGyr() {
        return ageGyr;
    }

    public void setAgeGyr(Integer ageGyr) {
        this.ageGyr = ageGyr;
    }

    public String getDiscoveryMethod() {
        return discoveryMethod;
    }

    public void setDiscoveryMethod(String discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
    }

    public Integer getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(Integer discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getRightAscension() {
        return rightAscension;
    }

    public void setRightAscension(String rightAscension) {
        this.rightAscension = rightAscension;
    }

    public String getDeclination() {
        return declination;
    }

    public void setDeclination(String declination) {
        this.declination = declination;
    }

    public Integer getHostStarAgeGyr() {
        return hostStarAgeGyr;
    }

    public void setHostStarAgeGyr(Integer hostStarAgeGyr) {
        this.hostStarAgeGyr = hostStarAgeGyr;
    }

    public Double getDistFromSunParsec() {
        return distFromSunParsec;
    }

    public void setDistFromSunParsec(Double distFromSunParsec) {
        this.distFromSunParsec = distFromSunParsec;
    }

    public Double getHostStarMassSlrMass() {
        return hostStarMassSlrMass;
    }

    public void setHostStarMassSlrMass(Double hostStarMassSlrMass) {
        this.hostStarMassSlrMass = hostStarMassSlrMass;
    }

    public Double getHostStarRadiusSlrRad() {
        return hostStarRadiusSlrRad;
    }

    public void setHostStarRadiusSlrRad(Double hostStarRadiusSlrRad) {
        this.hostStarRadiusSlrRad = hostStarRadiusSlrRad;
    }

    public Double getHostStarMetallicity() {
        return hostStarMetallicity;
    }

    public void setHostStarMetallicity(Double hostStarMetallicity) {
        this.hostStarMetallicity = hostStarMetallicity;
    }

    public Double getHostStarTempK() {
        return hostStarTempK;
    }

    public void setHostStarTempK(Double hostStarTempK) {
        this.hostStarTempK = hostStarTempK;
    }

    @Override
    public String toString() {
        return "ExoPlanet{" +
                "planetIdentifier='" + planetIdentifier + '\'' +
                ", typeFlag=" + typeFlag +
                ", planetaryMassJpt=" + planetaryMassJpt +
                ", radiusJpt=" + radiusJpt +
                ", periodDays=" + periodDays +
                ", semiMajorAxisAU=" + semiMajorAxisAU +
                ", eccentricity=" + eccentricity +
                ", periastronDeg=" + periastronDeg +
                ", longitudeDeg=" + longitudeDeg +
                ", ascendingNodeDeg=" + ascendingNodeDeg +
                ", inclinationDeg=" + inclinationDeg +
                ", surfaceTempK=" + surfaceTempK +
                ", ageGyr=" + ageGyr +
                ", discoveryMethod='" + discoveryMethod + '\'' +
                ", discoveryYear=" + discoveryYear +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", rightAscension='" + rightAscension + '\'' +
                ", declination='" + declination + '\'' +
                ", hostStarAgeGyr=" + hostStarAgeGyr +
                ", distFromSunParsec=" + distFromSunParsec +
                ", hostStarMassSlrMass=" + hostStarMassSlrMass +
                ", hostStarRadiusSlrRad=" + hostStarRadiusSlrRad +
                ", hostStarMetallicity=" + hostStarMetallicity +
                ", hostStarTempK=" + hostStarTempK +
                '}';
    }
}
