package com.example.appgui;

public class Driver {
    public String name;
    public int capacity;
    public String eat;
    public double rating;

    public Driver(String name, int capacity, String eat, double rating){
        this.name = name;
        this.capacity = capacity;
        this.eat = eat;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getEat(){
        return this.eat;
    }

    public double getRating(){
        return this.rating;
    }

}
