package homework;

public interface GameState {
    void Start(String args);
    void ReadBoard();
    void SelectOneChecker();
    void FinishMove();
    void GameSet();
}
