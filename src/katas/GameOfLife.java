package katas;

public class GameOfLife {

    private Board board;

    public void setInitialBoard(Board board) {
        this.board = board;

    }

    public void nextMove() {
        final Board transitiveBoard = new Board();
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board.isLiveCell(x, y)) {
                    int vacinosVivos = board.obtenerNumerDeVecinosVivos(x, y);
                    if (vacinosVivos == 2) {
                        transitiveBoard.setLiveCell(x, y);
                    }
                    if (vacinosVivos == 0) {
                        transitiveBoard.setDeadCell(x, y);
                    }
                    if (vacinosVivos > 3) {
                        transitiveBoard.setDeadCell(x, y);
                    }
                }
            }
        }
        this.board = transitiveBoard;
    }

    public Board getBoard() {
        return this.board;
    }

}
