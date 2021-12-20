package referencevariable;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;		// Subject 클래스 인스턴스 korea 생성
	Subject math;		// 사용전 new로 생성자 생성해줘야한다.
	
	Student(int studentId, String StudentName){			// Student의 생성자, 동시에 Subject 생성자 생성
		this.studentId = studentId;
		this.studentName = StudentName;
		
		korea = new Subject();		// new로 생성
		math = new Subject();
	}
	
	public void setKoreaSubject( String name, int score) {		//한국 과목 
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject ( String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoredInfo() {
		int total = korea.score + math.score;
		System.out.println( studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
