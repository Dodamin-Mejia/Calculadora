/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.Scanner;
import GUI.Ventana;
import javax.swing.JFrame;
import abstractfactory.aritmetica.Aritmetica;


/**
 *
 * @author Eduardo
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        JFrame ventana = new JFrame("Ventana");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
      /*  String Operacion;
        Scanner entradaScanner1 = new Scanner(System.in);
        Operacion = entradaScanner1.nextLine();
        System.out.println("Opcion elegida: " + Operacion);
        
        String tipoOperacion;
        Scanner entradaScanner2 = new Scanner(System.in);
        tipoOperacion = entradaScanner2.nextLine();
                System.out.println("Tipo de operacion elegida: " + tipoOperacion);
        
        AbstractFactory factory;        
        factory = FactoryProducer.getFactory(Operacion);
        Aritmetica suma = factory.getAritmetica(tipoOperacion);
        suma.operar();
        
        factory = FactoryProducer.getFactory(Operacion);
        Aritmetica resta = factory.getAritmetica(tipoOperacion);
        resta.operar();
        
        factory = FactoryProducer.getFactory(Operacion);
        Aritmetica multiplicacion = factory.getAritmetica("multiplicacion");
        multiplicacion.operar();
        
        factory = FactoryProducer.getFactory(tipoOperacion);
        Aritmetica division = factory.getAritmetica("division");
        division.operar();*/
    }    
}