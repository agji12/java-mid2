package collection.compare.test;

import java.util.HashSet;
import java.util.Set;

public class Card implements Comparable<Card> {
	
	private final int rank; //카드의 숫자
	private final Suit suit; //카드의 마크
	
	public Card(int rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card o) {
		// 숫자 먼저 비교하고, 숫자가 같으면 마크를 비교
		if(this.rank != o.rank) {
			return Integer.compare(this.rank, o.rank); //두 숫자 비교
		}else {
			// enum은 이미 enum을 상속받고 있으며, enum 내에 comparable이 구현되어 있음
			// enum 내에 적힌 순서대로 정렬
			// enum 내의 compareTo는 final이라 재구현 불가능
			return this.suit.compareTo(o.suit);
		}
	}

	@Override
	public String toString() {
		return rank + "(" + suit.getIcon() + ")";
	}	
}
