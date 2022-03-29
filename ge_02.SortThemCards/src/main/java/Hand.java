import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {

	private List<Card> cardsInHand;

	public Hand() {
		this.cardsInHand = new ArrayList<Card>();
	}

	public void add(Card card) {
		cardsInHand.add(card);
	}

	public void print() {
		cardsInHand.stream().forEach(System.out::println);
	}

	public void sort() {
		Collections.sort(cardsInHand);
	}

	int sum() {
		return cardsInHand.stream().mapToInt(card -> card.getValue()).sum();
	}

	@Override
	public int compareTo(Hand hand) {
		return Comparator.comparingInt(Hand::sum).compare(this, hand);
	}

	public void sortBySuit() {
		Collections.sort(cardsInHand, new BySuitInValueOrder());
	}
}
