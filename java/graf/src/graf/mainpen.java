/*����������� ���������, 
 * ������� ����������� ������� �������������� ��������� ������� args ������ main. 
 * 
 * ������ ����������� � ���������, 
 * ��������� � ���� ���� ��������� �� ��������� �����. 
 * �������� ����� ����������� �������������� ������. 
 * ��� ����� �� ������ ������ ������ ���� �������
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
	        // ������ �����������
	        Container container = getContentPane();
	        container.setLayout (new FlowLayout(FlowLayout.CENTER));
	        /*
	         *  ��������� � ������ ����������
	         *  � �������� ���������� ����� ������������ 
	         *  ������ � ��������� ������ BorderLayout
	         */
	        container.add(new JButton("�����" ), "North"); 
	        container.add(new JButton("��"    ), "South");
	        container.add(new JLabel ("�����" ), BorderLayout.WEST);
	        container.add(new JLabel ("������"), BorderLayout.EAST);
	        // ��� ���������� 2-�� ��������� ��������� ����������� � ������
	        container.add(new JButton("�����"));
	        // ��������� ����
	        setVisible(true);
	    }
	    public static void main(String[] args)
	    {
	        new mainpen();
	    }
         
}


