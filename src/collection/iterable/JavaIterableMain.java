package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaIterableMain {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		printAll(list.iterator());
		printAll(set.iterator());
		
		//List의 부모 중 Iterable이 있어 foreach 메서드에서 Iterable로 받을 수 있는 것
		foreach(list); 
		foreach(set);
	}

	private static void printAll(Iterator<Integer> iterator) {
		System.out.println("iterator = " + iterator.getClass());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}		
	}
	
	private static void foreach(Iterable<Integer> iterable) {
		System.out.println("iterable = " + iterable.getClass());
		for(Integer i : iterable) {
			System.out.println(i);
		}
	}
	
}
