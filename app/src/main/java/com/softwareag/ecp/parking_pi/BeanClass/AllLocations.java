package com.softwareag.ecp.parking_pi.BeanClass;

/**
 * Created by KAVI on 23-06-2016.
 */
public class AllLocations {
    private String name;
    private Double lattitude;
    private Double longitude;
    private int total;
    private int available;
    private boolean isActive;

    public AllLocations(String name, Double lattitude, Double longitude, int total, int available, boolean isActive){
        this.name = name;
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.total = total;
        this.available = available;
        this.isActive = isActive;
    }


    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLattitude() {
        return lattitude;
    }

    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


}
