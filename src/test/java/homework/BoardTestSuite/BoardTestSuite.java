package homework.BoardTestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {BoardUtilityTest.class, BoardWithValidCoordinateTest.class, BoardAddCheckersTest.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardTestSuite {
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Board Test Setup");

    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Board Test TearDown");
    }
}
