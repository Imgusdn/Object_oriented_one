package accesscontrol;

public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;	// 기본적으로 false가 Default 값, int는 0
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if( month < 1 || month > 12)	// 유효한 달인지 아닌지 구별하는 메소드
		{
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid){	// 기본적으로 false기 때문에 setMonth메소드에 입력한 값이 유효한 달이여야 true가 되어 메소드가 실행이 가능하다.
			System.out.println(year + "년" + month + "월 " + day + " 일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}
