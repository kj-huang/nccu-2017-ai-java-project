package homework;

import java.util.ArrayList;

public class Board {
    private ArrayList<Checker> checkers;

    private static final int[][] grid = {
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1  }, //17

            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0,  0, -1, -1, -1, -1  }, //16

            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0,  0,  0, -1, -1, -1, -1  }, //15

            { -1, -1, -1, -1, -1, -1, -1, -1, -1,  0,  0,  0,  0, -1, -1, -1, -1  }, //14

            { -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0  }, //13

            { -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1  }, //12

            { -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1  }, //11

            { -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1  }, //10

            { -1, -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1  }, //9

            { -1, -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1  }, //8

            { -1, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1  }, //7

            { -1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1  }, //6

            {  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, -1, -1, -1  }, //5

            { -1, -1, -1, -1,  0,  0,  0,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1  }, //4

            { -1, -1, -1, -1,  0,  0,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1  }, //3

            { -1, -1, -1, -1,  0,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1  }, //2

            { -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1  }, //1
    };

    public Board(){
        checkers = new ArrayList<Checker>();
    }

    public boolean isValidateCoordinate(int x, int y){
        return grid[x + 8][y + 8] != -1;
    }

    private boolean isEmptySlot(int x, int y){
        return isValidateCoordinate(x,y) && grid[x + 8][y + 8] != 0;
    }

    public Board addChecker(int x, int y) {
        if(!isEmptySlot(x,y)){
            grid[x+8][y+8] = 1;
            checkers.add(new Checker(x,y));
        }
        return this;
    }


    public boolean checkerExistAt(int x, int y) {
        return (isValidateCoordinate(x, y) && (grid[x+8][y+8] == 1));
    }

    //TODO
    public Checker getCheckerFromLocation(int x, int y){
        for (Checker checker: checkers) {
            if(checker.getX() == x && checker.getY() == y && isValidateCoordinate(x, y))
                return new Checker(x,y);
        }
        return new Checker(0,0);
    }

    public void fillHome(){
        this.addChecker(0,-4).addChecker(1,-4).addChecker(2,-4).addChecker(3,-4).addChecker(4,-4);
        this.addChecker(1,-5).addChecker(2,-5).addChecker(3,-5).addChecker(4,-5);
        this.addChecker(2,-6).addChecker(3,-6).addChecker(4,-6);
        this.addChecker(3,-7).addChecker(4,-7);
        this.addChecker(4,-8);
    }

    public int getRemainCheckersSku(){
        return checkers.size();
    }

    public boolean isFillWithTargetArea(){
        return true;
    }

    public void resetBoard(){

    }

}
