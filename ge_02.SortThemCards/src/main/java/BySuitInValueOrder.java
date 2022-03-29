import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

	@Override
	public int compare(Card c1, Card c2) {
		if (c1.getSuit().compareTo(c2.getSuit()) == 0) {
			return c1.compareTo(c2);
		}
		return c1.getSuit().compareTo(c2.getSuit());
	}

}
