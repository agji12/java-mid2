package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

	//제네릭 타입을 받아 출력
	static <T> void printGenericV1(Box<T> box) {
		System.out.println("T = " + box.get());
	}
	
	//?에 다 들어올 수 있다.
	static void printWildcardV1(Box<?> box) {
		System.out.println("? = " + box.get());
	}
	
	static <T extends Animal> void printGenericV2(Box<T> box) {
		T t = box.get();
		System.out.println("이름 = " + t.getName());
	}
	
	//와일드카드에 들어오는 값 제한할 수 있다.
	static void printWildcardV2(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("이름 = " + animal.getName());
	}
	
	static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
		T t = box.get();
		System.out.println("이름 = " + t.getName());
		return t;
	}
	
	static Animal printAndReturnWildcard(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("이름 = " + animal.getName());
		return animal;
	}
}
