public class Main {
    public static void main(String[] args) {
        Snap snapGame = new Snap("Player 1");
        snapGame.shuffleDeck();
        snapGame.playSnap();
    }
}