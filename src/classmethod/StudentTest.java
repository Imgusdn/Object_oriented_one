package classmethod;

public class StudentTest {
	public static void main(String[] args) {
		Student astudent = new Student();
		astudent.studentID = 1234;
		astudent.studentName = "ȫ�浿";
		astudent.address = "����";
		
		astudent.showStudentInfo();
		
		Student bStudent = new Student();
		bStudent.studentID = 5678;
		bStudent.studentName = "��浿";
		bStudent.address = "��õ";
		
		bStudent.showStudentInfo();
	}
}
