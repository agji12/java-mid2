package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
	//Animal이나 Animal의 자식들만 T에 들어올 수 있다. (최대 Animal까지)
	//Animal의 기능을 사용할 수 있다.
	private T animal;
	
	public void set(T animal) {
		this.animal = animal;
	}

	public void checkup() {
		System.out.println("동물 이름: " + animal.getName());
		System.out.println("동물 크기: " + animal.getSize());
		animal.sound();
	}

	public T bigger(T target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}

}
