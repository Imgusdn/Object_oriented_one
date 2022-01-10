package array;

public class Ex02 {
	public static void main(String[] args) {
		// 배열의 길이와 요소의 개수는 동일하지 않습니다.
		/*
		 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이타)가 없는 경우도 있음
		 배열의 length 속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
		 length를 활용하여 오류가 나는 경우
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

		// 요소의 개수에 대한 변수(count)를 따로 유지
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

		// 문자 배열을 만들어 A-Z까지 배열에 저장 후 이를 출력
		char[] alpahbets1 = new char[26];
		char ch1 = 'A';
		
		for(int i=0; i<alpahbets1.length; i++) {
			alpahbets1[i] = ch1++;
		}
		for(int i=0; i<alpahbets1.length; i++) {
			System.out.println(alpahbets1[i] + "," + (int)alpahbets1[i]);
		}
		
		// 향상된 for문 사용하기
		// 배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있음
		/*
		   for(변수 : 배열) {
		   
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
