package collection.set.member;

import java.util.Objects;

public class Member {

	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	 public String toString() {
		 return "Member{id='" + id + '\'' + '}';
	 }
	
}
