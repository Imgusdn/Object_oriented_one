package array;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 �迭�̶�
		 ������ �ڷ����� ������ �ڷ� ����
		 �ε��� ������[]�� �̿��Ͽ� ���� ������ ����
		 ������ ��ġ�� ���� ��ġ�� ����
		 �迭�� ������ 0���� ����
		 �ڹٿ����� ��ü �迭�� ������ ArrayList�� ���� Ȱ����
		 */

		// �迭 ����
		int[] arr1 = new int[10];
		int arr2[] = new int[10];

		// �迭 �ʱ�ȭ �ϱ�
		// �迭�� ����� ���ÿ� �ڷ����� ���� �ʱ�ȭ ��( ������ 0, �Ǽ��� 0.0, ��ü�� null)
		// �ʿ信 ���� �ʱⰪ�� ������ �� �ִ�
		int[] numbers1 = new int[] {10,20,30}; //���� �����ؾ� ��
		int[] numbers2 = {10,20,30};	//new int[] ��������
		int[] numbers3;
		numbers3 = new int[] {10,20,30}; // ������ �迭�� �����ϴ� ���� new int[] ������ �� ����

		// �迭 ����ϱ�
		// []�ε��� ������ Ȱ�� - �迭 ��Ұ� ����� �޸��� ��ġ�� �����Ͽ� ã�� ��
		// �迭�� �̿��Ͽ� ���� ���ϱ�
		int[] arr = new int[10];
		int total = 0;

		for(int i=0, num=1; i<arr.length; i++,num++) {
			arr[i] = num;
		}
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
}

