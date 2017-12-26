package homework;

public class ReadBoardState implements GameState{
    private Agent agent;

    public ReadBoardState(Agent agent) {

        this.agent = agent;
    }

    public void Start() {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        //TODO getChecker the board information

        agent.setState(agent.getSelectOneCheckerState());
    }

    public void SelectOneChecker() {
        System.out.println("please check the board first");
    }

    public void FinishMove() {
        System.out.println("You haven't move any Checkers yet");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}