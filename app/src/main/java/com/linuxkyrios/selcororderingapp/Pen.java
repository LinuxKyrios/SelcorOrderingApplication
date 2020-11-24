package com.linuxkyrios.selcororderingapp;

public class Pen {
    private String name;
    private String description;
    private int imageResourceId;

    //pens is an array with three Pen class objects
    public static final Pen[] pens = {
            new Pen("Cienkopis", "Tradycyjny cienkopis, czarny, niebieski, czerwony lub zielony.", R.drawable.cienkopis),
            new Pen("Cienkopis Pilot V5", "Cienkopis Pilot V5, czarny, niebieski, czerwony lub zielony", R.drawable.cienkopispilot),
            new Pen("Długopis automatyczny", "Nie wiem co to, ale brzmi nieźle. Czarny, niebieski, czerwony lub zielony", R.drawable.dlugopisautomatyczny)
    };

    private Pen(String name, String description, int imageResourceId) {
        //Pen class constructor
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //public methods to get information from private variables
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
