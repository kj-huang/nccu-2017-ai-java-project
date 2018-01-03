package homework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SelectOneCheckerState implements GameState {
    private Board board;
    private Agent agent;

    SelectOneCheckerState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args, int terminal) {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        System.out.println("You should choose a checker");
    }

    public void SelectOneCheckerAndMove() {
        System.out.println("Select Checkers");

        ArrayList<Checker> checkers = board.getAllRemainCheckersNotAtTerminalPoints();
        ArrayList<ArrayList<Point>> lists = new ArrayList<ArrayList<Point>>();
        for(Checker checker: checkers){
            FunctionH h = new FunctionH(board, checker);
            lists.add(h.getBestPathSolution());
        }

        int index = 0;
        int h = -1000;
        for(int i = 0; i < lists.size(); i++){
            for(int j = lists.get(i).size()-1; j < lists.get(i).size(); j++){
                if(j > 0 && lists.get(i) != null && lists.get(i).get(j) != null)
                if(((0 - lists.get(i).get(j).getX()) + lists.get(i).get(j).getY()) > h){
                        index = i;
                        h = ((0 - lists.get(i).get(j).getX()) + lists.get(i).get(j).getY());
                }
            }
        }

        new Logger(checkers.get(index).getPoint(), lists.get(index));

        checkers.get(index).setX(lists.get(index).get(lists.get(index).size()-1).getX());
        checkers.get(index).setY(lists.get(index).get(lists.get(index).size()-1).getY());
//        checkers.get(index).setX(lists.get(index).get(lists.get(index).size()-1))));

        //move checker to new point
//        for(Checker checker: checkers){
//            if(checker.getX() == lists.get(index).get(0).getX() && checker.getY() == lists.get(index).get(0).getY()){
//                checker.setX(lists.get(index).get(lists.get(index).size()-1).getX());
//                checker.setY(lists.get(index).get(lists.get(index).size()-1).getY());
//            }
//        }
        board.updatedBoard();

//        Thread.sleep(1000);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Read Board");
        agent.setState(agent.getReadBoardState());
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
