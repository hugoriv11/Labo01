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
public interface Worker { //TAMBIEN LLAMADO ======= DIRECTOR ===========
    public void assembleWheels();
    public void buildGear();
    public void buildEngine();
    public void paintCar();
    public Car getCar();   
}
