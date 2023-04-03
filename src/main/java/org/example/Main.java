package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.CarManualBuilder;
import org.example.cars.Car;
import org.example.cars.Manual;
import org.example.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

///////////////////////////////////////////////////////////
        CarBuilder builder1 = new CarBuilder();
        director.constructLimousine(builder1);

        Car car1 = builder1.getResult();
        System.out.println("Car built:\n" + car1.getCarType());
        
        CarManualBuilder manualBuilder1 = new CarManualBuilder();

        director.constructLimousine(manualBuilder1);
        Manual carManual1 = manualBuilder1.getResult();
        System.out.println("\nCar manual built:\n" + carManual1.print());
    }
}
