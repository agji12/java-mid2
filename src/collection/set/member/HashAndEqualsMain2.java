package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

	public static void main(String[] args) {
		//중복 등록
		MyHashSetV2 set = new MyHashSetV2(10);
		MemberOnlyHash m1 = new MemberOnlyHash("A");
		MemberOnlyHash m2 = new MemberOnlyHash("A");
		
		System.out.println("m1.hashCode() = " + m1.hashCode()); //Object가 제공하는 참조값
		System.out.println("m2.hashCode() = " + m2.hashCode());
		System.out.println("m1.equals(m2) = " + m1.equals(m2)); //기본은 == 비교
		
		// identityHashCode : 참조값 그대로 출력
		System.out.println("System.ref(m1) = " + System.identityHashCode(m1));;
		System.out.println("System.ref(m2) = " + System.identityHashCode(m2));;
		
		set.add(m1);
		set.add(m2);
		System.out.println(set);
		
		//검색 실패
		MemberOnlyHash searchValue = new MemberOnlyHash("A");
		System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
		boolean contains = set.contains(searchValue);
		System.out.println("contains = " + contains);
	}
	
}
