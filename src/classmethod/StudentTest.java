package classmethod;

public class StudentTest {
	public static void main(String[] args) {
		Student astudent = new Student();
		astudent.studentID = 1234;
		astudent.studentName = "홍길동";
		astudent.address = "서울";
		
		astudent.showStudentInfo();
		
		Student bStudent = new Student();
		bStudent.studentID = 5678;
		bStudent.studentName = "고길동";
		bStudent.address = "인천";
		
		bStudent.showStudentInfo();
	}
}
