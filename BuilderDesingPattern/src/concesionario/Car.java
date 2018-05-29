package concesionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class Car implements CarPlan {
    private String wheels;
    private String gear;
    private String engine;
    private String color;

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setGear(String gear) {
        this.gear = gear;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        return "A car was made of the following parts: " + "Wheels " + wheels + ", Gear " + gear + ", Engine " + engine + ", Color " + color; 
    }
}
