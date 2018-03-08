package students;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;



public class mainwork {
	
	static Random  r = new Random();
	static ArrayList<Student> arr = new ArrayList<Student>();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedReader br;

	
	
	public static void main(String[] args) throws IOException {
	
	//«аполнили
	File fileDir = new File("C:\\Users\\asutp\\workspace\\students\\src\\students\\fio.txt");
	try{
	     br = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
	
	    //чтение построчно
	    String s;
	    while((s=br.readLine())!=null){
	    	   arr.add(new Student(s.trim(),Float.parseFloat(Integer.toString(r.nextInt(4)+1)+"."+Integer.toString(r.nextInt(4)+1))));
	    }
	}
	 catch(IOException ex){
	 System.out.println(ex.getMessage());
	    }
	
	
	//
	for(;;)
	{
		System.out.println(" „тобы вывести список или введите \"LIST\"\n"+
				" разрешить сортировку по фамилии(ј->я) \"FIOUP\"\n"+
				" разрешить сортировку по фамилии(я->ј) \"FIODOWN\"\n"+
				" разрешить сортировку по баллу \"GRADEUP\"\n"+
				" разрешить сортировку по баллу \"GRADEDOWN\"\n"+
				" выход из проги \"EXIT\"");
		
		String newbort = reader.readLine().trim();
	    
		if(newbort.equals("LIST")) {
			for(Student name : arr) {
				System.out.println(name.getFioMark());
			}
			continue;
		}
		
		else if(newbort.equals("FIODOWN")) {
			Collections.sort(arr,Student.compareByFIOAsc);
			for(Student name : arr) {
				System.out.println(name.getFioMark());
			}
		}
		else if(newbort.equals("FIOUP")) {
			Collections.sort(arr,Student.compareByFIODec);
			for(Student name : arr) {
				System.out.println(name.getFioMark());
			}
		}
		else if(newbort.equals("GRADEUP")) {
			Collections.sort(arr,Student.compareByMarkUP);
			for(Student name : arr) {
				System.out.println(name.getFioMark());
			}
		}
		else if(newbort.equals("GRADEDOWN")) {
			Collections.sort(arr,Student.compareByMarkDOWN);
			for(Student name : arr) {
				System.out.println(name.getFioMark());
			}
		}
		else if(newbort.equals("EXIT")) {
			       break;
			  }
			
		     }
	
	//public static void main(String[] args) {
	//	for(;;){
	//		Student arr = new Student("Samsung",);
	//	}
	


	}	
}


