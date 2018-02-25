/*Разработать программу, 
 * которая высчитывает среднее геометрическое элементов массива args метода main. 
 * 
 * Массив преобразуем к коллекции, 
 * добавляем в него пару элементов из текстовых полей. 
 * Добавьте вашим компонентам форматирование текста. 
 * При клике на кнопку курсор должен быть изменен
 */



package grafica;

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



public class box {

	private static JFrame myWindow;
	private static JLabel label1;
	private static JLabel label2;
	private static JLabel labelResult;
    private static JTextField textField1;
	private static JTextField textField2;
	private static JButton buttonCalc;

	static ArrayList<String> listnumeric = new ArrayList<String>();
	private static double valueResult;

	public static void main(String[] args) {
		//Если были параметры добавим в коллекцию 
		if(args.length > 0) {
			Collections.addAll(listnumeric, args);
		}
		//Композиция
		//Создание окна
		myWindow = new JFrame("Окно приложения");
		myWindow.setSize(400, 400);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
		
		//
		Container c = myWindow.getContentPane();
		
	
		//Компоненты

		label1 = new JLabel();
		label1.setText("Значение 1:");
		c.add(label1);
		
		textField1 = new JTextField(10);
		myWindow.add(textField1);

		label2 = new JLabel();
		textField2 = new JTextField(10);
		label2.setText("Значение 2:");
		c.add(label2);

		c.add(textField2);
		
		
		labelResult = new JLabel("Среднее геометрическое = ");
		c.add(labelResult);
		
		buttonCalc = new JButton("Основное окно");
		new JButton("Расчет");
		c.add(buttonCalc);
		
		buttonCalc.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {

				listnumeric.add(textField1.getText().trim());
				listnumeric.add(textField2.getText().trim());

				for(String s : listnumeric) {
										valueResult=valueResult*Integer.parseInt(s);
										
				}
						
				//int valueResult=;
				//labelResult = new JLabel("Среднее геометрическое = "+String.valueOf(Math.sqrt(valueResult)));
				labelResult = new JLabel("Среднее геометрическое = ffff");
				c.add(labelResult);
			}
		});
		
		
		
		
		
	}

}
