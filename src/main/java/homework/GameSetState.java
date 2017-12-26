package homework;

public class GameSetState implements GameState{

    private Agent agent;

    public GameSetState(Agent agent) {
        this.agent = agent;
    }

    public void Start(String args) {
        System.out.println("You already finish a game");
    }

    public void ReadBoard() {
        System.out.println("You already finish a game");
    }

    public void SelectOneChecker() {
        System.out.println("You already finish a game");
    }

    public void FinishMove() {
        System.out.println("You already finish a game");
    }

    public void GameSet() {
        //TODO print out how many times of moving to finish the game

        //TODO Destroy the board and Checkers
    }
}
