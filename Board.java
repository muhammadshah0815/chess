public class Board {
    private Square[][] squares = new Square[8][8];

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSquare(int row, int column) {
        return squares[row][column];
    }

    public void initialize() {
        // Place Pawns
        for (int i = 0; i < 8; i++) {
            squares[1][i].setPiece(new Pawn(true)); // White Pawns
            squares[6][i].setPiece(new Pawn(false)); // Black Pawns
        }
    
        // Place other pieces (Rooks, Knights, Bishops, Queen, King)
        // Example: squares[0][0].setPiece(new Rook(true)); // White Rook
        // Repeat for other pieces and the black side
    }    

}
