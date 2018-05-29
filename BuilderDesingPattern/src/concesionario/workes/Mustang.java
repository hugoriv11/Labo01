/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario.workes;

import concesionario.Car;
import concesionario.Worker;

/**
 *
 * @author Toshiba
 */
public class Mustang implements Worker {

    private Car car;
    private String wheels;
    private String gear;
    private String engine;
    private String color;

    public Mustang() {
        car = new Car();
    }
 
    @Override
    public void assembleWheels() {
        car.setWheels("Silver AMR wheels 2018");
    }

    @Override
    public void buildGear() {
        car.setGear("Manual");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Mustang D-code, 5.0 L V8");
    }

    @Override
    public void paintCar() {
        car.setColor("Silver");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
