package homework;

public interface GameState {
    void Start(String args);
    void ReadBoard();
    Checker SelectOneChecker();
    void FinishMove();
    void GameSet();
}
