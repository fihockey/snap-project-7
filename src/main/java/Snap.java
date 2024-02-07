public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }

    public void playSnap() {
        Card prevCard = null;
        Card currentCard;

        while (true) {
            currentCard = dealCard();
            if (currentCard == null) {
                System.out.println("Blimey! There's no more cards in the deck. Unlucky! GAME OVER.");
                break;
            }

            System.out.println(getName() + ", Card: " + currentCard);

            if (prevCard != null && prevCard.getValue() == currentCard.getValue()) {
                System.out.println("SNAP! Player: " + getName() + " wins! You owe me one....");
                break;
            }

            prevCard = currentCard;

            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}