package homework;

public interface GameState {
    void Start(String args, int terminal);
    void ReadBoard();
    Checker SelectOneChecker();
    void FinishMove(Checker checker);
    void GameSet();
}
