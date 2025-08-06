package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

	static final int DEFAULT_INNITIAL_CAPACITY = 16;
	
	private LinkedList<Object>[] buckets;
	
	private int size = 0;
	private int capacity = DEFAULT_INNITIAL_CAPACITY;
	
	public MyHashSetV2() {
		initBuckets();
	}

	public MyHashSetV2(int capacity) {
		this.capacity = capacity;
		initBuckets();
	}
	
	private void initBuckets() {
		buckets = new LinkedList[capacity];
		for(int i = 0;i < capacity;i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	public boolean add(Object value) {
		int hashIndex = hashIndex(value);
		LinkedList<Object> bucket = buckets[hashIndex]; //O(1)
		if(bucket.contains(value)) { //O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
			return false;
		}
		
		bucket.add(value);
		size++;
		return true;
	}
	
	public boolean contains(Object searchValue) {
		int hashIndex = hashIndex(searchValue);
		LinkedList<Object> bucket = buckets[hashIndex]; //O(1)
		return bucket.contains(searchValue); //O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
	}
	
	public boolean remove(Object value) {
		int hashIndex = hashIndex(value);
		LinkedList<Object> bucket = buckets[hashIndex]; //O(1)
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
		return "MyHashSetV2{buckets=" 
				+ Arrays.toString(buckets) //size만큼만 출력
				+ ", size=" + size + '}';
	}
	
}
