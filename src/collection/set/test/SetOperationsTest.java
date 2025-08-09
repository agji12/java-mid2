package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2); //겹치는 원소만 남겨둠
		// java.util.ConcurrentModificationException 에러 발생
		// 중간에 인덱스 수정되면서 발생
//		for(Integer s : intersection) {
//			if(!set2.contains(s)) {
//				intersection.remove(s);
//			}
//		}
		// Iterator를 이용해 순회 중에 안전하게 제거하자
//		Iterator<Integer> iterator = intersection.iterator();
//		while(iterator.hasNext()) {
//			Integer s = iterator.next();
//			if(!set2.contains(s)) {
//				iterator.remove();
//			}
//		}
		
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		
		System.out.println("합집합: " + union);
		System.out.println("교집합: " + intersection);
		System.out.println("차집합: " + difference);
		
	}
	
}
