package homework;

public class Jump implements Strategy{
    private Checker checker;

    public Jump(Checker checker){
        this.checker = checker;
    }

    public Jump Left(){
        checker.setX( checker.getX() - 2 );
        System.out.print(checker.printLocation());

        return this;
    }

    public Jump LeftUp(){
        checker.setX( checker.getX() - 2 );
        checker.setY( checker.getY() + 2 );
        System.out.print(checker.printLocation());
        return this;
    }

    public Jump LeftDown(){
        checker.setY( checker.getY() - 2 );
        System.out.print(checker.printLocation());

        return this;
    }


    public Jump Right(){
        checker.setX( checker.getX() + 2 );
        System.out.print(checker.printLocation());

        return this;
    }

    public Jump RightUp(){
        checker.setY( checker.getY() + 2 );
        System.out.println(checker.printLocation());
        return this;
    }

    public Jump DownRight(){
        checker.setX( checker.getX() + 2 );
        checker.setY( checker.getY() - 2 );
        System.out.print(checker.printLocation());
        return this;
    }
}
