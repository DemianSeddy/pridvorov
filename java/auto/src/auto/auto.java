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
	//pc - ���������� ���������, ������� ����� �������������

	auto(int pc) throws IOException{
		this.generateNumbers();	
		//this.generatePassport(pc);
		}
	

	private void generateNumbers() throws IOException {
		String s[];
		String symbol[] = {" ","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�","�"};
		boolean enough=false;
		System.out.println("�� ������ ������ ���������� � ������ ������� (h) ��� ������������� ������������� (a)?");
		if(this.reader.readLine().toLowerCase().equals((new String("h")))){
			do {
				//�����
				System.out.println("������� ����� ���������� \"A_NNN_AA\"");
				s = this.reader.readLine().toString().split("_"); 
				System.out.println(s.length);
				if(s.length!=8) {
					System.out.println("������������ ������ ������ �� �����. ����� ���������");
					continue;
				}
				try {
					
					if ((s[0].matches("[�-��-�]") && s[0].length()==1) 
						  && (s[1].matches("[0..9]") && s[1].length()==3)
						    && (s[2].matches("[�-��-�]") && s[2].length()==2))
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
					System.out.println("������������ ������ ������ . ����� ���������");
				}//�����
				//������				
				System.out.println("������� ������ \"NN");
				if(s.length!=2) {
					System.out.println("������������ ������ ������ �� �����. ����� ���������");
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
					System.out.println("������������ ������ ������ �������. ����� ���������");
				}//������
				//���				
				System.out.println("������� ��������� ���������� \"NN");
				if(s.length!=2) {
					System.out.println("������������ ������ ������ �� �����. ����� ���������");
					continue;
				}
				try {
					
					if (s[0].matches("[�-��-�]") && s[1].length()==60)
						    
										{
											System.out.println(s[0]);
					                    }
						     
					{
						throw new Exception("");
					}
				}
				catch (Exception e) {
					System.out.println("������������ ������ ������ �������. ����� ���������");
				}//���

				
				
				enough=true;
			}
			while(!enough);//���� �����;			
		}
		else 
		    //��������� ��������� 
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
               //��� ��� ��������� ����� ��� � �� ��������?   
            
		getcar();
		getfio();
		this.pl.add(new number(this.reg_auto,this.number_auto,this.marka_auto,this.fio_auto));//��������    
		    
		//��������� ���������      
	
		System.out.println("����� ������: "+this.number_auto+" �����:"+this.marka_auto);
		
	}	

    //���� ������ �������� ����� ������
	private void getcar() throws IOException 
    {
   	 System.out.println("������� �������� ������");
	   try{
	   
   	   if (this.reader.readLine().isEmpty()) 
		 {
			this.marka_auto=this.reader.readLine(); 
		 }}
	   	   catch (Exception e) {
			System.out.println("������������ ������ ������ ������. ����� ���������");
		}
    }
    //���� ������ �������� ����� ���������
    private void getfio() throws IOException 
    {
   	 System.out.println("������� ���������");
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
