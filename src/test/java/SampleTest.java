import org.junit.Assert;
import org.junit.Test;

import homework.Sample;

public class SampleTest {
    @Test
    public void ItShouldGetHelloWorld(){
        Sample s = new Sample("Hello World");

        Assert.assertEquals("Hello World", s.getText());
    }
}
