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
public interface AbstractFactory {
    Operaciones getOperaciones(String type);
    Convertir getConvertir(String type);
}
