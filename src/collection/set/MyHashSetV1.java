package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

	static final int DEFAULT_INNITIAL_CAPACITY = 16;
	
	LinkedList<Integer>[] buckets;
	
	private int size = 0;
	private int capacity = DEFAULT_INNITIAL_CAPACITY;
	
	public MyHashSetV1() {
		initBuckets();
	}

	public MyHashSetV1(int capacity) {
		this.capacity = capacity;
		initBuckets();
	}
	
	private void initBuckets() {
		buckets = new LinkedList[capacity];
		for(int i = 0;i < capacity;i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	
	public boolean add(int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
		if(bucket.contains(value)) { //O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
			return false;
		}
		
		bucket.add(value);
		size++;
		return true;
	}
	
	public boolean contains(int searchValue) {
		int hashIndex = hashIndex(searchValue);
		LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
		return bucket.contains(searchValue); //O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
	}
	
	public boolean remove(int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
		//bucket.remove : O(n) -> 거의 O(1)에 가깝다 (데이터가 1,2개)
		boolean result = bucket.remove(Integer.valueOf(value)); //bucket 안에 있는 값을 찾아 지운다
		if(result) {
			size--;
			return true;
		}else {
			return false;
		}
	}
	
	private int hashIndex(int value) {
		return value % capacity;
	}
	 
	@Override
	public String toString() {
		return "MyHashSetV1{buckets=" 
				+ Arrays.toString(buckets) //size만큼만 출력
				+ ", size=" + size + '}';
	}
	
}
