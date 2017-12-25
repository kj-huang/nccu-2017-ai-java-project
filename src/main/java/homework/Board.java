package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    private int x;
    private int y;
    private static int HEIGHT = 17;
//    private ArrayList<Point> [][] grid = new ArrayList[17][17];

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
        for(int i = 0; i < 17; i++){
            for(int j = 0; j < 17; j++){
//                grid[i][j] = new ArrayList<Point>();
            }
        }

//        for(int i = 8; i < 12; i++) {
//            for (int j = 8; j > 4; j--) {
//                grid[i][j].add(new Point(Color.NONE, i, j));
//            }
//        }
//
//        for(int i = 5; i <= 8; i++) {
//            for (int j = 8; j < 12; j++) {
//                grid[i][j].add(new Point(Color.NONE, i, j));
//            }
//        }
//
//        grid[9][9].add(new Point(Color.NONE, 9, 9));
//        grid[9][10].add(new Point(Color.NONE, 9, 10));
//        grid[10][9].add(new Point(Color.NONE, 10, 9));
//
//        grid[7][7].add(new Point(Color.NONE, 7, 7));
//        grid[7][6].add(new Point(Color.NONE, 7, 6));
//        grid[6][7].add(new Point(Color.NONE, 6, 7));

//        fillUpperRedArea();
//        fillLowerRedArea();
//
//        fillUpperGreenArea();
//        fillLowerGreenArea();
//
//        fillUpperYellowArea();
//        fillLowerYellowArea();
    }

    public Board(Color a){

    }


    void fillUpperRedArea(){
        for(int i = 8; i <= 12; i++) {
            for (int j = 12; j >= 20 - i; j--) {
//                grid[i][j].add(new Point(Color.RED, i, j));
            }
        }
    }

    void fillUpperYellowArea(){
        for(int i = 4; i <= 8; i++){
            for(int j = 12; j <= 20-i; j++){
//                grid[i][j].add(new Point(Color.YELLOW,i,j));
            }
        }
    }

    void fillUpperGreenArea(){
        for(int i = 12; i <= 16; i++){
            for(int j = 4; j <= 20-i; j++){
//                grid[i][j].add(new Point(Color.GREEN,i,j));
            }
        }
    }

    void fillLowerRedArea(){
        for(int i = 4; i <= 8; i++){
            for(int j = 4; j <= 12-i; j++){
//                grid[i][j].add(new Point(Color.RED,i,j));
            }
        }
    }



    void fillLowerYellowArea(){
        for(int i = 8; i <= 12; i++) {
            for (int j = 4; j >= 12 - i; j--) {
//                grid[i][j].add(new Point(Color.YELLOW, i, j));
            }
        }
    }



    void fillLowerGreenArea(){
        for(int i = 0; i <= 4; i++) {
            for (int j = 12; j >= 12 - i; j--) {
//                grid[i][j].add(new Point(Color.GREEN, i, j));
            }
        }
    }

    public boolean isValidateCoordinate(int x, int y){
        return grid[x + 8][y + 8] != -1;
    }

    public boolean isEmpty(int x, int y){
        if(isValidateCoordinate(x,y)){
            return grid[x + 8][y + 8] != 0;
        }
        return false;
    }

    public void putChecker(int x, int y) {
        if(isEmpty(x,y))
            grid[x+8][y+8] = 1;
    }

    public int get(int x, int y) {
        return grid[x+8][y+8];
    }



    public void fillHome(){

    }

    public void cleanUp(){

    }
}
