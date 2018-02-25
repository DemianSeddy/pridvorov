package menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class menu extends JFrame {


   menu() {
	 //Определяем фрейм окна
	 super("Основное окно");
     setSize(240, 500);
     setResizable(false);
 
     setLayout(new BorderLayout());
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     //Создаем основное меню 
     //Создали панель меню
     JMenuBar menuBar = new JMenuBar();
     //Создаем пункты основнго меню 
     JMenu menuFile = new JMenu("Файл c матрицей");
     JMenu menuAvto = new JMenu("Автомобили");
     JMenu menuExit = new JMenu("Выход");
     //Прибили к панели пункты меню
     menuBar.add(menuFile);
     menuBar.add(menuAvto);
     menuBar.add(menuExit);
     
   //Создаем элементы подменю File с обработчиками событий
     JMenuItem itemFile = new JMenuItem("Обработка файла");
     itemFile.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(new workingFile("Имя файла"));
		}
	});
  

     //Прибили к меню подменю
     menuFile.add(itemFile);
     
     //Прибили у фрейму панель меню
     setJMenuBar(menuBar);
     
   
     setVisible(true);

	}
	
	public static void main(String[] args) {
		new menu();
	}

}
