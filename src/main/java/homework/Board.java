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

//    public Board(Color a){
//
//    }

    public boolean isValidateCoordinate(int x, int y){
        return grid[x + 8][y + 8] != -1;
    }

    public boolean isEmpty(int x, int y){
        if(isValidateCoordinate(x,y)){
            return grid[x + 8][y + 8] != 0;
        }
        return false;
    }

    public Board putChecker(int x, int y) {
        if(!isEmpty(x,y)){
            grid[x+8][y+8] = 1;
            checkers.add(new Checker(x,y));
        }

        return this;
    }

    public int get(int x, int y) {
        return isValidateCoordinate(x, y) ? grid[x+8][y+8] : -1;
    }

    //TODO
    public Checker getCheckerLocation(int x, int y){
        for (Checker checker: checkers) {
            if(checker.getX() == x && checker.getY() == y && isValidateCoordinate(x, y))
                return new Checker(x,y);
        }
        return new Checker(0,0);
    }

    public void fillHome(){

    }

    public void cleanUp(){

    }
}
