package bushighschool;

public class Texi {

	String texiName;
	int passengerCount;
	int money;

	public Texi(String texiName) {
		this.texiName = texiName;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showTexiInfo() {
		System.out.println(texiName + "�ý� ������ " + money + "�� �Դϴ�.");
	}

}
