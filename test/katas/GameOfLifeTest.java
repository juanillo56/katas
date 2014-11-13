package katas;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeTest {

    @Test
    public void creationTest() throws Exception {
        GameOfLife game = new GameOfLife();
        Assert.assertTrue(game != null);
    }

    @Test
    public void givenAInitialBoard_mustMakeNextMove() throws Exception {
        GameOfLife game = new GameOfLife();
        game.setInitialBoard(new Board());
        game.nextMove();
    }

}
