package overloading;

public class User {
	public int userHeight;
	public int userWeight;
	public String userName;
	public int userAge;
	
	public User() {}
	
	public User(int userHeight, int userWeight, String userName,int userAge) {
		this.userHeight = userHeight;
		this.userWeight = userWeight;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	public String showUserInfo() {
		return "Ű��" + userHeight + "�̰� �����԰� " + userWeight + "ų���� ������ �ֽ��ϴ�. �̸��� " + userName + "�̰� ���̴� " + userAge + "�Դϴ�.";
	}
}
