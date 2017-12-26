package homework;

import java.io.File;

public class StartGameState implements GameState {
    private Agent agent;
    private Board board;

    public StartGameState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args) {
        //TODO initialize Board Checker
        if(args.contains(".txt")) {
            File file = new File(args);
        }
        else{
            board.fillHome();
        }

        agent.setState(agent.getReadBoardState());
    }

    public void ReadBoard() {
        System.out.println("You haven't initialize Board yet");
    }

    public void SelectOneChecker() {
        System.out.println("Please Select a checker");
    }

    public void FinishMove() {
        System.out.println("You haven't move any Checkers yet");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
