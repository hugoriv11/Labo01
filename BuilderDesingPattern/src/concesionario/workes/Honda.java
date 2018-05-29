package concesionario.workes;

import concesionario.Car;
import concesionario.Worker;

/**
 *
 * @author Toshiba
 */
public class Honda implements Worker{
    
    private Car car;
    private String wheels;
    private String gear;
    private String engine;
    private String color;
        
    public Honda(){
        this.car = new Car();
    }

    @Override
    public void assembleWheels() {
        car.setWheels("Black TBS Wheels 1997");
    }

    @Override
    public void buildGear() {
        car.setGear("Manual");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Honda Civic D16Y7, 1.6 L");
    }

    @Override
    public void paintCar() {
        car.setColor("Blue");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}


