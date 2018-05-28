/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.conver.ConvertirFactory;
import abstractfactory.oper.OperacionesFactory;

/**
 *
 * @author Toshiba
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "oper":
                return new OperacionesFactory();
            case "conver":
                return new ConvertirFactory();
        }
        return null;
    }
}
