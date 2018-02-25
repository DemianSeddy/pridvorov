package sort_change;
import java.util.Random;


public class sort_ch {
	 public static int[] mass;
	 public sort_ch(int  count,int _rand) {
	 mass= new int[count]; 	 
	 for(int i=0;i<count;i++)
		{
			String dots = (i<count-1) ? ",":" ";
			Random r = new Random();
			mass[i]=r.nextInt(_rand)+1;
			System.out.print(sort_ch.mass[i]+dots);
			} 
	}
	 
	 public  void sort_mass() {
		for(int i=0;i<sort_ch.mass.length-1;i++) {
			int temp_min=i;
			for (int j=i+1;j<sort_ch.mass.length;j++) {
			  		    if(sort_ch.mass[j] < sort_ch.mass[temp_min]) {
			  		    	temp_min = j;
			  			}
			  		}
			  		int tmp = mass[i];
			 		sort_ch.mass[i] = mass[temp_min];
			 		sort_ch.mass[temp_min] = tmp;
			 	}
		System.out.print("sort=  ");
	}
	
	
	 public  void out_mass() {
		for(int j=0;j<mass.length;j++) { 
		   String dots = (j<mass.length-1) ? ",":" ";
		   System.out.print(mass[j]+dots);
		   }
	};
	
	public static void main(String[] args) {
		sort_ch massiv = new sort_ch(5,36); 
	
	       //Сортирвка
		massiv.sort_mass();
	       //Вывод массива
		massiv.out_mass();
		}
}
