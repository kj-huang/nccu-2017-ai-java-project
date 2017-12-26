package homework;

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
        FinishMoveState = new FinishMoveState(this, board);
        GameSetState = new GameSetState(this, board);
        state = new StartGameState(this, board);
    }

    public void StartGame(String arg){
        state.Start(arg);
    }

    public void ReadBoard(){
        state.ReadBoard();
    }

    public Checker SelectOneChecker(){
        return state.SelectOneChecker();
    }

    public void FinishMove(){
        state.FinishMove();
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
