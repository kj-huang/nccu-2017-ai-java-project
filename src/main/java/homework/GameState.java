package homework;

public interface GameState {
    void Start();
    void ReadBoard();
    void SelectOneChecker();
    void FinishMove();
    void GameSet();
}
