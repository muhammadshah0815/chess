public class Square {
    private int row;
    private int column;
    private Piece piece; // We will create the Piece class later

    public Square(int row, int column) {
        this.row = row;
        this.column = column;
        this.piece = null;
    }

    // Getters and setters
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }
}
