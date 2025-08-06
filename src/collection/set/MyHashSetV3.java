package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

	static final int DEFAULT_INNITIAL_CAPACITY = 16;
	
	private LinkedList<E>[] buckets;
	
	private int size = 0;
	private int capacity = DEFAULT_INNITIAL_CAPACITY;
	
	public MyHashSetV3() {
		initBuckets();
	}

	public MyHashSetV3(int capacity) {
		this.capacity = capacity;
		initBuckets();
	}
	
	private void initBuckets() {
		buckets = new LinkedList[capacity];
		for(int i = 0;i < capacity;i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	public boolean add(E value) {
		int hashIndex = hashIndex(value);
		LinkedList<E> bucket = buckets[hashIndex]; //O(1)
		if(bucket.contains(value)) { //O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
			return false;
		}
		
		bucket.add(value);
		size++;
		return true;
	}
	
	public boolean contains(E searchValue) {
		int hashIndex = hashIndex(searchValue);
		LinkedList<E> bucket = buckets[hashIndex]; //O(1)
		return bucket.contains(searchValue); //O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
	}
	
	public boolean remove(E value) {
		int hashIndex = hashIndex(value);
		LinkedList<E> bucket = buckets[hashIndex]; //O(1)
		//bucket.remove : O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
		boolean result = bucket.remove(value); //bucket 안에 있는 값을 찾아 지운다
		if(result) {
			size--;
			return true;
		}else {
			return false;
		}
	}
	
	private int hashIndex(Object value) {
		int hashCode = value.hashCode(); // 음수 나올수도
		return Math.abs(hashCode) % capacity;
	}
	 
	@Override
	public String toString() {
		return "MyHashSetV3{buckets=" 
				+ Arrays.toString(buckets) //size만큼만 출력
				+ ", size=" + size
				+ ", capacity=" + capacity
				+ '}';
	}
	
}
