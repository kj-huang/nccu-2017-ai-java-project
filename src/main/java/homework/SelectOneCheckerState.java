package homework;

public class SelectOneCheckerState implements GameState {
    private Agent agent;

    public SelectOneCheckerState(Agent agent) {
        this.agent = agent;
    }

    public void Start(String args) {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        System.out.println("You should choose a checker");
    }

    public void SelectOneChecker() {
        //TODO algorithm to decide select a checker

        agent.setState(agent.getFinishMoveState());
    }

    public void FinishMove() {
        System.out.println("You haven't move any Checkers yet");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
