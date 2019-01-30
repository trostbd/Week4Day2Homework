package com.example.lawre.week4day2homework.model.local.office;

public class Office
{
    String image;
    String address, owner, purpose, size;

    public Office() {
    }

    public Office(String image, String address, String owner, String size, String purpose) {
        this.image = image;
        this.address = address;
        this.owner = owner;
        this.size = size;
        this.purpose = purpose;
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
