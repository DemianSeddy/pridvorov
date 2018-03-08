package students;

import java.util.Comparator;

public class Student {
	private String fio;
	private float avg_mark;//средний балл успеваемости студента
	
	public Student(String fio,float m) {
		this.fio = fio;
		this.avg_mark = m;
	}
	
	public float getAvg_mark() {
		return avg_mark;
	}
	
	public String getFio() {
		return fio;
	}
	
	public String getFioMark() {
		return "‘амили€="+this.getFio()+" средн€€ оценка="+Float.toString(this.getAvg_mark());
	}
	
	protected static Comparator<Student> compareByMarkUP = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			float m = s1.getAvg_mark() - s2.getAvg_mark();
			if(m==0f)
				return 0;
			else if(m<0)
				return -1;
			else
				return 1;
		}
	};
	
	protected static Comparator<Student> compareByMarkDOWN = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			float m = s2.getAvg_mark() - s1.getAvg_mark();
			if(m==0f)
				return 0;
			else if(m<0)
				return -1;
			else
				return 1;
		}
	};
	
	protected static Comparator<Student> compareByFIOAsc = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			return s2.getFio().compareTo(s1.getFio());
		}
		
	};
	
	protected static Comparator<Student> compareByFIODec = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getFio().compareTo(s2.getFio());
		}
		
	};
}