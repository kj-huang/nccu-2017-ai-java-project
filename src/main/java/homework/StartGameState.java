package homework;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class StartGameState implements GameState {
    private final Agent agent;
    private final Board board;

    StartGameState(Agent agent, Board board) {
        this.agent = agent;
        this.board = board;
    }

    public void Start(String fileName, int terminal) throws IOException {

        if(fileName.contains(".txt")) {

            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(fileName));

                String sCurrentLine;
                sCurrentLine = br.readLine(); //get how many inputs

                while ((sCurrentLine = br.readLine()) != null) {

                    sCurrentLine = sCurrentLine.replaceAll("[^-?0-9]+", " ");
                    List<String> output = Arrays.asList(sCurrentLine.trim().split(" "));

                    System.out.println("" + parseInt(output.get(0))+ parseInt(output.get(1)));

                    board.addChecker(parseInt(output.get(0)),parseInt(output.get(1)));
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else if(fileName.equals("fixed")){
            board.fillHome();
        }

        switch (terminal){
            case 1:
                board.setGreenAreaAsDestination();
                break;
            case 2:
                board.setYellowAreaAsDestination();
                break;
            case 3:
                board.setRedAreaAsDestination();
                break;
        }

        //board set Terminal State
        System.out.println("Read Board");
        agent.setState(agent.getReadBoardState());
    }



    public void ReadBoard() {
        System.out.println("You haven't initialize Board yet");
    }

    public void SelectOneCheckerAndMove() {
        System.out.println("Please Select a checker");
    }

    public void GameSet() {
        System.out.println("You have Checkers on the board!!");
    }
}
