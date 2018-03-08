package bort;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class runway {

	public static void main(String[] args)  throws IOException {
		LinkedList<String> bort = new LinkedList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
			 if (bort.size()<5) {System.out.println("Введите номер борта самолета\n");
				 };
			System.out.println(" Чтобы вывести список или введите \"exitAll\"\n"+
					" разрешить взлет \"exitLast\"\n"+
					" выход из проги \"EXIT\"");
		    
			if (bort.size()>0) 
		          {
		    	         System.out.println("На стоянке "+Integer.toString(bort.size())+" самолетов ");
		          }
		      
			String newbort = reader.readLine().trim();
			
			if(newbort.equals("exitAll")) {
				for(String name : bort) {
					System.out.println(name);
				}
				continue;
			}
			else if(newbort.equals("EXIT")) {
				break;
				 }
			else if(newbort.equals("exitLast")) {
				bort.removeLast();
				
			     }
			
			   if (bort.size()<5)
			      { 
				     if (!newbort.equals(new String("0")) && (bort.indexOf(newbort)<0))
					   				    {
				    	bort.add(newbort);
				    }
				    
				    
			   }  else 
			      {
			    	 System.out.println("Стоянка заполнена. Нужно полетать");
			     }
		}
	}

}
