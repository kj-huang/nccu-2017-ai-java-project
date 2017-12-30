package homework;

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
        board.cleanUpBoard();
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

    @Test
    public void ItShouldGetGreenAreaWith15Points(){
        board.setGreenAreaAsDestination();

        Assert.assertEquals(15, board.getTerminalPointsCount());
    }



    @Test
    public void ItShouldGetGreenAreaPointsWithSomePointParameter(){
        board.setGreenAreaAsDestination();

        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldGetYellowAreaWith15Points(){
        board.setYellowAreaAsDestination();

        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldGetRedAreaWith15Points(){
        board.setRedAreaAsDestination();

        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldNotGet30PointsWithTwoSameCallOnSetDestination(){
        board.setRedAreaAsDestination();
        board.setRedAreaAsDestination();

        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldNotGet30PointsWithTwoDifferentCallOnSetDestination(){
        board.setRedAreaAsDestination();
        board.setYellowAreaAsDestination();

        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldReturnFalseWithNoAllCheckersAtTerminal(){
        board.setRedAreaAsDestination();
        board.addChecker(0,0).addChecker(1,3).addChecker(4,4);;

        Assert.assertEquals(false, board.isFillWithTargetArea());
    }

    @Test
    public void ItShouldReturnTrueWithAllCheckersAtTerminal(){
        board.setRedAreaAsDestination();
        board.addChecker(0,4).addChecker(1,3).addChecker(4,4);

        Assert.assertEquals(true, board.isFillWithTargetArea());
    }
}
