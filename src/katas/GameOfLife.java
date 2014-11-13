package katas;

public class GameOfLife {

    private Board board;

    public void setInitialBoard(Board board) {
        this.board = board;

    }

    public void nextMove() {
        final Board transitiveBoard = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]) {

                }
            }
        }

    }

    public Board getBoard() {
        return this.board;
    }

}
