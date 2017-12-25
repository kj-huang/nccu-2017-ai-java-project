package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegratedTest {
    private Board board;
    private MoveStrategy moveStrategy;
    private Checker checker;

    @Before
    public void initialize(){
       board = new Board();
    }

    @Test
    public void ItShouldMoveCheckerFrom00to10 (){
        checker = board.addChecker(0,0).getCheckerFromLocation(0,0 );
        checker.move().Right();

        Assert.assertEquals(1, checker.getX());
        Assert.assertEquals(0, checker.getY());
    }
}
