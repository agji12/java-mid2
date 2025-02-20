package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void displayItems() {
		int sum = 0;
		
		System.out.println("장바구니 상품 출력");
		for(Item item : items) {
			//유지보수 측면에서 출력 코드와 합계를 구하는 코드가 같이 있는 것은 좋지 않다.
			//코드가 한 눈에 안 들어오기 때문.. 또한 합계 구하는 코드를 메서드를 뺄 수 있다.
			System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
			sum += item.getTotalPrice();
		}
		System.out.println("전체 가격 합: " + sum);
	}
	
}
