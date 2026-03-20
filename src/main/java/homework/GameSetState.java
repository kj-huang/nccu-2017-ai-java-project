package homework;

public class GameSetState implements GameState{

    private Board board;
    private Agent agent;

     GameSetState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args, int terminal) {
        System.out.println(Messages.get("game.alreadyFinished"));
    }

    public void ReadBoard() {
        System.out.println(Messages.get("game.alreadyFinished"));
    }

    public void SelectOneCheckerAndMove() {
        System.out.println(Messages.get("game.alreadyFinished"));
    }

    public void GameSet() {
        System.out.println(agent.getCount());

        board.cleanUpBoard();
        board.destroyAllObjectsOnTheBoard();
    }
}
