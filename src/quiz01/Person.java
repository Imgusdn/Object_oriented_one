package quiz01;

public class Person {

    public int height;
    public int weight;
    public String gender;
    public String name;
    public int age;

    public Person(int height, int weight, String gender, String name, int age) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String showInfo() {
        return "Ű�� " + this.height + "�̰� �����԰� " + this.weight + " ų���� " + this.gender + "�� �ֽ��ϴ�. �̸��� " + this.name + "�̰� ���̴� " + this.age + "�Դϴ�.";
    }
}