package classvariable;

public class Employee {
	
	private static int serialNum = 1000;
	// 멤버변수는 인스턴스 생성 후 사용이 가능한 반면, 클래스 변수인 static은 인스턴스 생성없이 Employee.serialNum으로 사용 가능하다.
	private int employeeId;
	private String employeeName;
	private String department;
	// private로 생성한 멤버 변수들은 get,set을 사용 seriaNum은 입력값이 없어야 함으로 불러오는 get 값만 사용
	public Employee()		// 인스턴스 객체 생성시 클래스 변수 serialNum이 하나씩 증가하는 생성자
	{
		serialNum++;
		employeeId = serialNum;	// 증가된 값을 멤버 변수에 저장
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
