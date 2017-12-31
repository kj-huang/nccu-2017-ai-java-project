package homework;

public class Hfunction {

    private Checker newchecker = new Checker(x,y);
    private Board board;

    Hfunction(Board board) {
        this.board = board;

        for (Checker checker:checkers) {
            for(Point point: terminalPoints){
                if(checker.getY() == point.getY() && checker.getX() == point.getX())

            }
        }

        board.getCheckerFromLocation();
    }

    public void selectedJump(){
        board.getCheckerFromLocation(0,0);
    }

    public ArrayList getPath()
    {
        return _path;
    }


}
