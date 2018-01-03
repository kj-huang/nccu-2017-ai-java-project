package homework;

import java.util.ArrayList;

public class FunctionH {
    private Board board;

    private ArrayList<Checker> c;
    private ArrayList<CheckerPath> p;
    private ArrayList<Point> points;

    public FunctionH() {
        board = new Board();
        c = new ArrayList<Checker>();
        p = new ArrayList<CheckerPath>();
        points = new ArrayList<Point>();

        c = board.getAllRemainCheckersNotAtTerminalPoints();
        points = board.getAllCheckersLocation();

    }

    public void addPath(int x, int y) {
        p.add(new CheckerPath(x, y));
    }

    public boolean checkPath(int x, int y) {
//        for (CheckerPath CP : p) {
//            if (x == CP.getX() && y == CP.getY())
//                return false;
//        }
        return true;
    }
}