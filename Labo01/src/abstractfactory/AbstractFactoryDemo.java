/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.conver.Convertir;
import abstractfactory.oper.Operaciones;

/**
 *
 * @author Toshiba
 */
public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory factory;
        
        factory = FactoryProducer.getFactory("oper");
        Operaciones sumar = factory.getOperaciones("sumar");
        sumar.Operacion(10, 1);
        
        factory = FactoryProducer.getFactory("conver");
        Convertir binario = factory.getConvertir("binario");
        binario.BinarioADecimal(11, 2);
        
        
    }
}
