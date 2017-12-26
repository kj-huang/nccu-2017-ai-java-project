package homework;

public class FinishMoveState implements GameState{
    private Agent agent;

    public FinishMoveState(Agent agent) {
        this.agent = agent;
    }

    public void Start() {
        System.out.println("You already start a game");
    }

    public void ReadBoard() {
        System.out.println("You already read the board");
    }

    public void SelectOneChecker() {
        System.out.println("You already choose a checker");
    }

    public void FinishMove() {
        //TODO algorithm decide to move the checkers to the longest move

        //TODO print out the moving log

        if(true){
            agent.setState(agent.getReadBoardState());
        }
        else {
            agent.setState(agent.getGameSetState());
        }
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
