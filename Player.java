import java.util.ArrayList;
import java.util.Scanner;
public class Player {

	Scanner sc = new Scanner(System.in);
	private String name;
	private int chips;
	private int bet = 0;
	private ArrayList<Card> oneRoundCard;
	
	public static void main(String[] args) {

	}
public Player(String name, int chips) {
	this.name = name;
	this.chips = chips;
}

public String get_name() {
	
	return name;
}

public void say_hello() {
	
	System.out.println("Hello, I am " + name + ".");
	System.out.println("I have " + chips + " chips.");
	
}

public int make_bet() {
	bet = 1;
	if (chips >= 1) {
		return bet;
	} 
	else {	
		System.out.println("Äw½XÂk¹s¡AµLªk¤Uª`!!");
		return 0;
	}
}

public boolean hit_me() {

	if (getTotalValue() <= 16) {
		return true;
	} 
	else {
		return false;
	}
}

public int getTotalValue() {
	int sum=0;
	return sum = 0;
	
}
public void increase_chips(int i) {
	chips += i;
}

public int get_current_chips() {
	
	return chips;
}
public void setOneRoundCard(ArrayList<Card> playerCard) {
	
	
	}
}

	



