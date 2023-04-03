package org.example.builders;

import org.example.cars.Car;
import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.Transmission;

public class CarBuilder implements BasicBuilder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission);
    }
}
