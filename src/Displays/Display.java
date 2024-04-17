package Displays;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Display extends JFrame implements ActionListener{

    private float num1=0, num2=0;
    private char op='+';
    JTextField field = new JTextField();
    JPanel display = new JPanel();
    JButton n1 = new JButton("1");
    JButton n2 = new JButton("2");
    JButton n3 = new JButton("3");
    JButton n4 = new JButton("4");
    JButton n5 = new JButton("5");
    JButton n6 = new JButton("6");
    JButton n7 = new JButton("7");
    JButton n8 = new JButton("8");
    JButton n9 = new JButton("9");
    JButton n0 = new JButton("0");
    JButton nLess = new JButton("-");
    JButton nPlus = new JButton("+");
    JButton nEquals = new JButton("=");
    JButton nTimes = new JButton("*");
    JButton nDiv = new JButton("+/-");
    JButton nClear = new JButton("C");
    JButton nDivision = new JButton("/");
    JButton nCE = new JButton("CE");
    JButton nV = new JButton("->");
    public Display(){
        field.setPreferredSize(new Dimension(100,60));
        field.setForeground(Color.BLACK);
        field.setFont(new Font("Arial", Font.BOLD, 30));
        field.setHorizontalAlignment(JTextField.RIGHT);
        setSize(300,500);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        nEquals.setPreferredSize(new Dimension(50,30));
        nEquals.setHorizontalAlignment(JButton.CENTER);
        display.setLayout(new GridLayout(5,4));
        display.add(nCE);
        display.add(nV);
        display.add(nClear);
        display.add(nTimes);
        display.add(n7);
        display.add(n8);
        display.add(n9);
        display.add(nDivision);
        display.add(n4);
        display.add(n5);
        display.add(n6);
        display.add(nLess);
        display.add(n1);
        display.add(n2);
        display.add(n3);
        display.add(nPlus);
        display.add(nDiv);
        display.add(n0);
        display.add(nEquals);
        Dimension s = new Dimension(30,10);
        nEquals.setPreferredSize(s);
        field.setSize(120,30);
        getContentPane().setBackground(Color.gray);
        getContentPane().add(field, BorderLayout.PAGE_START);
        getContentPane().add(display, BorderLayout.CENTER);

        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n0.addActionListener(this);
        nLess.addActionListener(this);
        nPlus.addActionListener(this);
        nEquals.addActionListener(this);
        nDivision.addActionListener(this);
        nTimes.addActionListener(this);
        nClear.addActionListener(this);
        nCE.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Click");

        if(e.getSource()== n1){
            field.setText(field.getText() + "1");
        }
        if(e.getSource()== n2){
            field.setText(field.getText() + "2");
        }
        if(e.getSource()== n3){
            field.setText(field.getText() + "3");
        }
        if(e.getSource()== n4){
            field.setText(field.getText() + "4");
        }
        if(e.getSource()== n5){
            field.setText(field.getText() + "5");
        }
        if(e.getSource()== n6){
            field.setText(field.getText() + "6");
        }
        if(e.getSource()== n7){
            field.setText(field.getText() + "7");
        }
        if(e.getSource()== n8){
            field.setText(field.getText() + "8");
        }
        if(e.getSource()== n9){
            field.setText(field.getText() + "9");
        }
        if(e.getSource()== n0){
            field.setText(field.getText() + "0");
        }
        if(e.getSource()== nLess){
            num1 = Float.parseFloat(field.getText());
            op = '-';
            field.setText("");
        }
        if(e.getSource()== nPlus){
            num1 = Float.parseFloat(field.getText());
            op = '+';
            field.setText("");
        }
        if(e.getSource()== nDivision){
            num1 = Float.parseFloat(field.getText());
            op = '/';
            field.setText("");
        }
        if(e.getSource()== nTimes){
            num1 = Float.parseFloat(field.getText());
            op = '*';
            field.setText("");
        }
        if(e.getSource()== nEquals){
            num2 = Float.parseFloat(field.getText());
            switch (op){
                case '-': field.setText(String.valueOf(num1-num2));
                    break;
                case '+': field.setText(String.valueOf(num1+num2));
                    break;
                case '/': field.setText(String.valueOf(num1/num2));
                    break;
                case '*': field.setText(String.valueOf(num1*num2));
                    break;
            }
        }
        if(e.getSource()==nClear){
            field.setText("");
        }
        if(e.getSource()==nCE){
            num1=0;
            op = '+';
            num2=0;
            field.setText("");
        }
    }

}
