/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.conver;

/**
 *
 * @author Toshiba
 */
public class Binario implements Convertir{

    @Override
    public int Binario(int a) {
        while(a >= 2){
            if(a%2 == 0 || a%2 == 1){
                return a%2;
            }
        }
        return 0;
    }
    
}
