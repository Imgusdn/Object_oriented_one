package constructor;

public class Person {
	
	String name;
	int age;
	// �����ڴ� �ν��Ͻ��� �ʱ�ȭ�Ҷ� �ַ� ���
	// this�� �����ڿ��� �����ڸ� ȣ���� �� �Ǵ� ��������� ȣ���� �� �ַ� ���
	public Person() {
		this("�̸�����",1);	// Person �ν��Ͻ��� ���� ���� ������ �ʱ�ȭ�Ͽ� �⺻ ���� �� ������
	}						// this�� �����ڿ��� �����ڸ� ȣ���Ҷ� ��� ����
	
	public Person(String name, int age) {
		this.name = name;	// Person�� �Ű������� �Է¹ޱ�
		this.age = age;
	}
	
	public Person getPerson() {
		return this;	// �� �޸𸮿� ����� Person�� ��ü�ּҸ� ��ȯ
	}
	
	public void showPerson() {
		System.out.println("�̸��� " + name + "���̴� " + age);
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.showPerson();	// �Է¹��� ���ڰ��� �����Ƿ� �ʱ�ȭ�� �� ���
		
		p.name = "James";
		p.age = 37;
		p.showPerson();	// �Է¹��� �� ���
		
		Person p2 = p.getPerson();	// p2�� �� �޸𸮿� ����� �ν��Ͻ� �ּҸ� ����ִ�.
		System.out.println(p);	// Person�� �� �޸� �ּҸ� ��� �ִ� p�� ȣ��
		System.out.println(p2);	// p�� �ν��Ͻ� �ּҸ� ��ȯ�� ���� p2�� �����Ͽ� ���
	}	
}
