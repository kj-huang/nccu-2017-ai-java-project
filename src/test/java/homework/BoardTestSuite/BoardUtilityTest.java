package homework.BoardTestSuite;

import homework.Board;
import org.junit.Assert;
import org.junit.Test;

public class BoardUtilityTest {
    @Test
    public void ItShouldGet15CheckersFillHome(){
        Board board = new Board();

        board.fillHome();

        Assert.assertEquals(15,board.getRemainCheckersSku());
    }

    @Test
    public void ItShouldGetWhenCheckersFillHome(){
        Board board = new Board();

        board.fillHome();

        Assert.assertEquals(true,board.checkerExistAt(2,-5));
    }
}
