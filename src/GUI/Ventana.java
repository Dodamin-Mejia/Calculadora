/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.aritmetica.Aritmetica;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo
 */
public class Ventana extends JPanel{

    public int WIDTH = 300, widthTF = 120, widhtB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3;
    public JButton button, button_suma, button_resta, button_multiplicacion, button_division;
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(20, 30, widthTF, heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(170, 30, widthTF, heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(80, 170, widthTF, heightTF));
        
        /*button = new JButton("Copiar");
        button.setBounds(new Rectangle(120, 75, widhtB, heightB));*/
        
        button_suma = new JButton("+");
        button_suma.setBounds(new Rectangle(20, 80, widhtB, heightB));
        
        button_resta = new JButton("-");
        button_resta.setBounds(new Rectangle(170, 80, widhtB, heightB));
        
        button_multiplicacion = new JButton("X");
        button_multiplicacion.setBounds(new Rectangle(20, 120, widhtB, heightB));
        
        button_division = new JButton("/");
        button_division.setBounds(new Rectangle(170, 120, widhtB, heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        
        button_suma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0){
                    //instancia
                    AbstractFactory factory;        
                    factory = FactoryProducer.getFactory("aritmetica");
                    Aritmetica suma = factory.getAritmetica("suma");
                    //mandar los datos
                   //int a = Integer.parseInt(textF1.getText());
                   //int b = Integer.parseInt(textF2.getText());
                    System.out.println(textF1.getText() + textF2.getText());
                    //mostrar el resultado
                    textF3.setText(Integer.toString(suma.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
                   // System.out.println(suma.operar());
                };
            }
        );
        
        button_resta.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    AbstractFactory factory;
                    factory = FactoryProducer.getFactory("aritmetica");
                    Aritmetica resta = factory.getAritmetica("resta");
                    textF3.setText(Integer.toString(resta.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
                }
            }
        );
        
        button_multiplicacion.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    AbstractFactory factory;
                    factory = FactoryProducer.getFactory("aritmetica");
                    Aritmetica multiplicacion = factory.getAritmetica("multiplicacion");
                    textF3.setText(Integer.toString(multiplicacion.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
                }
            }
        );
                
        button_division.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    AbstractFactory factory;
                    factory = FactoryProducer.getFactory("aritmetica");
                    Aritmetica division = factory.getAritmetica("division");
                    textF3.setText(Integer.toString(division.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF2.getText()))));
                }
            }
        );
        
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textF2.setText(textF1.getText());                
            }
        }
    );*/
    
    add (textF1);
    //add (button);
    add (button_suma);
    add (button_resta);
    add (button_multiplicacion);
    add (button_division);
    add (textF2);
    add (textF3);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    
    }    
}
