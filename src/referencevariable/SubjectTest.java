package referencevariable;

public class SubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1010, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);
		
		Student studentKim = new Student(1020, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 100);
		
		studentLee.showScoredInfo();
		studentKim.showScoredInfo();
	}
}
