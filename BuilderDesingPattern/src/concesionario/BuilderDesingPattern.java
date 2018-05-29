package concesionario;

import concesionario.workes.Honda;
import concesionario.workes.Honda;
import concesionario.workes.Mustang;


/**
 *
 * @author Toshiba
 */
public class BuilderDesingPattern {


    public static void main(String[] args) {
        
        Honda engineer1 = new Honda();
        Mustang engineer2 = new Mustang();
 
        
        CarBuilder carBuilder1 = new CarBuilder(engineer1);
        CarBuilder carBuilder2 = new CarBuilder(engineer2);
        
        carBuilder1.buildACar();
        carBuilder2.buildACar();
        
        Car car1 = carBuilder1.getCar();
        Car car2 = carBuilder2.getCar();
        
        System.out.println("Builder Desing Pattern");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
    
}
