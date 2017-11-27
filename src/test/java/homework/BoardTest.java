package homework;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    private Board b;

    @Before
    public void initialize(){
        b = new Board();
    }

    @Test
    public void ItShouldPutCheckersOnTheBoard(){
        b.putChecker(Color.GREEN, 1,1);
        Assert.assertEquals(Color.GREEN , b.get(1,1));
    }

    @Test
    public void GetGreenColorAtCoordinateMinus84(){
        Assert.assertEquals(Color.GREEN , b.get(-8,4));
    }

    @Test
    public void GetRedColorAtCoordinate(){
        Assert.assertEquals(Color.RED , b.get(-4,-4));
    }

    @Test
    public void GetYellowColorAtCoordinate(){
        Assert.assertEquals(Color.YELLOW , b.get(-4,8));
    }

//    @Test
//    public void ItShouldTranslateCoordinate88Into00(){
//        Board b = new Board();
//        Assert.assertEquals(0, b.translateNewXCoordinate(8));
//        Assert.assertEquals(0, b.translateNewYCoordinate(8));
//    }



//    @Test
//    public void ItShouldReturnTrueWithValidateCoordinate(){
//        Board b = new Board();
//
//        Assert.assertEquals(true, b.validCoordinate(1,2));
//        Assert.assertEquals(true, b.validCoordinate(0,0));
//        Assert.assertEquals(true, b.validCoordinate(1,2));
//        Assert.assertEquals(true, b.validCoordinate(1,2));
//        Assert.assertEquals(true, b.validCoordinate(1,2));
//    }

//    @Test
//    public void ItShouldReturnFalseWithNonValidateCooradinate(){
//
//    }
//
//    @Test
//    public void ItShouldHave(){
//
//    }
//
//    @Test
//    public void ItShouldPutCheckersOntoTheBoard(){
//
//    }
}
