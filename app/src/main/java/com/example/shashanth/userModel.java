package com.example.shashanth;

public class userModel {

    int id;
    String name;
    String username;
    String email;
    String address;
    String geo;
    String phone;
    String website;
    String company;

    public userModel(int id, String name, String username, String email, String address, String geo, String phone, String website, String company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.geo = geo;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGeo() {
        return geo;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getCompany() {
        return company;
    }
}
