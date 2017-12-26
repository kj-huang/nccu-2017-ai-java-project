package homework;

public class FinishMoveState implements GameState{
    private Board board;
    private Agent agent;

    public FinishMoveState(Agent agent) {
        this.agent = agent;
    }

    FinishMoveState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args) {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        System.out.println("You already read the board");
    }

    public Checker SelectOneChecker() {
        System.out.println("You already choose a checker");
        return null;
    }

    public void FinishMove() {
        //TODO algorithm decide to move the checkers to the longest move
        //TODO print out the moving log

        board.updatedBoard();
        agent.setState(agent.getReadBoardState());
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
