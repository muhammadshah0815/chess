public class Game {
    private Board board;

    public Game() {
        board = new Board();
        board.initialize();
    }

    public void start() {
        // Implement game loop here
        // For now, just print the board or handle simple moves
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
