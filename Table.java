import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Table {
	final int MAXPLAYER = 4; // 最多4人玩
	int[] players = new int[MAXPLAYER];
	Scanner sc = new Scanner(System.in);
	private String name;
	private int chips;
	private int bet = 300;
	private ArrayList<Card> oneRoundCard;
	private int getTotalValue;

	public enum Suit {
		Club, Diamoond, Heart, Spade
	};

	private Suit suit;
	private int rank;

	public Table(int i) {
		int Deck = 0;
		int d = 0;
	}

	public void set_player(int pos, Player p) {
		pos = MAXPLAYER;
	}

	public Player[] get_player() {

		return null;
	}

	public void set_dealer(Dealer d) {
		return;
	}

	public void get_face_up_card_of_dealer() {
		return;
	}

	private int ask_each_player_about_bets() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");

		bet = 1;
		if (chips >= 1) {
			return bet;
		} else {
			System.out.println("籌碼歸零，無法下注!!");
			return 0;
		}
	}

	private void distribute_cards_to_dealer_and_players() {
		System.out.println(oneRoundCard);
		System.out.println("Dealer's face up card is" );
	}

	private void ask_each_player_about_hits() {
	}

	private void Card(Suit s, int r) {
		suit = s;
		rank = r;

		System.out.println(s + "," + r);
	}

	private void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard = cards;
	}

	private void ask_dealer_about_hits() {
		int nDeck=4; 
 		Deck deck=new Deck(nDeck);
 		Player player1=new Player("Player 1",100); 
 		Player player2=new Player("Player 2",300); 
 		Player player3=new Player("Player 3",300);
 		Player player4=new Player("Player 4",300);
 		
 		player1.say_hello(); 
 		player2.say_hello(); 
 		player3.say_hello();
 		player4.say_hello();
 		
 		int p1Bet=player1.make_bet(); 
 		int p2Bet=player2.make_bet();
 		int p3Bet=player3.make_bet(); 
 		int p4Bet=player4.make_bet();
 		
 		ArrayList<Card> player1Card=new ArrayList<Card>(); 
 		player1Card.add(deck.getOneCard(true)); 
 		player1Card.add(deck.getOneCard(true)); 
 		player1.setOneRoundCard(player1Card); 
 		 
 		ArrayList<Card> player2Card=new ArrayList<Card>(); 
 		player2Card.add(deck.getOneCard(true)); 
 		player2Card.add(deck.getOneCard(true)); 
 		player2.setOneRoundCard(player2Card); 
 		
 		ArrayList<Card> player3Card=new ArrayList<Card>(); 
 		player3Card.add(deck.getOneCard(true)); 
 		player3Card.add(deck.getOneCard(true)); 
 		player3.setOneRoundCard(player3Card); 
 		
 		ArrayList<Card> player4Card=new ArrayList<Card>(); 
 		player4Card.add(deck.getOneCard(true)); 
 		player4Card.add(deck.getOneCard(true)); 
 		player4.setOneRoundCard(player4Card);
 		boolean hit=false; 
 		do{ 
 			hit=player1.hit_me();  
 			if(hit){  				
 				player1Card.add(deck.getOneCard(true)); 
 				System.out.print("Hit! "); 
 				System.out.println(player1.get_name()+"'s Cards now:"); 
 				for(Card c : player1Card){ 
 					c.printCard(); 
				} 
 			} 
 			else{ 
 				System.out.println(player1.get_name()+", Pass hit!"); 
 				System.out.println(player1.get_name()+", Final Card:"); 
 				for(Card c : player1Card){ 
	c.printCard(); 
 				} 
 			} 
 		}while(hit);  
 		hit=false; 
 		do{ 
 			hit=player2.hit_me();  
 			if(hit){ 
 				player2Card.add(deck.getOneCard(true)); 
 				System.out.print("Hit! "); 
 				System.out.println(player2.get_name()+"'s Cards now:"); 
 				for(Card c : player2Card){ 
 					c.printCard(); 
 				} 
 			} 
 			else{ 
 				System.out.println(player2.get_name()+", Pass hit!"); 
 				System.out.println(player2.get_name()+", Final Card:"); 
 				for(Card c : player2Card){ 
 					c.printCard(); 
 				} 
 			} hit=player3.hit_me();  
			if(hit){  				
				player3Card.add(deck.getOneCard(true)); 
				System.out.print("Hit! "); 
				System.out.println(player3.get_name()+"'s Cards now:"); 
				for(Card c : player3Card){ 
					c.printCard(); 
			} 
			} 
			else{ 
				System.out.println(player3.get_name()+", Pass hit!"); 
				System.out.println(player3.get_name()+", Final Card:"); 
				for(Card c : player3Card){ 
c.printCard(); 
				} 
			} 
		}while(hit);
		hit=false;hit=player4.hit_me();
		if(hit){
		player4Card.add(deck.getOneCard(true));
		System.out.print("Hit! ");
		System.out.println(player4.get_name() + "'s Cards now:");
		for (Card c : player4Card) {
			c.printCard();
		}
	}else
	{
		System.out.println(player4.get_name() + ", Pass hit!");
		System.out.println(player4.get_name() + ", Final Card:");
		for (Card c : player4Card) {
			c.printCard();
		}
	}
}
	

	private boolean hit_me() {
		if (getTotalValue <= 16) {
			return true;
		} else {
			return false;
		}
	}

	private void calculate_chips() {
	}

	public void play() {

		ask_each_player_about_bets();

		distribute_cards_to_dealer_and_players();

		ask_each_player_about_hits();

		ask_dealer_about_hits();
		calculate_chips();

	}

}
