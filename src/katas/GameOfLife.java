package katas;

public class GameOfLife {

    private Board board;

    public void setInitialBoard(Board board) {
        this.board = board;

    }

    public void nextMove() {
        this.board = new Board();
    }

    public Board getBoard() {
        return this.board;
    }

}
