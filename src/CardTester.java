/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

		Card a = new Card("Two", "Hearts", 2);
		Card b = new Card("Five", "Spades", 5);
		Card c = new Card("Queen", "Clubs", 12);

		a.pointValue();
		a.matches(b);
		a.suit();
		a.rank();
		a.toString();
	}
}
