package constructor;

public class Person {
	
	String name;
	int age;
	// 생성자는 인스턴스를 초기화할때 주로 사용
	// this는 생성자에서 생성자를 호출할 때 또는 멤버변수를 호출할 때 주로 사용
	public Person() {
		this("이름없음",1);	// Person 인스턴스에 들어온 값이 없으면 초기화하여 기본 설정 값 보여줌
	}						// this는 생성자에서 생성자를 호출할때 사용 가능
	
	public Person(String name, int age) {
		this.name = name;	// Person에 매개변수를 입력받기
		this.age = age;
	}
	
	public Person getPerson() {
		return this;	// 힙 메모리에 저장된 Person의 객체주소를 반환
	}
	
	public void showPerson() {
		System.out.println("이름은 " + name + "나이는 " + age);
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.showPerson();	// 입력받은 인자값이 없으므로 초기화된 값 출력
		
		p.name = "James";
		p.age = 37;
		p.showPerson();	// 입력받은 값 출력
		
		Person p2 = p.getPerson();	// p2는 힙 메모리에 저장된 인스턴스 주소를 담고있다.
		System.out.println(p);	// Person의 힙 메모리 주소를 담고 있는 p를 호출
		System.out.println(p2);	// p의 인스턴스 주소를 반환한 값을 p2에 저장하여 출력
	}	
}
