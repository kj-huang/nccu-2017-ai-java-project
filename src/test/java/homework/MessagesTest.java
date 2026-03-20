package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class MessagesTest {

    @Before
    public void setUp() {
        Messages.setLocale(Locale.ENGLISH);
    }

    @Test
    public void englishLocaleShouldReturnEnglishStrings() {
        Messages.setLocale(Locale.ENGLISH);
        Assert.assertEquals("Start", Messages.get("game.start"));
        Assert.assertEquals("Read Board", Messages.get("game.readBoard"));
        Assert.assertEquals("Select Checkers", Messages.get("game.selectCheckers"));
        Assert.assertEquals("You already start a game", Messages.get("game.alreadyStarted"));
        Assert.assertEquals("You already finished a game", Messages.get("game.alreadyFinished"));
    }

    @Test
    public void traditionalChineseLocaleShouldReturnChineseStrings() {
        Messages.setLocale(Locale.TRADITIONAL_CHINESE);
        Assert.assertEquals("\u958b\u59cb", Messages.get("game.start"));
        Assert.assertEquals("\u8b80\u53d6\u68cb\u76e4", Messages.get("game.readBoard"));
        Assert.assertEquals("\u9078\u64c7\u68cb\u5b50", Messages.get("game.selectCheckers"));
        Assert.assertEquals("\u904a\u6232\u5df2\u7d93\u958b\u59cb", Messages.get("game.alreadyStarted"));
        Assert.assertEquals("\u904a\u6232\u5df2\u7d93\u7d50\u675f", Messages.get("game.alreadyFinished"));
    }

    @Test
    public void switchingLocaleShouldChangeMessages() {
        Messages.setLocale(Locale.ENGLISH);
        String english = Messages.get("game.start");

        Messages.setLocale(Locale.TRADITIONAL_CHINESE);
        String chinese = Messages.get("game.start");

        Assert.assertNotEquals("English and Chinese should differ", english, chinese);
        Assert.assertEquals("Start", english);
        Assert.assertEquals("\u958b\u59cb", chinese);
    }

    @Test
    public void getLocaleShouldReturnCurrentLocale() {
        Messages.setLocale(Locale.ENGLISH);
        Assert.assertEquals(Locale.ENGLISH, Messages.getLocale());

        Messages.setLocale(Locale.TRADITIONAL_CHINESE);
        Assert.assertEquals(Locale.TRADITIONAL_CHINESE, Messages.getLocale());
    }

    @After
    public void tearDown() {
        Messages.setLocale(Locale.ENGLISH);
    }
}
