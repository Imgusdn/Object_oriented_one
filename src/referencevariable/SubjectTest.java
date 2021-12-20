package referencevariable;

public class SubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1010, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		
		Student studentKim = new Student(1020, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 100);
		
		studentLee.showScoredInfo();
		studentKim.showScoredInfo();
	}
}
