package referencevariable;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;		// 사용전 new로 생성자 생성해주기
	Subject math;
	
	Student(int studentId, String StudentName){
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
