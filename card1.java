
public class card1 {
	public enum Suit {
		Club, Diamond, Heart, Spade
	}

	private Suit suit;

	private int rank;

	public card1(Suit s, int r) {
		suit = s;
		rank = r;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public void PrintCard() {

		System.out.print("(" + getSuit() + "," + (getRank() == 13 ? getRank() + ") \n" : getRank() + ") "));
	}
}
