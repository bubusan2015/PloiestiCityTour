package com.example.android.ploiesticitytour;

/**
 * Created by nibos on 3/8/2018.
 */

public class Location {
    String name;
    int    imageResourceId;
    String bussinessHours;
    String phone;
    String adress;
    String description;

    public Location() {
    }

    public Location(String name, int imageResourceId, String bussinessHours, String phone, String adress, String description) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.bussinessHours = bussinessHours;
        this.phone = phone;
        this.adress = adress;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getBussinessHours() {
        return bussinessHours;
    }

    public void setBussinessHours(String bussinessHours) {
        this.bussinessHours = bussinessHours;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return adress;
    }

    public void setLocation(String location) {
        this.adress = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
