package homework;

public class GameSetState implements GameState{

    private Board board;
    private Agent agent;

     GameSetState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String args, int terminal) {
        System.out.println("You already finish a game");
    }

    public void ReadBoard() {
        System.out.println("You already finish a game");
    }

    public Checker SelectOneChecker() {
        System.out.println("You already finish a game");
        return null;
    }

    public void FinishMove(Checker checker) {
        System.out.println("You already finish a game");
    }

    public void GameSet() {
        //TODO print out how many times of moving to finish the game
//        agent.getCount();

        //TODO Destroy the board and Checkers

    }
}
