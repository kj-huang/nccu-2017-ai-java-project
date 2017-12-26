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
                {true, 0, 0},
                {true, 1, 1},
                {true, 5, -1},
                {true, 2, 2},
                {true, 3, 1}
        });
    }

    private int x;
    private int y;
    private boolean expected;

    public BoardAddCheckersTest(boolean expected, int x, int y) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        b.addChecker(x, y);
        Assert.assertEquals(expected, b.checkerExistAt(x,y));
    }

    @After
    public void TearDown() {
        b = null;
    }
}