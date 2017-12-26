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
public class BoardInitializeTest {
    private Board b;

    @Before
    public void initialize(){
        b = new Board();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { -8, 4, 0 },
                { -7, 3, 0 },
                { 0, 2, 0 },
                { 1, 0, 0 },
                { -8, 5, -1 },
                { 8, 3, -1 },
                { -5, 0, -1 },
                { 8, -3, -1 },
                {0,3, 0}
        });
    }

    private int x;
    private int y;
    private int expected;

    public BoardInitializeTest(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, b.getChecker(x,y));
    }

    @After
    public void deleteOutputFile() {
        b = null;
    }
}
