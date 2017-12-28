import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CardGenerator {

    private static Random generator = new Random();
    private static Map<Integer, Card> cards = new HashMap<>();

    static {
        // Filling the card deck with cards 2 to 10 (4 cards of every value)
        int countKeys = 0;
        for(int i = 2; i < 11; i++) {
            for(int j = 0; j < 4; j++) {
                cards.put(countKeys, new Card(String.valueOf(i), i));
                countKeys++;
            }
        }
        // Filling the card deck with cards J to A (4 cards of every value)
        int value = 10;
        String figure[] = {"J", "Q", "K", "A"};
        for(int i = 0; i < 4; i++) {
            if(i == 3)
                value = 11;
            for(int j = 0; j < 4; j++) {
                cards.put(countKeys, new Card(figure[i], value));
                countKeys++;
            }
        }
    }

    public Card takeCard() {
        // method returns a card and remove it from the deck
        Integer key = generator.nextInt(52);
        Card card = cards.get(key);
        cards.remove(key);
        return card;
    }

    public static Map<Integer, Card> getCards() {
        return cards;
    }
}
