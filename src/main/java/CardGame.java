import java.util.ArrayList;
import java.util.Collections;


public class CardGame {
    private final ArrayList<Card> deckOfCards;
    private final String name;

    public static final String RED = "\u001B[31m";
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = new ArrayList<>();
        initialiseDeck();
    }

    private void initialiseDeck() {
        String[] suits = {RED + "♥" + RESET, CYAN + "♣" + RESET, RED + "♦" + RESET, CYAN + "♠" + RESET};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                int value = i + 2;
                deckOfCards.add(new Card(suit, symbols[i], value));
            }
        }
    }

    public Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.remove(0);
        } else {
            System.out.println("Deck is empty!");
            return null;
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public String getName() {
        return name;
    }
}