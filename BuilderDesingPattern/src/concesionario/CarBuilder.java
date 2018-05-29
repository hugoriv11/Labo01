package concesionario;



/**
 *
 * @author Toshiba
 */
public class CarBuilder {
    private Worker worker;
    
    public CarBuilder(Worker worker){
        this.worker = worker;
    }
    
    public void buildACar(){
        this.worker.assembleWheels();
        this.worker.buildGear();
        this.worker.buildEngine();
        this.worker.paintCar();
    }
    
    public Car getCar(){
        return this.worker.getCar();
    }
}
