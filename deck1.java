import java.util.ArrayList;
import java.util.Random;

public class deck1 {
	private ArrayList<card1> cards;
	private ArrayList<card1> usedcard;
	ArrayList name = cards;
	Random i = new Random();
	public int used = 0;
	public int nUsed;

	public deck1(int ndeck) {
		cards = new ArrayList<card1>();
		for (int i = 0; i <= ndeck; i++) {
			for (card1.Suit s : card1.Suit.values()) {
				for (int k = 1; k <= 13; k++) {
					card1 card = new card1(s, k);
					cards.add(card);
				}

			}
		}
		shuffle();
	}

	public void printDeck() {
		for (card1 d : cards) {
			d.PrintCard();
		}
	}

	public ArrayList<card1> getAllCards() {
		return cards;
	}

	public void shuffle() {
		cards = new ArrayList<card1>();
		used = 0;
		for (card1 shufflecard : cards) {
			int change = i.nextInt(52);
			card1 changed = cards.get(change);
			cards.set(cards.indexOf(shufflecard), changed);
			cards.set(cards.indexOf(change), shufflecard);
		}
	}

	public card1 getOneCard() {
		if (used == 52) {
			shuffle();
		}
		card1 gettenCard = cards.get(used);
		usedcard.add(gettenCard);
		used++;
		return gettenCard;
	}

}
