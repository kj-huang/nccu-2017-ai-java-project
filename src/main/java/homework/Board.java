package homework;

import java.util.ArrayList;

public class Board {
    private ArrayList<Checker> checkers;
    private ArrayList<Checker> obstacleCheckers;
    private ArrayList<Point> terminalPoints;

    private Jump jump;
    private Move move;

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
        obstacleCheckers = new ArrayList<Checker>();
        terminalPoints = new ArrayList<Point>();
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

            if(!isMiddleArea(x,y))
                checkers.add(new Checker(x,y));
            else
                obstacleCheckers.add(new Checker(x,y));
        }
        return this;
    }

    public boolean isMiddleArea(int x, int y){
        boolean bottomRight =  (x <= 3 && y >= -3) && (x >= 0 && y <= 0);
        boolean topLeft =  (x >= -3 && y <= 3) && (x <= 0 && y >= 0);
        boolean bottomLeft =  (x == -1 && ((y >= -2) && y <= 0)) || (x == -2 && y == -1);
        boolean topRight =  (x == 1 && ((y <= 2) && y >= 0)) || (x == 2 && y == 1);

        return bottomRight || bottomLeft || topLeft || topRight;
    }

    public boolean checkerExistAt(int x, int y) {
        return (isValidateCoordinate(x, y) && (grid[x+8][y+8] == 1));
    }

    public Checker getCheckerFromLocation(int x, int y){
        for (Checker checker: checkers) {
            if(checker.getX() == x && checker.getY() == y && isValidateCoordinate(x, y))
                return checker;
        }
        return null;
    }

    public void updatedBoard(){
        cleanUpBoard();
        for (Checker checker: checkers) {
            grid[checker.getX()+8][checker.getY()+8] = 1;
        }
    }

    public void fillHome(){
        this.addChecker(0,-4).addChecker(1,-4).addChecker(2,-4).addChecker(3,-4).addChecker(4,-4);
        this.addChecker(1,-5).addChecker(2,-5).addChecker(3,-5).addChecker(4,-5);
        this.addChecker(2,-6).addChecker(3,-6).addChecker(4,-6);
        this.addChecker(3,-7).addChecker(4,-7);
        this.addChecker(4,-8);
    }

    public void setGreenAreaAsDestination(){
        if(getTerminalPointsCount() == 15)
            return;
        terminalPoints.add(new Point(-4,0));
        terminalPoints.add(new Point(-4,1));
        terminalPoints.add(new Point(-4,2));
        terminalPoints.add(new Point(-4,3));
        terminalPoints.add(new Point(-4,4));
        terminalPoints.add(new Point(-5,1));
        terminalPoints.add(new Point(-5,2));
        terminalPoints.add(new Point(-5,3));
        terminalPoints.add(new Point(-5,4));
        terminalPoints.add(new Point(-6,2));
        terminalPoints.add(new Point(-6,3));
        terminalPoints.add(new Point(-6,4));
        terminalPoints.add(new Point(-7,3));
        terminalPoints.add(new Point(-7,4));
        terminalPoints.add(new Point(-8,4));
    }

    public void setYellowAreaAsDestination(){
        if(getTerminalPointsCount() == 15)
            return;
        terminalPoints.add(new Point(0,4));
        terminalPoints.add(new Point(-1,4));
        terminalPoints.add(new Point(-2,4));
        terminalPoints.add(new Point(-3,4));
        terminalPoints.add(new Point(-4,4));
        terminalPoints.add(new Point(-1,5));
        terminalPoints.add(new Point(-2,5));
        terminalPoints.add(new Point(-3,5));
        terminalPoints.add(new Point(-4,5));
        terminalPoints.add(new Point(-2,6));
        terminalPoints.add(new Point(-3,6));
        terminalPoints.add(new Point(-4,6));
        terminalPoints.add(new Point(-3,7));
        terminalPoints.add(new Point(-4,7));
        terminalPoints.add(new Point(-4,8));
    }

    public void setRedAreaAsDestination(){
        if(getTerminalPointsCount() == 15)
            return;
        terminalPoints.add(new Point(0,-4));
        terminalPoints.add(new Point(-1,-3));
        terminalPoints.add(new Point(-1,-4));
        terminalPoints.add(new Point(-2,-2));
        terminalPoints.add(new Point(-2,-3));
        terminalPoints.add(new Point(-2,-4));
        terminalPoints.add(new Point(-3,-1));
        terminalPoints.add(new Point(-3,-2));
        terminalPoints.add(new Point(-3,-3));
        terminalPoints.add(new Point(-3,-4));
        terminalPoints.add(new Point(-4,0));
        terminalPoints.add(new Point(-4,-1));
        terminalPoints.add(new Point(-4,-2));
        terminalPoints.add(new Point(-4,-3));
        terminalPoints.add(new Point(-4,-4));
    }

    public int getTerminalPointsCount(){
        return terminalPoints.size();
    }

    public int getRemainCheckersSku(){
        return checkers.size();
    }

    public int getObstacleCheckersSku(){
        return obstacleCheckers.size();
    }

    public boolean isFillWithTargetArea(){
        int counter = 0;
        for (Checker checker:checkers) {
            for(Point point: terminalPoints){
                if(checker.getY() == point.getY() && checker.getX() == point.getX())
                    counter++;
            }
        }

        return counter ==  checkers.size() && checkers.size() > 0;
    }

    public void cleanUpBoard(){
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++)
                if(grid[i][j] == 1)
                    grid[i][j] = 0;
    }

    public void destroyAllObjectsOnTheBoard(){
        checkers.clear();
        obstacleCheckers.clear();
        terminalPoints.clear();
    }

    public Checker getCheckers(){
        //回傳所有checker的x y
        for (Checker checker: checkers) {
            int x = checker.getX();
            int y = checker.getY();
            Checker cc = new Checker(x,y);
            return cc;
        }
        return null;
    }


    public void checkJump(Checker c){
        int x = c.getX();
        int y = c.getY();
        jump = new Jump(c);
        if (checkerExistAt(x-1,y+1)==true && checkerExistAt(x-2,y+2)==false){
            //判斷有沒有走過那個xy
            //還要判斷這顆旗子有沒有走過這條路
            jump.LeftUp();
        }
        if (checkerExistAt(x-1,y)==true && checkerExistAt(x-2,y)==false){
            jump.Left();
        }
        if (checkerExistAt(x,y-1)==true && checkerExistAt(x,y-2)==false){
            jump.LeftDown();
        }
        if (checkerExistAt(x+1,y-1)==true && checkerExistAt(x+2,y-2)==false){
            jump.DownRight();
        }
        if (checkerExistAt(x+1,y)==true && checkerExistAt(x+2,y)==false){
            jump.Right();
        }
        if (checkerExistAt(x,y+1)==true && checkerExistAt(x,y+2)==false) {
            jump.RightUp();
        }
    }

    public void checkMove(Checker c){
        int x = c.getX();
        int y = c.getY();
        move = new Move(c);
        if (checkerExistAt(x-1,y+1)==false){
            //還要判斷這顆旗子有沒有走過這條路
            move.LeftUp();
        }
        if (checkerExistAt(x-1,y)==false){
            move.Left();
        }
        if (checkerExistAt(x,y-1)==false){
            move.LeftDown();
        }
        if (checkerExistAt(x+1,y-1)==false){
            move.DownRight();
        }
        if (checkerExistAt(x+1,y)==false){
            move.Right();
        }
        if (checkerExistAt(x,y+1)==false) {
            move.RightUp();
        }
    }


}
