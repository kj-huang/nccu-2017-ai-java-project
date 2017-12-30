package homework;

import java.io.IOException;

public interface GameState {
    void Start(String args, int terminal) throws IOException;
    void ReadBoard();
    void SelectOneCheckerAndMove();
    void GameSet();
}
