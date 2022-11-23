/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulario.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kristina
 */
public class Ventana extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());//Principal 0 yellow
        this.jPanelList.add(new JPanel());// Panel 1 blue
        this.jPanelList.add(new JPanel());// Panel 2 red
        this.jPanelList.add(new JPanel());// Panel 3 cyan
        this.jPanelList.add(new JPanel());// Panel 4 gray
        this.jPanelList.add(new JPanel());// Panel 5 magenta
        this.jPanelList.add(new JPanel());// Panel 6 pink

        this.jPanelList.get(0).setBackground(Color.yellow);
        this.jPanelList.get(1).setBackground(Color.blue);
        this.jPanelList.get(2).setBackground(Color.red);
        this.jPanelList.get(3).setBackground(Color.CYAN);
        this.jPanelList.get(4).setBackground(Color.GRAY);
        this.jPanelList.get(5).setBackground(Color.MAGENTA);
        this.jPanelList.get(6).setBackground(Color.pink);

        this.jPanelList.get(0).setLayout(new GridLayout(6, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Ingrese el código: "));
        this.jLabelList.add(new JLabel("Ingrese el nombre: "));
        this.jLabelList.add(new JLabel("Ingrese el peso: "));
        this.jLabelList.add(new JLabel("Ingrese el estatura: "));
        this.jLabelList.add(new JLabel("Ingrese la fecha de nacimiento (aaaa/mm/dd): "));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField("yyyy"));
        this.jTextFieldList.add(new JTextField("mm"));
        this.jTextFieldList.add(new JTextField("dd"));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(5));
        this.jPanelList.get(5).add(this.jTextFieldList.get(6));

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Añadir"));
        this.jButtonList.add(new JButton("Salir "));
        
        this.jPanelList.get(6).add(this.jButtonList.get(0));
        this.jPanelList.get(6).add(this.jButtonList.get(1));
        

    }

}
