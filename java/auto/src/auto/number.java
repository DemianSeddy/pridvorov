package auto;

public class number {
	//���� ������
	private String reg;//������ �� 
	private String num;//�����  AXXAA
	private String marka;//����� ����������
	private String fio;//�������� 
	
	//����������� ������
	public number(String r, String n,String m, String fio) {
		this.reg = r;
		this.num = n;
		this.marka = m;
		this.fio = fio;
	}
	
	//��������� ���������� �� ����� ���������� � ������ 
	protected boolean containsSerie(String s) {
		return this.num.equals(s);
	}
	
	protected boolean containsNum(String n) {
		return this.num.equals(n);
	}
	
	//������� ��������� 
	String getFio() {
		return this.fio;
	}
	
	//����� ���������� ��� ��������� ���������� ��� ���������� ���������� (������� � ����� ����������)
	
	String getFioBySN(String s,String n) {
		if(this.containsSerie(s) && this.containsNum(n)) {
			return this.fio+" ����� "+this.num+" "+this.reg+" ����� "+this.marka ;
		}
		else {
			return "";
		}
	}
	
}
