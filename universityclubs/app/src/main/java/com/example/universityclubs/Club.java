package com.example.universityclubs;

public class Club {
    public String name;
    public String description;
    public String president;
    public String contact;
    public int imageResId;

    public Club(String name, String description, String president, String contact, int imageResId) {
        this.name = name;
        this.description = description;
        this.president = president;
        this.contact = contact;
        this.imageResId = imageResId;
    }
}
