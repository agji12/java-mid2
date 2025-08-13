package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	private Map<Product, Integer> cartMap = new HashMap<>();
	
	public void add(Product product, int count) {
		/*
		if(cartMap.containsKey(product)) {
			cartMap.put(product, cartMap.get(product) + count);
		}else {
			cartMap.put(product, count);
		}
		*/
		// 위의 코드를 줄여서 아래와 같이
		Integer existingQuantity = cartMap.getOrDefault(product, 0);
		cartMap.put(product, existingQuantity + count);
	}
	
	public void minus(Product product, int count) {
		/*
		if(cartMap.containsKey(product)) {
			int prevCount = cartMap.get(product);
			if(prevCount - count < 1) {
				cartMap.remove(product);
			}else {
				cartMap.put(product, cartMap.get(product) - count);
			}
		}
		*/
		// 위의 코드를 줄여서 아래와 같이
		int existingQuantity = cartMap.getOrDefault(product, 0);
		int newQuantity = existingQuantity - count;
		if(newQuantity <= 0) {
			cartMap.remove(product); //hashCode(),equals()가 구현되어 있어야 같은지 비교할 수 있다!
		}else {
			cartMap.put(product, newQuantity);
		}
	}
	
	public void printAll() {
		System.out.println("==모든 상품 출력==");
		for(Map.Entry<Product, Integer> cart : cartMap.entrySet()) {
			System.out.println("상품: " + cart.getKey() + " 수량: " + cart.getValue());
		}
	}
	
}
