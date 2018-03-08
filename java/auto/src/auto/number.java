package auto;

public class number {
	//Поля класса
	private String reg;//Регион ХХ 
	private String num;//Номер  AXXAA
	private String marka;//Марка автомобиля
	private String fio;//Владелец 
	
	//Конструктор класса
	public number(String r, String n,String m, String fio) {
		this.reg = r;
		this.num = n;
		this.marka = m;
		this.fio = fio;
	}
	
	//Проверяем содержится ли номер автомобиля в списке 
	protected boolean containsSerie(String s) {
		return this.num.equals(s);
	}
	
	protected boolean containsNum(String n) {
		return this.num.equals(n);
	}
	
	//Возврат владельца 
	String getFio() {
		return this.fio;
	}
	
	//Метод возвращает ФИО владельца автомобиля при совпадении параметров (региона и номер автомобиля)
	
	String getFioBySN(String s,String n) {
		if(this.containsSerie(s) && this.containsNum(n)) {
			return this.fio+" номер "+this.num+" "+this.reg+" марка "+this.marka ;
		}
		else {
			return "";
		}
	}
	
}
