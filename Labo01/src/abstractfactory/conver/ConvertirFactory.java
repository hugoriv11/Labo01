/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.conver;

import abstractfactory.AbstractFactory;
import abstractfactory.oper.Operaciones;

/**
 *
 * @author Toshiba
 */
public class ConvertirFactory implements AbstractFactory{

    @Override
    public Operaciones getOperaciones(String type) {
        return null;
    }

    @Override
    public Convertir getConvertir(String type) {
        switch(type){
            case "binario":
                return new Binario();
        }
        return null;
    }
    
}
