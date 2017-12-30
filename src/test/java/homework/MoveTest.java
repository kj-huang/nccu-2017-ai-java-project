package homework;


import homework.Move;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import homework.Checker;


public class MoveTest {

    private Checker c;
    private Move move;

    @Before
    public void initialize(){
        c = new Checker(0,0);
        move = new Move(c);
        System.out.print("(" + c.getX() + "," + c.getY() + ");");
    }

    @Test
    public void MoveRightUp(){
        move.RightUp();

        Assert.assertEquals(0, c.getX());
        Assert.assertEquals(1, c.getY());
    }

    @Test
    public void MoveLeftUp(){
        move.LeftUp();

        Assert.assertEquals(-1, c.getX());
        Assert.assertEquals(1, c.getY());
    }

    @Test
    public void MoveLeft(){
        move.Left();

        Assert.assertEquals(-1, c.getX());
        Assert.assertEquals(0, c.getY());
    }

    @Test
    public void MoveRight(){
        move.Right();

        Assert.assertEquals(1, c.getX());
        Assert.assertEquals(0, c.getY());
    }

    @Test
    public void MoveLeftDown(){
        move.LeftDown();

        Assert.assertEquals(0, c.getX());
        Assert.assertEquals(-1, c.getY());
    }

    @Test
    public void MoveRightDown(){
        move.DownRight();

        Assert.assertEquals(1, c.getX());
        Assert.assertEquals(-1, c.getY());
    }

    @After
    public void cleanUp(){
        c = null;
        move = null;
    }
}
