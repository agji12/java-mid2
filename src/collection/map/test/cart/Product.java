package collection.map.test.cart;

import java.util.Objects;

public class Product {

	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	/* 객체를 key로 쓸 때 중복체크하기 위해서는 hashCode()와 equals()를 오버라이딩 해줘야한다!! */
	/* key는 set 구조다 */ 
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "Product{name=" + name + ", price=" + price + "}";
	}

}
