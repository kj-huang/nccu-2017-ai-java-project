package homework;

import java.util.ArrayList;

public class Hfunction {
    private Board board;

    public ArrayList<CheckerPath> ppaths;

    public Hfunction() {
        board = new Board();

        Checker cc = board.getCheckers();
        board.checkJump(cc);
        board.checkMove(cc);
        ppaths = new ArrayList<CheckerPath>();

    }

}
