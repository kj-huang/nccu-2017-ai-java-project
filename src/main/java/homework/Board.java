package homework;

import java.util.ArrayList;

public class Board {
    private int x;
    private int y;
    private static int HEIGHT = 17;
    private ArrayList<Point> [][] grid = new ArrayList[17][17];


    Board(){
        for(int i = 0; i < 17; i++){
            for(int j = 0; j < 17; j++){
                grid[i][j] = new ArrayList<Point>();
            }
        }


        //TODO Refactor to real case
        for(int i = 0; i <= 12; i++) {
            for (int j = 12; j >= 12 - i; j--) {
                grid[i][j].add(new Point(Color.NONE, i, j));
            }
        }

        for(int i = 0; i <= 4; i++) {
            for (int j = 12; j >= 12 - i; j--) {
                grid[i][j].add(new Point(Color.GREEN, i, j));
            }
        }

        for(int i = 8; i <= 12; i++) {
            for (int j = 12; j >= 20 - i; j--) {
                grid[i][j].add(new Point(Color.RED, i, j));
            }
        }

        for(int i = 8; i <= 12; i++) {
            for (int j = 4; j >= 12 - i; j--) {
                grid[i][j].add(new Point(Color.YELLOW, i, j));
            }
        }


        for(int i = 4; i <= 8; i++){
            for(int j = 4; j <= 12-i; j++){
                grid[i][j].add(new Point(Color.RED,i,j));
            }
        }

        for(int i = 4; i <= 8; i++){
            for(int j = 12; j <= 20-i; j++){
                grid[i][j].add(new Point(Color.YELLOW,i,j));
            }
        }

        for(int i = 12; i <= 16; i++){
            for(int j = 4; j <= 20-i; j++){
                grid[i][j].add(new Point(Color.GREEN,i,j));
            }
        }





//       grid[4][4].add(new Point(Color.RED,4,4));
//       grid[0][12].add(new Point(Color.GREEN,0,12));
//       grid[4][16].add(new Point(Color.YELLOW,4,16));

    }

    void putChecker(Color color, int x, int y) {
        grid[x+8][y+8].add(new Point(color,x,y));
    }

    public Color get(int x, int y) {
        return grid[x][y].get(0).getColor();
    }

//    public void locationTransport(){
//
//    }
//    public Color currentPointOfView() {
//        return currentColor;
//    }


//    public void fillHome(){
//
//    }



    void move(){

    }



    public static int translateNewXCoordinate(int x){
        return x - 8;
    }

    public static int translateNewYCoordinate(int y){
        return y - 8;
    }


    public static boolean validCoordinate(int x, int y) {
        int newX = translateNewXCoordinate(x);
        int newY = translateNewYCoordinate(y);

        return true;
    }
}
