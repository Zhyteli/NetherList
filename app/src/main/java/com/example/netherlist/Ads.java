package com.example.netherlist;

public class Ads {
    private String name;
    private String price;
    private String contact;
    private String facial_description;
    private int imageRecurse;

    public Ads(String name, String price, String contact, String facial_description, int imageRecurse){
        this.name = name;
        this.price = price;
        this.contact = contact;
        this.facial_description = facial_description;
        this.imageRecurse = imageRecurse;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFacial_description() {
        return facial_description;
    }
    public void setFacial_description(String facial_description) {
        this.facial_description = facial_description;
    }

    public int getImageRecurse() {
        return imageRecurse;
    }
    public void setImageRecurse(int imageRecurse) {
        this.imageRecurse = imageRecurse;
    }
}
