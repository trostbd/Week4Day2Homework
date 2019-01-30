package com.example.lawre.week4day2homework.model.local.home;

import javax.inject.Inject;

public class Home
{
    String image;
    String address, owner, size, constructionYear;

    public Home() {
    }

    @Inject
    public Home(String image, String address, String owner, String size, String constructionYear) {
        this.image = image;
        this.address = address;
        this.owner = owner;
        this.size = size;
        this.constructionYear = constructionYear;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(String constructionYear) {
        this.constructionYear = constructionYear;
    }
}
