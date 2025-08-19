package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("list class = " + list.getClass());
		//멀티스레드 상황에서 list에 접근하면 동기화 문제가 발생할 수 있는데
		//Collections.synchronizedList()를 통해
		//동기화 문제가 발생하지 않는 안전한 리스트로 만들어준다.
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		System.out.println("synchronizedList class = " + synchronizedList.getClass());
	}
	
}
