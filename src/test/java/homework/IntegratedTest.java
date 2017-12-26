package homework;

import homework.Board;
import homework.Checker;
import org.junit.*;
import java.util.ArrayList;

public class IntegratedTest {
    private Board board;
    private  ArrayList<Checker> checkers;
    @Before
    public void initialize(){
       board = new Board();
       checkers = new ArrayList<Checker>();
    }

    @Test
    public void ItShouldMoveCheckerFrom00to10 (){
        Checker c = board.addChecker(0,0).getCheckerFromLocation(0,0 );
        c.move().Right();
        board.updatedBoard();

        Assert.assertEquals(true,board.checkerExistAt(1,0));
    }

    @Test
    public void ItShouldJumpCheckerFrom00to20WithOneCheckerAt10 (){


        checkers.add(board.addChecker(0,0).getCheckerFromLocation(0,0 ));
        checkers.add(board.addChecker(1,0).getCheckerFromLocation(1,0 ));
        checkers.get(0).jump().Right();
        board.updatedBoard();

        Assert.assertEquals(true,board.checkerExistAt(2,0));

    }

    @Test
    public void ItShouldJumpCheckerFrom00to2Negative2WithTwoCheckersAt10And2Negative1 (){
        checkers.add(board.addChecker(0,0).getCheckerFromLocation(0,0 ));
        checkers.add(board.addChecker(1,0).getCheckerFromLocation(1,0 ));
        checkers.add(board.addChecker(2,-1).getCheckerFromLocation(1,0 ));

        checkers.get(0).jump().Right().LeftDown();
        board.updatedBoard();

        Assert.assertEquals(true,board.checkerExistAt(2,-2));
    }

//    @Test
//    public void ItShouldMoveOneCheckerFromTo(){
//
//    }
//
//    @Test
//    public void ItShouldMoveTwoCheckersFromTo(){
//
//    }

    @After
    public void cleanUp(){
        board = null;
        checkers.clear();
    }
}
