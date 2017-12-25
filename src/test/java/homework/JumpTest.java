package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JumpTest {

    private Checker c;
    private Jump jump;

    @Before
    public void initialize(){
        c = new Checker(0,0);
        jump = new Jump(c);
        System.out.print("(" + c.getX() + "," + c.getY() + ");");
    }

    @Test
    public void MoveRightUp(){
        jump.RightUp();

        Assert.assertEquals(0, c.getX());
        Assert.assertEquals(2, c.getY());
    }

    @Test
    public void MoveLeftUp(){
        jump.LeftUp();

        Assert.assertEquals(-2, c.getX());
        Assert.assertEquals(2, c.getY());
    }

    @Test
    public void MoveLeft(){
        jump.Left();

        Assert.assertEquals(-2, c.getX());
        Assert.assertEquals(0, c.getY());
    }

    @Test
    public void MoveRight(){
        jump.Right();

        Assert.assertEquals(2, c.getX());
        Assert.assertEquals(0, c.getY());
    }

    @Test
    public void MoveLeftDown(){
        jump.LeftDown();

        Assert.assertEquals(0, c.getX());
        Assert.assertEquals(-2, c.getY());
    }

    @Test
    public void MoveRightDown(){
        jump.DownRight();

        Assert.assertEquals(2, c.getX());
        Assert.assertEquals(-2, c.getY());
    }

}
