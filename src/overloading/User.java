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
		return "키가" + userHeight + "이고 몸무게가 " + userWeight + "킬로인 남성이 있습니다. 이름은 " + userName + "이고 나이는 " + userAge + "입니다.";
	}
}
