import java.util.ArrayList;
import java.util.Random;
public class Deck {

	
		private ArrayList<Card> cards;
		private ArrayList<Card> usedCard;
		private ArrayList<Card> openCard; 
		public  ArrayList<Card> getOpenCard;
		public int nUsed = 0;
		public Random rnd = new Random();
		public Deck(int nDeck){
			cards = new ArrayList<Card> ();
			Card.Suit x = Card.Suit.Club;
			for(int k = 1;k <=nDeck;k++){
			for(Card.Suit s : Card.Suit.values()){
				for(int y = 1;y <= 13;y++){	
					Card newCard = new Card(s,y);
					cards.add(newCard);
					}
				}
			}
			shuffle();
		}
		
		public void printDeck(){
			
			  for(Card xx:cards){
					
					xx.printCard();
		}
		}
		
		public Card getOneCard() {
			//Card getCard;
			//getCard = cards.get(nUsed);
			nUsed++;
			usedCard.add(cards.get(nUsed-1));
			if (nUsed == 52) {
				shuffle();
			}
			return cards.get(nUsed);
		}

		public void shuffle() {
			nUsed = 0;
			openCard = null;
			usedCard = new ArrayList<Card> ();
			for (int i = 0; i < 52; i++) {
				int index = rnd.nextInt(52);//between 0 (inclusive) and the specified value 
				Card temp = cards.get(index);
				cards.set(index, cards.get(i));
				cards.set(i, temp);
			}
		}
		public ArrayList<Card> getAllCards(){
			return cards;
		}

		public Card getOneCard(boolean isOpened) {
			
			return null;//決定發出去的牌是開著還是蓋起來的


		}
		public ArrayList<Card> getOpenedCard() {
			return openCard;//回傳此副牌中所有打開過的牌
		}
	}

