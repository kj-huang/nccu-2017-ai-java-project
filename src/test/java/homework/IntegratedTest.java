package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegratedTest {
    private Board b;
    private Move move;
    private Checker c;

    @Before
    public void initialize(){
       b = new Board();
//       c = new Checker();
    }

    @Test
    public void ItShouldMoveCheckerFrom00to10 (){
        //Given
        b.putChecker(0,0);

        c = b.getCheckerLocation(0,0 );

        move = new Move( c );
        move.Right();

        Assert.assertEquals(1, c.getX());
        Assert.assertEquals(0, c.getY());
//        Assert.assertEquals();
    }
}
