/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import abstractfactory.oper.OperacionesFactory;
import abstractfactory.conver.ConvertirFactory;

/**
 *
 * @author Toshiba
 */
public class ventana extends JPanel {
    private int WIDTH = 400, HEIGHT = 300;
    private int widthTF = 50, heightTF = 20;
    private int widthBT = 100, heightBT = 30;
    private double a,b;
    
    JButton sumar,restar,multiplicar,dividir,binario;
    JButton Valor1,Valor2;
    
    JTextField textfield1, textfield2;

    public ventana() {
        sumar = new JButton("sumar");
        restar = new JButton("restar");
        multiplicar = new JButton("multiplicar");
        dividir = new JButton("dividir");
        binario = new JButton("binario");
        Valor1 = new JButton("setA");
        Valor2 = new JButton("setB");
        textfield2=new JTextField();
        textfield1=new JTextField();
        
        textfield2.setBounds(200,200,widthTF,heightTF);
        textfield1.setBounds(200,100,widthTF,heightTF);
        
        
        sumar.setBounds(0,50,widthBT,heightBT);
        restar.setBounds(0,100,widthBT,heightBT);
        multiplicar.setBounds(0,150,widthBT,heightBT);
        dividir.setBounds(0,200,widthBT,heightBT);
        binario.setBounds(0,250,widthBT,heightBT);

        
        Valor1.setBounds(300, 115,widthBT, heightBT);
        Valor2.setBounds(300, 200, widthBT, heightBT);
    
        
        Valor1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(textfield1.getText());
                a = Double.parseDouble(textfield1.getText());
            }
        });
        Valor2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(textfield1.getText());
                b = Double.parseDouble(textfield1.getText());
            }
        });
        
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(" " + new OperacionesFactory().getOperaciones("sumar").Operacion(a, b));
            }
        });
        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(" " + new OperacionesFactory().getOperaciones("restar").Operacion(a, b));
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(" " + new OperacionesFactory().getOperaciones("multiplicar").Operacion(a, b));
            }
        });
        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(" " + new OperacionesFactory().getOperaciones("dividir").Operacion(a, b));
            }
        });
        binario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(" " + new OperacionesFactory().getOperaciones("binario").Operacion(a, b));
            }
        });
        
        textfield1.setEditable(true);
        textfield2.setEditable(false);
        
        add(sumar);
        add(restar);
        add(multiplicar);
        add(dividir);
        add(binario);
        
        add(Valor1);
        add(Valor2);
        
        add(textfield1);
        add(textfield2);
        
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
}