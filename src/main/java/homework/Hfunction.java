package homework;

public class Hfunction {

    private Checker newchecker = new Checker(x,y);
    private ArrayList<Path> ;
    private Board board;

    Hfunction(Board board) {
        this.board = board;
        board.getCheckerFromLocation();
        board.getCheckers();
        //取得15個 checkers 的 x,y 並且new checkers
        for (Checker checker:checkers) {
//            for(Point point: terminalPoints){
//                if(checker.getY() == point.getY() && checker.getX() == point.getX()){
//
//                }



        }

    }

    public ArrayList getPath()
    {
        return path;
    }


}
