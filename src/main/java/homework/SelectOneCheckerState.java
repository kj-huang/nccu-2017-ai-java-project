package homework;

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
        //TODO algorithm to decide select a checker
        Checker checker = board.getCheckerFromLocation(0,-4);
        agent.setState(agent.getFinishMoveState());

    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
