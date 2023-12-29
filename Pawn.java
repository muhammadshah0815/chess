public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end) {
        // Implement Pawn's specific movement logic
        return true; // Placeholder
    }
}