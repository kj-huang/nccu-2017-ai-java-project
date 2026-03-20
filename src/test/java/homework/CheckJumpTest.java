package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CheckJumpTest {

    private Board board;

    @Before
    public void initialize() {
        board = new Board();
    }

    @Test
    public void jumpRightShouldLandAtXPlus2() {
        // Place checker at origin and an obstacle at (1,0) to enable right jump
        board.addChecker(0, -4);
        board.addChecker(1, -4);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        // Should have a child at (2, -4) — the jump destination
        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 2 && child.getData().getY() == -4) {
                found = true;
            }
        }
        Assert.assertTrue("Right jump should land at (x+2, y)", found);
    }

    @Test
    public void jumpRightShouldNotLandAtOrigin() {
        board.addChecker(0, -4);
        board.addChecker(1, -4);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        // Should NOT have a child at (0, -4) — that's the starting position (the old bug)
        boolean foundOrigin = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 0 && child.getData().getY() == -4) {
                foundOrigin = true;
            }
        }
        Assert.assertFalse("Right jump should not produce the origin point as destination", foundOrigin);
    }

    @Test
    public void jumpLeftShouldLandAtXMinus2() {
        board.addChecker(2, -4);
        board.addChecker(1, -4);

        Checker checker = board.getCheckerFromLocation(2, -4);
        Node<Point> result = board.checkJump(checker, null);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 0 && child.getData().getY() == -4) {
                found = true;
            }
        }
        Assert.assertTrue("Left jump should land at (x-2, y)", found);
    }

    @Test
    public void jumpLeftUpShouldLandCorrectly() {
        board.addChecker(0, -4);
        board.addChecker(-1, -3);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == -2 && child.getData().getY() == -2) {
                found = true;
            }
        }
        Assert.assertTrue("LeftUp jump should land at (x-2, y+2)", found);
    }

    @Test
    public void jumpDownRightShouldLandCorrectly() {
        board.addChecker(0, -4);
        board.addChecker(1, -5);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 2 && child.getData().getY() == -6) {
                found = true;
            }
        }
        Assert.assertTrue("DownRight jump should land at (x+2, y-2)", found);
    }

    @Test
    public void jumpUpShouldLandCorrectly() {
        board.addChecker(0, -4);
        board.addChecker(0, -3);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 0 && child.getData().getY() == -2) {
                found = true;
            }
        }
        Assert.assertTrue("Up jump should land at (x, y+2)", found);
    }

    @Test
    public void jumpDownShouldLandCorrectly() {
        board.addChecker(2, -4);
        board.addChecker(2, -5);

        Checker checker = board.getCheckerFromLocation(2, -4);
        Node<Point> result = board.checkJump(checker, null);

        boolean found = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 2 && child.getData().getY() == -6) {
                found = true;
            }
        }
        Assert.assertTrue("Down jump should land at (x, y-2)", found);
    }

    @Test
    public void noJumpWhenNoAdjacentChecker() {
        board.addChecker(0, -4);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        Assert.assertEquals("No jumps should be available with no adjacent checkers", 0, result.getChildren().size());
    }

    @Test
    public void noJumpWhenLandingSpotOccupied() {
        board.addChecker(0, -4);
        board.addChecker(1, -4);
        board.addChecker(2, -4);

        Checker checker = board.getCheckerFromLocation(0, -4);
        Node<Point> result = board.checkJump(checker, null);

        // Right jump blocked because (2,-4) is occupied
        boolean foundRightJump = false;
        for (Node<Point> child : result.getChildren()) {
            if (child.getData().getX() == 2 && child.getData().getY() == -4) {
                foundRightJump = true;
            }
        }
        Assert.assertFalse("Jump should be blocked when landing spot is occupied", foundRightJump);
    }

    @After
    public void tearDown() {
        board.cleanUpBoard();
        board.destroyAllObjectsOnTheBoard();
    }
}
