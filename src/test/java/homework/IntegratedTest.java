package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class IntegratedTest {
    private Board board;
    private Strategy move;
    private ArrayList<Checker> checkers;

    @Before
    public void initialize(){
       board = new Board();
       checkers = new ArrayList<Checker>();
    }

    @Test
    public void ItShouldMoveCheckerFrom00to10 (){
        checkers.add(board.addChecker(0,0).getCheckerFromLocation(0,0 ));
        checkers.get(0).move().Right();

        Assert.assertEquals(1, checkers.get(0).getX());
        Assert.assertEquals(0, checkers.get(0).getY());
    }

    @Test
    public void ItShouldJumpCheckerFrom00to20WithOneCheckerAt10 (){
        checkers.add(board.addChecker(0,0).getCheckerFromLocation(0,0 ));
        checkers.add(board.addChecker(1,0).getCheckerFromLocation(1,0 ));
        checkers.get(0).jump().Right();

        Assert.assertEquals(2, checkers.get(0).getX());
        Assert.assertEquals(0, checkers.get(0).getY());
    }

    @Test
    public void ItShouldJumpCheckerFrom00to2Negative2WithTwoCheckersAt10And2Negative1 (){
        checkers.add(board.addChecker(0,0).getCheckerFromLocation(0,0 ));
        checkers.add(board.addChecker(1,0).getCheckerFromLocation(1,0 ));
        checkers.add(board.addChecker(2,-1).getCheckerFromLocation(1,0 ));
        checkers.get(0).jump().Right().LeftDown();

        Assert.assertEquals(2, checkers.get(0).getX());
        Assert.assertEquals(-2, checkers.get(0).getY());
    }
}
