package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BoardAddCheckersTest {
    private Board b;

    @Before
    public void initialize(){
        b = new Board();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {Color.DEFAULT, 0, 0},
                {Color.DEFAULT, 1, 1},
                {Color.DEFAULT, 5, -1},
                {Color.DEFAULT, 2, 2},
                {Color.DEFAULT, 3, 1}
        });
    }

    private int x;
    private int y;
    private Color expected;

    public BoardAddCheckersTest(Color expected, int x, int y) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        b.putChecker(expected, x, y);
        Assert.assertEquals(expected, b.get(x,y));
    }
}