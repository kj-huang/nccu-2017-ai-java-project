package homework;

import java.util.ArrayList;

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
        ArrayList<Checker> checkers = board.getAllRemainCheckersNotAtTerminalPoints();
        ArrayList<ArrayList<CheckerPath>> lists = new ArrayList<ArrayList<CheckerPath>>();
        for(Checker checker: checkers){
            FunctionH h = new FunctionH(board, checker);
            lists.add(h.getBestPathSolution());
        }


        for(ArrayList list : lists){
            //best pointmove = list.indexOf(1);
            //return best list index
        }

        //new Logger(list.index);
        //move checker to new point
        //updated board

        agent.setState(agent.getFinishMoveState());

    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
