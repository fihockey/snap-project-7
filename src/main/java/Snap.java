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

            System.out.println("Player: " + getName() + ", Card: " + currentCard);

            if (prevCard != null && prevCard.getValue() == currentCard.getValue()) {
                System.out.println("SNAP! Player: " + getName() + " wins! You owe me one....");
                break;
            }

            prevCard = currentCard;

            try {
                int readResult = System.in.read(new byte[System.in.available()]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}