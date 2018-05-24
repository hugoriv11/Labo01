/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.oper;

import abstractfactory.AbstractFactory;
import abstractfactory.conver.Convertir;
import abstractfactory.oper.Operaciones;

/**
 *
 * @author Toshiba
 */
public class OperacionesFactory implements AbstractFactory{

    @Override
    public Operaciones getOperaciones(String type) {
        switch(type){
            case "sumar":
                return new Suma();
        }
        return null;
    }

    @Override
    public Convertir getConvertir(String type) {
       
    }



  

  
}
