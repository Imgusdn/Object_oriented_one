package referencevariable;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;		// Subject Ŭ���� �ν��Ͻ� korea ����
	Subject math;		// ����� new�� ������ ����������Ѵ�.
	
	Student(int studentId, String StudentName){			// Student�� ������, ���ÿ� Subject ������ ����
		this.studentId = studentId;
		this.studentName = StudentName;
		
		korea = new Subject();		// new�� ����
		math = new Subject();
	}
	
	public void setKoreaSubject( String name, int score) {		//�ѱ� ���� 
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject ( String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoredInfo() {
		int total = korea.score + math.score;
		System.out.println( studentName + "�л��� ������ " + total + "�� �Դϴ�.");
	}
	
}
