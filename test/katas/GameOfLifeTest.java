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
    public void givenAInitialBoard_mustMakeNextMove() throws Exception {
        game.setInitialBoard(new Board());
        game.nextMove();
    }

    @Test
    public void whenNoMakeNextMove_theRetrieveBoardMustBeTheSame() throws Exception {
        Board initialBoard = new Board();
        game.setInitialBoard(initialBoard);
        Board board = game.getBoard();
        Assert.assertEquals(board, initialBoard);
    }

}
