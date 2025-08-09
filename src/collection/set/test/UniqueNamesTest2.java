package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

	public static void main(String[] args) {
		Integer[] inputArr = {30, 20, 20, 10, 10};
		List<Integer> list = List.of(inputArr); //배열을 기반으로 리스트 만듦
		
		//LinkedHashSet 만들면서 list를 넣는다
		Set<Integer> set = new LinkedHashSet<>(list); //입력 순서대로
		
//		for(Integer num : inputArr) {
//			set.add(num);
//		}
		
		for(Integer num : set) {
			System.out.println(num);
		}
	}
	
}
