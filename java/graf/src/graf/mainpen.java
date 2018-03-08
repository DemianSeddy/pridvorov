/*Разработать программу, 
 * которая высчитывает среднее геометрическое элементов массива args метода main. 
 * 
 * Массив преобразуем к коллекции, 
 * добавляем в него пару элементов из текстовых полей. 
 * Добавьте вашим компонентам форматирование текста. 
 * При клике на кнопку курсор должен быть изменен
 */



package graf;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class mainpen extends JFrame {
	    
	 public mainpen()
	    {
	        super("mainpen");
	        setDefaultCloseOperation( EXIT_ON_CLOSE );
	        setSize(500, 450);
	        // Панель содержимого
	        Container container = getContentPane();
	        container.setLayout (new FlowLayout(FlowLayout.CENTER));
	        /*
	         *  Размещаем в панели компоненты
	         *  В качестве параметров можно использовать 
	         *  строки и константы класса BorderLayout
	         */
	        container.add(new JButton("Север" ), "North"); 
	        container.add(new JButton("Юг"    ), "South");
	        container.add(new JLabel ("Запад" ), BorderLayout.WEST);
	        container.add(new JLabel ("Восток"), BorderLayout.EAST);
	        // При отсутствии 2-го параметра компонент размещается в центре
	        container.add(new JButton("Центр"));
	        // Открываем окно
	        setVisible(true);
	    }
	    public static void main(String[] args)
	    {
	        new mainpen();
	    }
         
}


