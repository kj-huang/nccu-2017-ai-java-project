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
public class BoardAddCheckersTest {
    private Board b;

    @Before
    public void initialize(){
        b = new Board();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 0, 0},
                {1, 1, 1},
                {1, 5, -1},
                {1, 2, 2},
                {1, 3, 1}
        });
    }

    private int x;
    private int y;
    private int expected;

    public BoardAddCheckersTest(int expected, int x, int y) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        b.putChecker(x, y);
        Assert.assertEquals(expected, b.get(x,y));
    }

    @After
    public void TearDown() {
        b = null;
    }
}