/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.aritmetica;

/**
 *
 * @author Eduardo
 */
public class Resta implements Aritmetica {
    @Override
    public int operar(int a, int b) {

        return a-b;
    }    
}