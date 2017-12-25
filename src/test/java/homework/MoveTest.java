package homework;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveTest {

    private Checker c;
    private MoveStrategy moveStrategy;

    @Before
    public void initialize(){
        c = new Checker(0,0);
        moveStrategy = new MoveStrategy(c);
    }

    @Test
    public void MoveRightUp(){
        moveStrategy.RightUp();

        Assert.assertEquals(0, c.getX());
        Assert.assertEquals(1, c.getY());
    }

    @Test
    public void MoveLeftUp(){
        moveStrategy.LeftUp();

        Assert.assertEquals(-1, c.getX());
        Assert.assertEquals(1, c.getY());
    }

    @Test
    public void MoveLeft(){
        moveStrategy.Left();

        Assert.assertEquals(-1, c.getX());
        Assert.assertEquals(0, c.getY());
    }

    @Test
    public void MoveRight(){
        moveStrategy.Right();

        Assert.assertEquals(1, c.getX());
        Assert.assertEquals(0, c.getY());
    }

    @Test
    public void MoveLeftDown(){
        moveStrategy.LeftDown();

        Assert.assertEquals(0, c.getX());
        Assert.assertEquals(-1, c.getY());
    }

    @Test
    public void MoveRightDown(){
        moveStrategy.DownRight();

        Assert.assertEquals(1, c.getX());
        Assert.assertEquals(-1, c.getY());
    }
}
