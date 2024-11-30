package generic.test.ex3;

public class UnitPrinter {

	//T에 상한이 없으면 Object가 돼버린다.
	public static <T extends BioUnit> void printV1(Shuttle<T> t) {
		//t.showInfo();
		T unit = t.out();
		System.out.println("이름: " + unit.getName()
				+ ", HP: " + unit.getHp());
	}
	
	//?만 적어도 정상적으로 돌아간다.
	public static void printV2(Shuttle<?> t) {
		//t.showInfo();
		BioUnit unit = t.out();
		System.out.println("이름: " + unit.getName()
			+ ", HP: " + unit.getHp());
	}
	
}
