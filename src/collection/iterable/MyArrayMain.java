package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

	public static void main(String[] args) {
		MyArray myArray = new MyArray(new int[] {1, 2, 3, 4});
		
		// MyArray는 ArrayList, LinkedList, Hash 등 어떤 것이든 될 수 있다.
		// 그럴 때 iterator 없이 순회하려면 배열을 꺼내 그에 맞는 메서드를 사용해줘야 해서 불편하다
		Iterator<Integer> iterator = myArray.iterator();
		System.out.println("iterator 사용");
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println("value = " + value);
		}
		
		//추가
		//향상된 for문은 Array이거나 객체가 Iterable 인터페이스를 구현하면 사용가능하다
		//컴파일 시점에 위의 while문으로 코드가 변경된다. 
		System.out.println("for-each 사용");
		for(int value : myArray) {
			System.out.println("value = " + value);
		}
	}
	
}
