package generic.ex1;

public class RawTypeMain {

	public static void main(String[] args) {
		GenericBox integerBox = new GenericBox();
		//GenericBox<Object> integerBox = new GenericBox<>(); // 권장
		integerBox.set(10);
		Integer result = (Integer) integerBox.get(); // Object 반환
		System.out.println("result = " + result);
	}
	
}
