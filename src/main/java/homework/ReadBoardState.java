package homework;

public class ReadBoardState implements GameState{
    private Board board;
    private Agent agent;

    ReadBoardState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args, int terminal) {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        if(board.isFillWithTargetArea())
            agent.setState(agent.getGameSetState());
        else {
            agent.setState(agent.getSelectOneCheckerState());
        }
    }

    public void SelectOneCheckerAndMove() {
        System.out.println("please check the board first");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
