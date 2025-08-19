package collection.compare.test;

public class CardGameMain {

	public static void main(String[] args) {
		Deck deck = new Deck(); //52개의 카드 생성
		Player player1 = new Player("플레이어1");
		Player player2 = new Player("플레이어2");

		//52장의 카드 중에서 5장씩 나눠갖는다
		for(int i = 0;i < 5;i++) {
			player1.drawCard(deck);
			player2.drawCard(deck);
		}
		
		player1.showHand();
		player2.showHand();
		
		//Player winner;
		//이렇게 변수 선언 후 나중에 값을 넣어주는 방식은 별로 좋지 않다.
		//메서드를 만들어 바로 값을 넣어줄 수 있도록한다.
		Player winner = getWinner(player1, player2);
		
		if(winner != null) {
			System.out.println(winner.getName() + " 승리");
		}else {
			System.out.println("무승부");
		}
	}
	
	public static Player getWinner(Player player1, Player player2) {
		int sum1 = player1.rankSum();
		int sum2 = player2.rankSum();
		
		if(sum1 > sum2) {
			return player1;
		}else if(sum1 == sum2) {
			return null;
		}else {
			return player2;
		}
	}
	
}
