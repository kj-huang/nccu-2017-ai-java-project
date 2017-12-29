package homework;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void ItShouldGetPointData(){
        Point p = new Point(1,3);

        Assert.assertEquals(1,p.getX());
        Assert.assertEquals(3,p.getY());
    }
}
