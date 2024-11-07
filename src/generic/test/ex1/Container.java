package generic.test.ex1;

public class Container<T> {

	private T value;
	
	public void setItem(T data) {
		this.value = data;
	}

	public T getItem() {
		return value;
	}
	
	public boolean isEmpty() {
//		if(value != null) {
//			return false;
//		}
//		return true;
		return value == null; //null인 경우 true 반환 한 줄로 작성 가능하다!
	}

}
