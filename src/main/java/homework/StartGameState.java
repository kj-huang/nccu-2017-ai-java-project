package homework;

public class StartGameState implements GameState {
    private Agent agent;

    public StartGameState(Agent agent) {
        this.agent = agent;
    }

    public void Start() {
        //TODO initialize Board Checkers

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
