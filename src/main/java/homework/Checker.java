package homework;

public class Checker {

    private int x;
    private int y;
//    private Strategy strategy;

    public Checker(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Jump jump(){
        System.out.print(printLocation() + ";");
        return new Jump(this);
    }

    public Move move(){
        System.out.print(printLocation() + ";");
        return new Move(this);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String printLocation(){
        return "(" + getX() + "," + getY() + ")";
    }
}
