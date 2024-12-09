package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		//index 입력: O(1) 한 번만에 찾을 수 있다는 뜻
		//인덱스를 이용해 배열의 위치를 바로 찾는 데 한 번이면 됨
		System.out.println("==index 입력: O(1)==");
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==index 변경: O(1)==");
		arr[2] = 10;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==index 조회: O(1)==");
		System.out.println("arr[2] = " + arr[2]);
		
		System.out.println("==배열 검색: O(n)=="); //n: 데이터의 개수
		System.out.println(Arrays.toString(arr));
		int value = 10;
		for(int i = 0;i < arr.length;i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
			if(arr[i] ==value) {
				System.out.println(value + " 찾음");
				break;
			}
		}
		
	}
	
}
