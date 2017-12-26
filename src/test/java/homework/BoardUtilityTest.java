package homework;

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

    @Test
    public void ItShouldResetBoard(){
        board.fillHome();
        board.resetBoard();
        Assert.assertEquals(false,board.checkerExistAt(2,-5));
        Assert.assertEquals(false,board.checkerExistAt(4,-8));
    }

    @Test
    public void ItShouldUpdatedBoard(){
        board.fillHome();
        board.getCheckerFromLocation(0,-4).move().RightUp();
        board.updatedBoard();

        Assert.assertEquals(true,board.checkerExistAt(0,-3));
        Assert.assertEquals(false,board.checkerExistAt(0,-4));
    }
}
