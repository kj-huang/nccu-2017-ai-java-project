package homework.BoardTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {BoardInitializeTest.class, BoardAddCheckersTest.class})
public class BoardTestSuite {
}
