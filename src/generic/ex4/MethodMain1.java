package generic.ex4;

public class MethodMain1 {

	public static void main(String[] args) {
		Integer i = 10;
		Object object = GenericMethod.objMethod(i);

		// 타입 인자(Type Argument) 명시적 전달
		System.out.println("명시적 타입 인자 전달");
		// 타입 매개변수를 무슨 타입으로 할지 정해줘야 함 
		// -> genericMethod() 호출할 때 타입 인자를 정해줘야
		// genericMethod의 타입인자는 Integer라고 결정하고 호출
		Integer result = GenericMethod.<Integer>genericMethod(i);
		Integer integerValue = GenericMethod.<Integer>numberMethod(10);
		Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
		//GenericMethod.<String>numberMethod("hello");
		
		//전달되는 값을 통해 타입 추론 가능
		System.out.println("타입 추론");
		Integer result2 = GenericMethod.genericMethod(i);
		Integer integerValue2 = GenericMethod.numberMethod(10);
		Double doubleValue2 = GenericMethod.numberMethod(20.0);
		
		//String a = GenericMethod.testMethod("test");
	}
	
}
