package org.example.director;


import org.example.builders.BasicBuilder;
import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.Transmission;

public class Director {
    public void constructSportsCar(BasicBuilder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(5.3, 0));
        builder.setTransmission(Transmission.MANUAL);
    }

    public void constructLimousine(BasicBuilder builder) {
        builder.setCarType(CarType.LIMOUSINE);
        builder.setSeats(4);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructSUV(BasicBuilder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
    }
}
