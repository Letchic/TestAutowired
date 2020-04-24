package com.letchick.bean;


public class Diesel implements IEngine {
    @Override
    public void drive() {
        System.out.println("Diesel.drive");
    }

}
