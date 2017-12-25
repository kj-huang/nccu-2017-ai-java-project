package homework;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveTest {

    private Checker c;
    private Move move;

    @Before
    public void initialize(){
        c = new Checker(0,0);
        move = new Move(c);
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
}
