package collection.map.test.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

	private Map<String, Member> memberMap = new HashMap<>();
	
	public void save(Member member) {
		memberMap.put(member.getId(), member);
	}
	
	public void remove(String id) {
		memberMap.remove(id);
	}
	
	public Member findById(String id) {
		//if(memberMap.containsKey(id)) {
			return memberMap.get(id);
		//}
		//return null; //없어도 되는 코드
	}
	
	public Member findByName(String name) {
		Collection<Member> values = memberMap.values();
		for(Member member : values) {
			if(member.getName().equals(name)) {
				return member;
			}
		}
		return null;
	}

}
