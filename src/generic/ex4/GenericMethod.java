package generic.ex4;

public class GenericMethod {

	public static Object objMethod(Object obj) {
		System.out.println("Object print: " + obj);
		return obj;
	}
	
	//이 메서드만 제네릭이 된다.
	public static <T> T genericMethod(T t) {
		System.out.println("generic print: " + t);
		return t;
	}
	
	public static <T extends Number> T numberMethod(T t) {
		System.out.println("bound print: " + t);
		return t;
	}
	
	//이 메서드만 제네릭이 된다.
	public static <T> T testMethod(String t) {
		System.out.println("generic print: " + t);
		// Type Safety: unchecked cast from String to T 경고
		// type의 안전성을 보장할 수 없어 발생
		// 만약 T가 Integer이고 t의 값이 "test" 라면 오류 발생
		return (T) t;
	}
}
