package generic.test.ex3;

public class Shuttle<T extends BioUnit> {

	private T unit;
	
	//바로 unit에 t를 넣으면 된다. setUnit 메서드가 필요하지 않다.
//	public void setUnit(T unit) {
//		this.unit = unit;
//	}
//	
//	public T getUnit() {
//		return unit;
//	}

	public void in(T t) { //이게 setUnit 역할과 같다.
		//setUnit(t);
		unit = t;
	}
	
	public T out() {
		return unit;
	}
	
	public void showInfo() {
		System.out.println("이름: " + unit.getName()
				+ ", HP: " + unit.getHp());
	}
	
}
