package homework.BoardTestSuite;

import homework.Board;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class BoardUtilityTest {
    private Board board;

    @Before
    public void initialize(){
        board = new Board();
    }

    @Ignore("Test Will affect with Board Test")
    @Test
    public void ItShouldGet15CheckersIfFillHome(){
        //TODO fix the test
        board.fillHome();
        Assert.assertEquals(15,board.getRemainCheckersSku());
    }

    @Test
    public void ItShouldGetWhenCheckersFillHome(){
        board.fillHome();
        Assert.assertEquals(true,board.checkerExistAt(2,-5));
    }
}
