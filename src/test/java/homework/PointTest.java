package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

    private Point p;

    @Before
    public void initialize(){
        p = new Point(Color.GREEN, 8,8, false);
    }

    @Test
    public void GetColorGreen(){
        Assert.assertEquals(Color.GREEN, p.getColor());
    }

    @Test
    public void GetPointXEqualToEight(){
        Assert.assertEquals(8, p.getX());
    }

    @Test
    public void GetPointYEqualToEight(){
        Assert.assertEquals(8, p.getY());
    }

    @Test
    public void PointShouldBeOccupied(){
        Assert.assertEquals( false, p.canBeFill());
    }
}
