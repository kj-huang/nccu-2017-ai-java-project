package homework.AgentTestSuite;

import homework.BoardTestSuite.BoardAddCheckersTest;
import homework.BoardTestSuite.BoardUtilityTest;
import homework.BoardTestSuite.BoardWithValidCoordinateTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {AgentTest.class})
public class AgentTestSuite {
}
