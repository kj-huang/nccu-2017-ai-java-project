package homework.BoardTestSuite;


import homework.Board;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BoardWithValidCoordinateTest {
    private Board b;

    @Before
    public void initialize(){
        b = new Board();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { -8, 4, true },
                { -7, 3, true },
                { 0, 2, true },
                { 1, 0, true },
                { -8, 5, false },
                { 8, 3, false },
                { -5, 0, false },
                { 8, -3, false },
                {0,3, true}
        });
    }

    private int x;
    private int y;
    private boolean expected;

    public BoardWithValidCoordinateTest(int x, int y, boolean expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, b.isValidateCoordinate(x,y));
    }

    @After
    public void cleanUp() {
        b = null;
    }
}
