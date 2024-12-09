package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

	private static final int DEFAULT_CAPACITY = 5;
	
	private Object[] elementData; //필드
	private int size = 0;
	
	public MyArrayListV2() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public MyArrayListV2(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}
	
	//리스트의 크기
	public int size() {
		return size;
	}
	
	//리스트에 데이터 추가
	public void add(Object e) {
		//코드 추가
		if(size == elementData.length) {
			grow();
		}
		elementData[size] = e;
		size++;
	}
	
	//코드 추가
	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
//		//배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//		Object[] newArr = new Object[newCapacity];
//		for(int i = 0;i < elementData.length;i++) {
//			newArr[i] = elementData[i];
//		}
//		elementData = newArr;
		//newCapacity 크기만큼의 배열을 새로 만들어 elementData 배열에
		//들어있는 데이터를 복사해 새로운 배열에 넣는다.
		//Arrays.copyOf는 배열을 리턴한다.
		elementData = Arrays.copyOf(elementData, newCapacity);
	}
	
	//인덱스에 있는 항목 조회
	public Object get(int index) {
		return elementData[index];
	}
	
	//인덱스에 있는 항목 변경 - 이전에 있던 값 반환
	public Object set(int index, Object element) {
		Object oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}
	
	//검색 기능 - 리스트를 순차 탐색해 인수와 같은 데이터가 있는 인덱스 위치 반환
	public int indexOf(Object o) {
		for(int i = 0;i < size;i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	
	//size 크기의 배열을 toString() 출력
	public String toString() {
		//[1,2,3,null,null] // size=3
		//[1,2,3] //size=3
		//copyOf : elementData 배열에서 size만큼 복사
		return Arrays.toString(Arrays.copyOf(elementData, size))
				+ " size=" + size + ", capacity=" + elementData.length;
	}
}
