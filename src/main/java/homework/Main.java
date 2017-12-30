package homework;

import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String args[]) throws IOException {
        Board board = new Board();
        Agent agent = new Agent(board);

        if(args[0] != null && args[1] != null)
            if(args[0].equals("fixed"))
                agent.StartGame(args[0], parseInt(args[1]));
            else
                agent.StartGame("fixed", parseInt(args[1]));
    }
}
