package homework;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

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
                { -8, 4, Color.GREEN },
                { -7, 3, Color.GREEN },
                { -5, 2, Color.GREEN },
                { 8, -4, Color.GREEN },
                { 6, -2, Color.GREEN },
                { 5, -1, Color.GREEN },
                { -4, 8, Color.YELLOW },
                { -2, 5, Color.YELLOW },
                { -3, 7, Color.YELLOW },
                { 4, -8, Color.YELLOW },
                { 4, -7, Color.YELLOW },
                { 1, -5, Color.YELLOW },
                { -4, -4, Color.RED },
                { -1, -3, Color.RED },
                { -3, -3, Color.RED },
                { 4, 4, Color.RED },
                { 3, 3, Color.RED },
                { 2, 2, Color.RED },
                {0,0, Color.NONE},
                {1,-1, Color.NONE},
                {3,-3, Color.NONE},
                {-1,1, Color.NONE},
                {-3,3, Color.NONE},
                {-2,1, Color.NONE},
                {-1,-1, Color.NONE},
                {-2,-1, Color.NONE},
                {-3,0, Color.NONE},
                {1,1, Color.NONE},
                {2,1, Color.NONE},
                {0,3, Color.NONE}
        });
    }

    private int x;
    private int y;
    private Color expected;

    public BoardInitializeTest(int x, int y, Color expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, b.get(x,y));
    }
}
