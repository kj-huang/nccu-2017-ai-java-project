package homework;

public interface GameState {
    void Start(String args, int terminal);
    void ReadBoard();
    void SelectOneCheckerAndMove();
    void GameSet();
}
