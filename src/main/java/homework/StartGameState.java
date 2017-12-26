package homework;

import java.io.File;

public class StartGameState implements GameState {
    private Agent agent;
    private Board board;

    StartGameState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args) {
        if(args.contains(".txt")) {
            //TODO file handler add checkers
            File file = new File(args);
        }
        else{
            board.fillHome();
        }

        //board set Terminal State
        agent.setState(agent.getReadBoardState());
    }

    public void ReadBoard() {
        System.out.println("You haven't initialize Board yet");
    }

    public Checker SelectOneChecker() {
        System.out.println("Please Select a checker");
        return null;
    }

    public void FinishMove() {
        System.out.println("You haven't move any Checkers yet");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
