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
	 //���������� ����� ����
	 super("�������� ����");
     setSize(240, 500);
     setResizable(false);
 
     setLayout(new BorderLayout());
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     //������� �������� ���� 
     //������� ������ ����
     JMenuBar menuBar = new JMenuBar();
     //������� ������ �������� ���� 
     JMenu menuFile = new JMenu("���� c ��������");
     JMenu menuAvto = new JMenu("����������");
     JMenu menuExit = new JMenu("�����");
     //������� � ������ ������ ����
     menuBar.add(menuFile);
     menuBar.add(menuAvto);
     menuBar.add(menuExit);
     
   //������� �������� ������� File � ������������� �������
     JMenuItem itemFile = new JMenuItem("��������� �����");
     itemFile.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(new workingFile("��� �����"));
		}
	});
  

     //������� � ���� �������
     menuFile.add(itemFile);
     
     //������� � ������ ������ ����
     setJMenuBar(menuBar);
     
   
     setVisible(true);

	}
	
	public static void main(String[] args) {
		new menu();
	}

}
