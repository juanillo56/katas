package katas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

    private GameOfLife game;

    private Board initialBoard;

    @Before
    public void setUp() {
        game = new GameOfLife();
        initialBoard = new Board();
    }

    @Test
    public void cuandoUnaCelulaVivaTieneDosVecinosVivos_depuesDeNextMoveDebeVivir() throws Exception {
        initialBoard.setLiveCell(0, 0);
        initialBoard.setLiveCell(0, 1);
        initialBoard.setLiveCell(1, 0);
        game.setInitialBoard(initialBoard);
        game.nextMove();
        Board board = game.getBoard();
        Assert.assertTrue(board.isLiveCell(0, 0));
    }

    @Test
    public void cuandoUnaCelulaVivaNoTieneVecinosVivos_despuesDeBextMoveDebeMorir() throws Exception {
        initialBoard.setLiveCell(0, 0);
        game.setInitialBoard(initialBoard);
        game.nextMove();
        Board board = game.getBoard();
        Assert.assertFalse(board.isLiveCell(0, 0));
    }

    @Test
    public void cuandUnaCelulaVivaTieneMasDeTresVecinosVivos_despuesDeNextMoveDebeMorir() throws Exception {
        initialBoard.setLiveCell(1, 1);
        initialBoard.setLiveCell(0, 0);
        initialBoard.setLiveCell(0, 1);
        initialBoard.setLiveCell(1, 0);
        initialBoard.setLiveCell(2, 0);
        game.setInitialBoard(initialBoard);
        game.nextMove();
        Board board = game.getBoard();
        Assert.assertFalse(board.isLiveCell(1, 1));

    }

}
