package array;

public class Ex02 {
	public static void main(String[] args) {
		// �迭�� ���̿� ����� ������ �������� �ʽ��ϴ�.
		/*
		 �迭�� �����ϸ� ������ŭ �޸𸮰� �Ҵ������, ���� ���(����Ÿ)�� ���� ��쵵 ����
		 �迭�� length �Ӽ��� �迭�� ������ ��ȯ���ֱ� ������ ����� �����ʹ� �ٸ�
		 length�� Ȱ���Ͽ� ������ ���� ���
		 */
		double[] dArr1 = new double[5];

		dArr1[0] = 1.1;
		dArr1[1] = 2.1;
		dArr1[2] = 3.1;

		double mtotal1 = 1;
		for(int i=0; i<dArr1.length; i++) {
			mtotal1 *= dArr1[i];
		}
		System.out.println(mtotal1);

		// ����� ������ ���� ����(count)�� ���� ����
		double[] dArr2 = new double[5];
		int count = 0;

		dArr2[0] = 1.1; count++;
		dArr2[1] = 2.1; count++;
		dArr2[2] = 3.1; count++;

		double mtotal2 = 1;
		for(int i=0; i<count; i++) {
			mtotal2 *= dArr2[i];
		}
		System.out.println(mtotal2);

		// ���� �迭�� ����� A-Z���� �迭�� ���� �� �̸� ���
		char[] alpahbets1 = new char[26];
		char ch1 = 'A';
		
		for(int i=0; i<alpahbets1.length; i++) {
			alpahbets1[i] = ch1++;
		}
		for(int i=0; i<alpahbets1.length; i++) {
			System.out.println(alpahbets1[i] + "," + (int)alpahbets1[i]);
		}
		
		// ���� for�� ����ϱ�
		// �迭�� n�� ��Ҹ� 0���� n-1���� ���������� ��ȸ�� �� �����ϰ� ����� �� ����
		/*
		   for(���� : �迭) {
		   
		   }
		 */
		char[] alpahbets2 = new char[26];
		char ch2 = 'A';
		
		for(int i=0; i<alpahbets2.length; i++) {
			alpahbets2[i] = ch2++;
		}
		for (char alpha : alpahbets2) {
			System.out.println(alpha + "," + (int)alpha);
		}
	}
}
