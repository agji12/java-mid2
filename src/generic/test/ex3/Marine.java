package generic.test.ex3;

public class Marine extends BioUnit {

	//상속 관계에서 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다.
	//단, BioUnit의 생성자가 기본 생성자인 경우 자바가 super() 를 자동으로 생성해 생략 가능하다.
	public Marine(String name, int hp) {
		super(name, hp);
	}
	
}
