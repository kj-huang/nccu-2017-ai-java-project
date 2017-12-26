package homework.AlgorithmTestSuite;

import homework.Jump;
import homework.Move;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses(value = {Jump.class, Move.class})
public class AlgorithmTestSuite {
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Algorithm Test Setup");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Algorithm Test TearDown");
    }
}
