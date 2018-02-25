package calculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class rashet  extends JFrame {

	public  rashet() {
	    super("Основное окно");
        setSize(240, 500);
        setResizable(false);
    
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

	}
	
	
	public static void main(String[] args) {
		 new rashet();

	}

}
