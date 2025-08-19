package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	//private List<Card> list = new ArrayList<>();
	//private int sum = 0;
	private List<Card> hand;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void drawCard(Deck deck) {
		hand.add(deck.drawCard());
	}
	
	public int rankSum() {
		int value = 0;
		for(Card card : hand) {
			value += card.getRank();
		}
		return value;
	}
	
	public void showHand() {
		hand.sort(null);
		System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
	}
	
	/*
	 * 내 코드
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Card> getList() {
		return list;
	}

	public void drawCards() {
		Deck deck = new Deck();
		for(int i = 0;i < 5;i++) {
			Card card = deck.drawCard();
			sum += card.getRank();
			list.add(card);
		}
	}
	
	public void printResult() {
		list.sort(null);
		System.out.println(name + "의 카드: " + list + ", 합계: " + sum);
	}
	*/
}
