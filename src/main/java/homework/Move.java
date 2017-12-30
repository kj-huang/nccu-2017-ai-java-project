package homework;

public class Move {

    private Checker checker;

    public Move(Checker checker){
        this.checker = checker;
    }

    public void Left(){
        checker.setX( checker.getX() - 1 );
        System.out.println(checker.printLocation());
    }

    public void LeftUp(){
        checker.setX( checker.getX() - 1 );
        checker.setY( checker.getY() + 1 );
        System.out.println(checker.printLocation());
    }

    public void LeftDown(){
        checker.setY( checker.getY() - 1 );
        System.out.println(checker.printLocation());
    }


    public void Right(){
        checker.setX( checker.getX() + 1 );
        System.out.println(checker.printLocation());
    }

    public void RightUp(){
        checker.setY( checker.getY() + 1 );
        System.out.println(checker.printLocation());
    }

    public void DownRight(){
        checker.setX( checker.getX() + 1 );
        checker.setY( checker.getY() - 1 );
        System.out.println(checker.printLocation());
    }
}
