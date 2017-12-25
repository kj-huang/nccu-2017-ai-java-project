package homework;

public class MoveStrategy {

    private Checker checker;

    public MoveStrategy(Checker c){
        this.checker = c;
    }

    public void Left(){
        checker.setX( checker.getX() - 1 );
    }

    public void LeftUp(){
        checker.setX( checker.getX() - 1 );
        checker.setY( checker.getY() + 1 );
    }

    public void LeftDown(){
        checker.setY( checker.getY() - 1 );
    }


    public void Right(){
        checker.setX( checker.getX() + 1 );
    }

    public void RightUp(){
        checker.setY( checker.getY() + 1 );
    }

    public void DownRight(){
        checker.setX( checker.getX() + 1 );
        checker.setY( checker.getY() - 1 );
    }

    public void printLog(){

    }
}
