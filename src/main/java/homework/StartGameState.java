package homework;

import java.io.File;

public class StartGameState implements GameState {
    private Agent agent;
    private Board board;

    StartGameState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

//    public void Start(String args) {
//
//    }

    public void Start(String args, int terminal) {
        if(args.contains(".txt")) {
            //TODO file handler add checkers
            File file = new File(args);

//            while(){
//                board.addChecker();
//            }
        }
        else if(args.equals("fixed")){
            board.fillHome();
        }

        switch (terminal){
            case 1:
                board.setGreenAreaAsDestination();
                break;
            case 2:
                board.setYellowAreaAsDestination();
                break;
            case 3:
                board.setRedAreaAsDestination();
                break;
        }

        //board set Terminal State
        agent.setState(agent.getReadBoardState());
    }



    public void ReadBoard() {
        System.out.println("You haven't initialize Board yet");
    }

    public void SelectOneCheckerAndMove() {
        System.out.println("Please Select a checker");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
