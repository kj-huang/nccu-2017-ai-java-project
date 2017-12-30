package homework;

import java.io.IOException;

public class Agent {
    private GameState StartGameState;
    private GameState ReadBoardState;
    private GameState SelectOneCheckerState;
    private GameState FinishMoveState;
    private GameState GameSetState;

    private GameState state;
    private int count;
    private Board board;

    public Agent(Board board){
        this.count = 0;

        this.board = board;
        StartGameState = new StartGameState(this, board);
        ReadBoardState = new ReadBoardState(this, board);
        SelectOneCheckerState = new SelectOneCheckerState(this, board);
        GameSetState = new GameSetState(this, board);
        state = new StartGameState(this, board);
    }

    public void preMoveTo(){}

    public void preJumpTo(){}

    public void StartGame(String arg, int terminal) throws IOException {
        state.Start(arg, terminal);
    }

    public void ReadBoard(){
        state.ReadBoard();
    }

    public void SelectOneCheckerAndMove(){
        state.SelectOneCheckerAndMove();
    }

    public void GameSet(){
        state.GameSet();
    }

    public GameState getState(){
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int time) {
        this.count = time;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public GameState getReadBoardState() {
        return ReadBoardState;
    }

    public GameState getSelectOneCheckerState() {
        return SelectOneCheckerState;
    }

    public GameState getFinishMoveState() {
        return FinishMoveState;
    }

    public GameState getGameSetState() {
        return GameSetState;
    }
}
