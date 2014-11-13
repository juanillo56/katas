package katas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

    private GameOfLife game;

    @Before
    public void setUp() {
        game = new GameOfLife();
    }

    @Test
    public void whenNoMakeNextMove_theRetrieveBoardMustBeTheSame() throws Exception {
        Board initialBoard = new Board();
        game.setInitialBoard(initialBoard);
        Board board = game.getBoard();
        Assert.assertEquals(board, initialBoard);
    }

    @Test
    public void whenMakeNextMove_theRetrieveBoardMustNoBeTheSame() throws Exception {
        Board initialBoard = new Board();
        game.setInitialBoard(initialBoard);
        game.nextMove();
        Board board = game.getBoard();
        Assert.assertNotEquals(board, initialBoard);
    }

    @Test
    public void cuandoUnaCelulaVivaTieneDosVecinosVivos_depuesDeNextMoveDebeVivir() throws Exception {
        Board initialBoard = new Board();
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
        Board initialBoard = new Board();
        initialBoard.setLiveCell(0, 0);
        game.setInitialBoard(initialBoard);
        game.nextMove();
        Board board = game.getBoard();
        Assert.assertFalse(board.isLiveCell(0, 0));
    }

    @Test
    public void cuandUnaCelulaVivaTieneMasDeTresVecinosVivos_despuesDeNextMoveDebeMorir() throws Exception {

    }

}
