package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<>();
	
	public Deck() {
		initCard();
		shuffle();
	}
	
	private void initCard() {
		for(int i = 1;i <= 13;i++) {
			Suit[] values = Suit.values();
			for(Suit suit : values) {
				cards.add(new Card(i, suit));
			}
		}
	}
	
	private void shuffle() {
		Collections.shuffle(cards);
	}
 	
	public Card drawCard() {
		return cards.remove(0); //리스트에서 삭제해야
		//return cards.removeFirst(); //자바 21이상
	}
	
}
