package quiz01;

public class Order {

    public String orderNumber;
    public String orderPhoneNumber;
    public String address;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuNumber;

    public Order(String orderNumber, String orderPhoneNumber, String address, String orderDate, String orderTime, int price, String menuNumber) {
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public void showInfo() {
        System.out.println("�ֹ� ���� ��ȣ : " + this.orderNumber);
        System.out.println("�ֹ� �ڵ��� ��ȣ : " + this.orderPhoneNumber);
        System.out.println("�ֹ� �� �ּ�: " + this.address);
        System.out.println("�ֹ� ��¥ : " + this.orderDate);
        System.out.println("�ֹ� �ð� : " + this.orderTime);
        System.out.println("�ֹ� ���� : " + this.price);
        System.out.println("�޴� ��ȣ : " + this.menuNumber);
    }
}