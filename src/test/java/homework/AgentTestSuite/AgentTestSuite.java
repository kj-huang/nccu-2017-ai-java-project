package homework.AgentTestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {AgentTest.class})
public class AgentTestSuite {
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Agent Test Setup");

    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Agent Test TearDown");
    }
}
