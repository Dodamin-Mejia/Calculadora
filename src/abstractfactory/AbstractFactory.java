/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.aritmetica.Aritmetica;
import abstractfactory.conversor.Conversor;

/**
 *
 * @author Eduardo
 */
public interface AbstractFactory {
        Conversor getConversor(String type);
        Aritmetica getAritmetica(String type);
    }
