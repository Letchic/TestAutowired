package com.letchick.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

@Autowired
@Qualifier("diesel")
    private IEngine engine;
    private String vin;


    public Car() {
    }
    public Car(String vin) {
        this.vin = vin;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public IEngine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", vin='" + vin + '\'' +
                '}';
    }
}
