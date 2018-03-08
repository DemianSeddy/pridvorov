package Calc;

import java.awt.*;
import java.security.DigestInputStream;

import javax.swing.*;
import javax.swing.border.Border;

public class Calculator extends JFrame {

    private GridLayout layout;
	public Calculator() {
        super("GridLayoutTest");
        setSize(520, 320);
        setLocation(100, 100);
        setDefaultLookAndFeelDecorated(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel digitBottom = new JPanel();
        digitBottom.setBounds(0,0, 200, 150);
        digitBottom.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel windows = new JPanel();;
        windows.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel operation = new JPanel();
        
        
        add(windows, BorderLayout.NORTH);
        add(operation, BorderLayout.EAST);
        add(digitBottom , BorderLayout.CENTER);
       
        layout = new GridLayout();
       
     
                //add(grid_align);
                //add(grid_right);
                
        // Устанавливаем оптимальный размер окна
   
        // Открываем окно

    }
    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}