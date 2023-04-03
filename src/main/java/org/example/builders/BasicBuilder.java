package org.example.builders;

import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.Transmission;

public interface BasicBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);

}
