package homework;

public class ReadBoardState implements GameState{
    private Board board;
    private Agent agent;

    ReadBoardState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args, int terminal) {
        System.out.println(Messages.get("game.alreadyStarted"));
    }

    public void ReadBoard() {
        if(board.isFillWithTargetArea())
            agent.setState(agent.getGameSetState());
        else {
            agent.setState(agent.getSelectOneCheckerState());
        }
    }

    public void SelectOneCheckerAndMove() {
        System.out.println(Messages.get("game.checkBoardFirst"));
    }

    public void GameSet() {
        System.out.println(Messages.get("game.haveCheckers"));
    }
}
