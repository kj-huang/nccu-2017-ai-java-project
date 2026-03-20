package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckMoveTest {

    private Board board;

    @Before
    public void initialize() {
        board = new Board();
    }

    @Test
    public void moveRightShouldBeAtXPlus1() {
        board.addChecker(-2, 4);

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -1 && child.getData().getY() == 4) {
                found = true;
            }
        }
        Assert.assertTrue("Right move should produce (x+1, y)", found);
    }

    @Test
    public void moveLeftShouldBeAtXMinus1() {
        board.addChecker(-2, 4);

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -3 && child.getData().getY() == 4) {
                found = true;
            }
        }
        Assert.assertTrue("Left move should produce (x-1, y)", found);
    }

    @Test
    public void moveLeftUpShouldBeCorrect() {
        board.addChecker(-2, 4);

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -3 && child.getData().getY() == 5) {
                found = true;
            }
        }
        Assert.assertTrue("LeftUp move should produce (x-1, y+1)", found);
    }

    @Test
    public void moveDownRightShouldBeCorrect() {
        board.addChecker(-2, 4);

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -1 && child.getData().getY() == 3) {
                found = true;
            }
        }
        Assert.assertTrue("DownRight move should produce (x+1, y-1)", found);
    }

    @Test
    public void moveUpShouldBeCorrect() {
        board.addChecker(-2, 4);

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -2 && child.getData().getY() == 5) {
                found = true;
            }
        }
        Assert.assertTrue("Up move should produce (x, y+1)", found);
    }

    @Test
    public void moveDownShouldBeCorrect() {
        board.addChecker(-2, 4);

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -2 && child.getData().getY() == 3) {
                found = true;
            }
        }
        Assert.assertTrue("Down move should produce (x, y-1)", found);
    }

    @Test
    public void blockedDirectionShouldNotAppear() {
        board.addChecker(-2, 4);
        board.addChecker(-1, 4); // blocks right direction

        Checker checker = board.getCheckerFromLocation(-2, 4);
        Node<Point> result = board.checkMove(checker);

        boolean foundRight = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -1 && child.getData().getY() == 4) {
                foundRight = true;
            }
        }
        Assert.assertFalse("Blocked direction should not appear in moves", foundRight);
        Assert.assertEquals("Should have 5 moves when one direction is blocked", 5, result.getChildren().size());
    }

    @After
    public void tearDown() {
        board.cleanUpBoard();
        board.destroyAllObjectsOnTheBoard();
    }
}
