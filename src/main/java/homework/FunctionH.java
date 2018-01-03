package homework;

import java.util.ArrayList;

public class FunctionH {
    private final Checker checker;
    private Board board;

    private ArrayList<CheckerPath> p;
    private ArrayList<Point> points;
    private ArrayList<ArrayList<CheckerPath>> list;

//    public FunctionH(Checker c) {
//        this.board;
//        p = new ArrayList<CheckerPath>();
//        points = new ArrayList<Point>();
//        list = new ArrayList<ArrayList<CheckerPath>>();
//
//        points = board.getAllCheckersLocation();
//
//    }

    public FunctionH(Board board, Checker checker) {
        this.board = board;
        this.checker = checker;
        list = new ArrayList<ArrayList<CheckerPath>>();
        points = board.getAllCheckersLocation();

//        newPath(checker);
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

    public int hNumber(){
        int h = 0;
        for (Point p: points) {
            int x = p.getX();
            int y = p.getY();
            h += -x+y;
        }
        return h;
    }


    public ArrayList<Point> getBestPathSolution() {

        int[] arrayCanMove = board.checkMove(checker);
        for(int i = 0; i < arrayCanMove.length; i++){

        }


//        for (arrayCanMove){
//            if(arrayCanMove[])
//        }




        ArrayList<Point> list = new ArrayList<Point>();
        list.add(new Point(1,1));
        return list;
    }
}