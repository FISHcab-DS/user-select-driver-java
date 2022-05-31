package com.example.appgui;

public class SelectedDriver {
    public static String name;
    public static int capacity;
    public static String eat;
    public static double rating;

    public SelectedDriver(String name, int capacity, String eat, double rating){
        SelectedDriver.name = name;
        SelectedDriver.capacity = capacity;
        SelectedDriver.eat = eat;
        SelectedDriver.rating = rating;
    }
    public void setName(String name){
        SelectedDriver.name = name;
    }
    public String getName(){
        return SelectedDriver.name;
    }

    public void setCapacity(int capacity){
        SelectedDriver.capacity = capacity;
    }
    public int getCapacity(){
        return SelectedDriver.capacity;
    }

    public void setEat(String eat){
        SelectedDriver.eat = eat;
    }
    public String getEat(){
        return SelectedDriver.eat;
    }

    public void setRating(Double rating){
        SelectedDriver.rating = rating;
    }
    public double getRating(){
        return SelectedDriver.rating;
    }
}
