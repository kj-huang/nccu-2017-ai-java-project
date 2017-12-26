package homework.BoardTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {BoardWithValidCoordinateTest.class, BoardAddCheckersTest.class, BoardUtilityTest.class})
public class BoardTestSuite {
}
