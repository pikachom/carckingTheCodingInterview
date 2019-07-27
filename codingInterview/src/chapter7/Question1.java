package chapter7;

import java.util.ArrayList;
import java.util.Collections;

public class Question1 {
	//deck of card -_-??
}
class Deck{
	ArrayList<Card> cardDeck;
	public Deck() {
		this.cardDeck = new ArrayList<Card>();
		for(Suit suit : Suit.values()) {
			for(int i=1; i<=12; i++) {
				Card oneCard = new Card(suit, i);
				cardDeck.add(oneCard);
			}
		}
	}	
	public Card getLastCard() {
		return cardDeck.remove(cardDeck.size());
	}
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
	
}
class Card{
	Suit suit;
	int faceValue;
	public Card(Suit s, int f) {
		this.suit = s;
		this.faceValue = f;
	}
}

enum Suit{
	Club, Diamond, Heart, Spade;
}
