package org.example.builders;

import org.example.cars.CarType;
import org.example.cars.Manual;
import org.example.components.Engine;
import org.example.components.Transmission;

public class CarManualBuilder implements BasicBuilder{
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

    public Manual getResult(){
        return new Manual(type, seats, engine, transmission);
    }
}
