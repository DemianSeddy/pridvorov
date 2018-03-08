package auto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class auto {
	private String numder_auto;
	private String marka_auto;
	private String fio_auto;
	private String reg_auto;
	private ArrayList<number> pl = new ArrayList<number>();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Random r = new Random();
	private String number_auto;
	//pc - количество паспортов, которые нужно сгенерировать

	auto(int pc) throws IOException{
		this.generateNumbers();	
		//this.generatePassport(pc);
		}
	

	private void generateNumbers() throws IOException {
		String s[];
		String symbol[] = {" ","А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я"};
		boolean enough=false;
		System.out.println("Вы хотите ввести автомобили в ручную вручную (h) или сгенерировать автоматически (a)?");
		if(this.reader.readLine().toLowerCase().equals((new String("h")))){
			do {
				//Номер
				System.out.println("Введите номер автомобиля \"A_NNN_AA\"");
				s = this.reader.readLine().toString().split("_"); 
				System.out.println(s.length);
				if(s.length!=8) {
					System.out.println("Неправильный формат данных по длине. Нужно повторить");
					continue;
				}
				try {
					
					if ((s[0].matches("[а-яА-Я]") && s[0].length()==1) 
						  && (s[1].matches("[0..9]") && s[1].length()==3)
						    && (s[2].matches("[а-яА-Я]") && s[2].length()==2))
										{
											System.out.println(s[0]);
											System.out.println(s[1]);
											System.out.println(s[2]);	
					                    }
						     
					{
						throw new Exception("");
					}
				}
				catch (Exception e) {
					System.out.println("Неправильный формат номера . Нужно повторить");
				}//Номер
				//Регион				
				System.out.println("Введите регион \"NN");
				if(s.length!=2) {
					System.out.println("Неправильный формат данных по длине. Нужно повторить");
					continue;
				}
				try {
					
					if (s[0].matches("[0..9]") && s[1].length()==2)
						    
										{
											System.out.println(s[0]);
					                    }
						     
					{
						throw new Exception("");
					}
				}
				catch (Exception e) {
					System.out.println("Неправильный формат номера региона. Нужно повторить");
				}//Регион
				//ФИО				
				System.out.println("Введите владельца автомобиля \"NN");
				if(s.length!=2) {
					System.out.println("Неправильный формат данных по длине. Нужно повторить");
					continue;
				}
				try {
					
					if (s[0].matches("[а-яА-Я]") && s[1].length()==60)
						    
										{
											System.out.println(s[0]);
					                    }
						     
					{
						throw new Exception("");
					}
				}
				catch (Exception e) {
					System.out.println("Неправильный формат номера региона. Нужно повторить");
				}//ФИО

				
				
				enough=true;
			}
			while(!enough);//Ввод рукой;			
		}
		else 
		    //Генерация автоматом 
		    {
			  this.number_auto = symbol[this.r.nextInt(36)+1]+"_";
			  String snum=Integer.toString(this.r.nextInt(999)+1);
			  if (snum.length()!=3) 
					  {
				        for(int i=1;i<3;i++){
						snum='0'+snum;  
					  }
						  }
			  this.number_auto=this.number_auto+snum+"_"+symbol[this.r.nextInt(36)+1]+symbol[this.r.nextInt(36)+1];
				   
			    }
               //Фио как отдельный метод его ж не сгенериш?   
            
		getcar();
		getfio();
		this.pl.add(new number(this.reg_auto,this.number_auto,this.marka_auto,this.fio_auto));//Владелец    
		    
		//Генерация автоматом      
	
		System.out.println("Номер машины: "+this.number_auto+" марка:"+this.marka_auto);
		
	}	

    //Ввод руками названия марки машины
	private void getcar() throws IOException 
    {
   	 System.out.println("Введите название машины");
	   try{
	   
   	   if (this.reader.readLine().isEmpty()) 
		 {
			this.marka_auto=this.reader.readLine(); 
		 }}
	   	   catch (Exception e) {
			System.out.println("Неправильный формат номера машины. Нужно повторить");
		}
    }
    //Ввод руками названия марки владельца
    private void getfio() throws IOException 
    {
   	 System.out.println("Введите владельца");
		 if (this.reader.readLine().isEmpty()) 
		 {
			this.fio_auto=this.reader.readLine(); 
		 }
    }
	
	public static void main(String[] args) throws IOException {
		int pcount = (args.length==0)?5:Integer.parseInt(args[0]);
		auto p = new auto(pcount);
		//p.search();	
	}

}
