package homework;

public class Main {
    public static void main(String args[]){
        Board board = new Board();
        Agent agent = new Agent(board);

        if(args[1] != null)
            agent.StartGame(args[1]);
        else //TODO refactor to absolute test case
            agent.StartGame("");

//        while(){
//
//        }

    }
}
