package array;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 배열이란
		 동일한 자료형의 순차적 자료 구조
		 인덱스 연산자[]를 이용하여 빠른 참조가 가능
		 물리적 위치와 논리적 위치가 동일
		 배열의 순서는 0부터 시작
		 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
		 */

		// 배열 선언
		int[] arr1 = new int[10];
		int arr2[] = new int[10];

		// 배열 초기화 하기
		// 배열은 선언과 동시에 자료형에 따라 초기화 됨( 정수는 0, 실수는 0.0, 객체는 null)
		// 필요에 따라 초기값을 지정할 수 있다
		int[] numbers1 = new int[] {10,20,30}; //개수 생략해야 함
		int[] numbers2 = {10,20,30};	//new int[] 생략가능
		int[] numbers3;
		numbers3 = new int[] {10,20,30}; // 선언후 배열을 생성하는 경우는 new int[] 생략할 수 없음

		// 배열 사용하기
		// []인덱스 연산자 활용 - 배열 요소가 저장된 메모리의 위치를 연산하여 찾아 줌
		// 배열을 이용하여 합을 구하기
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

