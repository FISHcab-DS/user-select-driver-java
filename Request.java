package com.example.appgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Pair;

public class Request {
    public static String name;
    public static String pul;
    public static String dl;
    public static String eat;
    public static int capacity;
    public static String price;

//    public Request(String name, String pul, String dl, String eat, int capacity){
//        this.name = name;
//        this.pul = pul;
//        this.dl = dl;
//        this.eat = eat;
//        this.capacity = capacity;
//        this.price = calcPrice(pul, dl);
//    }
    public Request(){
        Request.name = "Chen Ching Yen";
        Request.pul = "1100, 2048";
        Request.dl = "1024, 3022";
        Request.eat = "16:30";
        Request.capacity = 2;
        Request.price = "12.50";
    }

    public static String getName(){
        return name;
    }

    public String getPul(){
        return pul;
    }

    public String getDl(){
        return dl;
    }

    public String getEat(){
        return eat;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getPrice(){
        return price;
    }

    public String calcPrice(String pul, String dl){
        String[] pul_arr = pul.split(", ");
        String[] dl_arr = dl.split(", ");
        double dis = Math.sqrt((Integer.valueOf(pul_arr[0])-Integer.valueOf(dl_arr[0]))*(Integer.valueOf(pul_arr[0])-Integer.valueOf(dl_arr[0])) + (Integer.valueOf(pul_arr[1])-Integer.valueOf(dl_arr[1]))*(Integer.valueOf(pul_arr[1])-Integer.valueOf(dl_arr[1])));
        return String.format("%.2f", dis);
    }
}
