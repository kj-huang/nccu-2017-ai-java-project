package homework;

import org.junit.*;


public class BoardUtilityTest {
    private Board board;

    @Before
    public void initialize(){
        board = new Board();
    }

    @Test
    public void ItShouldGet15CheckersIfFillHome(){
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
        board.addChecker(0,4).addChecker(1,3).addChecker(4,4);

        board.getCheckerFromLocation(0,4).setX(0);
        board.getCheckerFromLocation(0,4).setY(0);
        board.updatedBoard();

        Assert.assertEquals(false, board.isFillWithTargetArea());
    }

    @Test
    public void ItShouldReturnTrueWithAllCheckersAtTerminal(){
        board.setRedAreaAsDestination();
        board.addChecker(0,-4).addChecker(-1,-3).addChecker(-4,-4);

        Assert.assertEquals(true, board.isFillWithTargetArea());
    }

    @Test
    public void ItShouldReturnTrueWithAllPointsAtMiddleArea(){
        Assert.assertEquals(true, board.isMiddleArea(0,0));
        Assert.assertEquals(true, board.isMiddleArea(-3,0));
        Assert.assertEquals(true, board.isMiddleArea(2,1));
        Assert.assertEquals(true, board.isMiddleArea(1,2));
        Assert.assertEquals(true, board.isMiddleArea(0,-3));
        Assert.assertEquals(true, board.isMiddleArea(3,-3));
        Assert.assertEquals(true, board.isMiddleArea(0,3));
        Assert.assertEquals(true, board.isMiddleArea(-3,3));
    }

    @Test
    public void ItShouldReturnFalseWithAllPointsNotAtMiddleArea(){
        Assert.assertEquals(false, board.isMiddleArea(4,1));
        Assert.assertEquals(false, board.isMiddleArea(-1,-3));
        Assert.assertEquals(false, board.isMiddleArea(1,4));
        Assert.assertEquals(false, board.isMiddleArea(4,0));
        Assert.assertEquals(false, board.isMiddleArea(4,-4));
        Assert.assertEquals(false, board.isMiddleArea(0,-4));
        Assert.assertEquals(false, board.isMiddleArea(1,3));
        Assert.assertEquals(false, board.isMiddleArea(-4,8));
    }

    @Test
    public void ItShouldGetTwoCheckersAndOneObstacleCheckers(){
        board.addChecker(0,0).addChecker(1,3).addChecker(4,4);

        Assert.assertEquals(2, board.getRemainCheckersSku());
        Assert.assertEquals(1, board.getObstacleCheckersSku());
    }

    @After
    public void tearDown(){
        board.cleanUpBoard();
        board.destroyAllObjectsOnTheBoard();
    }
}
