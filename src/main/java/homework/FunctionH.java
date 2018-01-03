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

    public int hNumber(int x, int y){
        return -x+y;
    }


    public ArrayList<Point> getBestPathSolution() {
        ArrayList<ArrayList<Point>> lists = new ArrayList<ArrayList<Point>>();
        ArrayList<Point> paths;
        Node<Point> root = new Node<Point>(checker.getPoint());

        Node<Point> points =  board.checkMove(checker);

        ArrayList<Integer> hNumber = new ArrayList<Integer>();

        int h = 999;
        ArrayList<Point> bestMove = new ArrayList<Point>();
        for(Node<Point> node : points.getChildren()) {
            if(hNumber(node.getData().getX(),node.getData().getY()) < h){
                bestMove.clear();
                bestMove.add(node.getData().getPoint());
                h = hNumber(node.getData().getX(),node.getData().getY());
            }
        }




////        Integer min = 9999;
////        for(Integer h : hNumber) {
////            if(h < min)
////                min = h;
////        }
//
//
//        root.addChild(board.checkMove(checker));
//
////        lists.addAll(board.checkJump(checker));
//
//
//        ArrayList<Point> list = new ArrayList<Point>();
//        list.add(new Point(1,1));
        return bestMove;
    }
}