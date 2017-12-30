package homework;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        Board board = new Board();
        Agent agent = new Agent(board);

        if(args[1] != null)
            agent.StartGame(args[1], 1);
        else //TODO refactor to absolute test case
            agent.StartGame("", 1);

//        while(){
//
//        }

    }
}
