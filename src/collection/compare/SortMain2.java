package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

	public static void main(String[] args) {
		Integer[] array = {3, 2, 1};
		System.out.println(Arrays.toString(array));
		
		System.out.println("Comparator 비교");
		Arrays.sort(array, new AscComparator()); //비교자를 직접 넣어줄 수 있다
		System.out.println("AscComparator: " + Arrays.toString(array));
		
		Arrays.sort(array, new DescComparator());
		System.out.println("DescComparator: " + Arrays.toString(array));
		Arrays.sort(array, new AscComparator().reversed()); //DescComparator와 같다
		System.out.println("AscComparator.reversed: " + Arrays.toString(array));
	}
	
	//중첩 클래스
	static class AscComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			System.out.println("o1=" + o1 + " o2=" + o2);
			return (o1 < o2) ? -1 : (o1 == o2 ? 0 : 1);
		}
	}
	
	static class DescComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			System.out.println("o1=" + o1 + " o2=" + o2);
			//결과를 반대로 반환한다 -1 -> 1 / 1 -> -1
			return (o1 < o2) ? -1 : (o1 == o2 ? 0 : 1) * -1;
		}
	}
	
}
