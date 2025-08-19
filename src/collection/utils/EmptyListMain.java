package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

	public static void main(String[] args) {
		//빈 가변 리스트 생성
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		//빈 불변 리스트 생성
		List<Integer> list3 = Collections.emptyList(); //자바5
		List<Integer> list4 = List.of(); //자바9
		
		System.out.println("list3 = " + list3.getClass());
		System.out.println("list4 = " + list4.getClass());
		
		//보통 List.of()를 사용하는 것을 권장하지만, 배열의 크기가 매우 큰 경우
		//Arrays.asList()를 사용하는 것이 좋을 수 있다
		List<Integer> list5 = Arrays.asList(1, 2, 3); //배열을 그대로 가져다 씀
		List<Integer> list6 = List.of(1, 2, 3); //배열을 새로 만들어 씀
		
		Integer[] arr = {1, 2, 3, 4, 5};
		List<Integer> arrList = Arrays.asList(arr);
		
		arrList.set(0, 100); //arr도 값이 바뀐다!
		//arrList를 만들 때 arr의 참조값을 가져와 만들어
		//arrList의 값을 변경하면 arr의 값도 바뀌게 된다
		
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("arrList = " + arrList);
	}
	
}
