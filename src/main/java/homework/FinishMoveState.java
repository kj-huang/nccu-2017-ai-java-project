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

    public void Start(String args, int terminal) {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        System.out.println("You already read the board");
    }

    public void SelectOneCheckerAndMove() {
        System.out.println("You already choose a checker");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
