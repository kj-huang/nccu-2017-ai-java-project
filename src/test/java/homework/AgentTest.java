package homework;

import org.junit.Assert;
import org.junit.Test;

public class AgentTest {
    @Test
    public void ItShouldChangeStateRespectfully(){
        Board board = new Board();
        Agent agent = new Agent(board);

        agent.setState(agent.getReadBoardState());
        Assert.assertEquals(agent.getState(), agent.getReadBoardState());

        agent.setState(agent.getSelectOneCheckerState());
        Assert.assertEquals(agent.getState(), agent.getSelectOneCheckerState());

        agent.setState(agent.getFinishMoveState());
        Assert.assertEquals(agent.getState(), agent.getFinishMoveState());

        agent.setState(agent.getGameSetState());
        Assert.assertEquals(agent.getState(), agent.getGameSetState());
    }

//    @Test
//    public void ItShouldSetUpTheGame(){
//        Board board = new Board();
//        Agent agent = new Agent(board);
//
//        //TODO ADD Test to verify to add checkers correctly
//    }

    @Test
    public void ItShouldChangeTheStateAfterSetUpTheGame(){
        Board board = new Board();
        Agent agent = new Agent(board);

        agent.StartGame();

        Assert.assertSame(agent.getState(), agent.getReadBoardState());
    }

//    @Test
//    public void ItShouldGetTheBoardInformation(){}

    @Test
    public void ItShouldChangeTheStateAfterReadTheBoard(){
        Board board = new Board();
        Agent agent = new Agent(board);

        agent.StartGame();
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getSelectOneCheckerState());
    }

//    @Test
//    public void ItShouldSelectTheChecker(){}

    @Test
    public void ItShouldChangeTheStateAfterSelectTheChecker(){
        Board board = new Board();
        Agent agent = new Agent(board);

        agent.StartGame();
        agent.ReadBoard();
        agent.SelectOneChecker();

        Assert.assertSame(agent.getState(), agent.getFinishMoveState());
    }

    @Test
    public void ItShouldMoveTheChecker(){}

    @Test
    public void ItShouldChangeTheStateAfterFinishTheMoveWithContinueGame(){
        Board board = new Board();
        Agent agent = new Agent(board);

        agent.StartGame();
        agent.ReadBoard();
        agent.SelectOneChecker();
        agent.FinishMove();

        Assert.assertSame(agent.getState(), agent.getReadBoardState());
    }

//    @Test
//    public void ItShouldChangeTheStateAfterFinishTheMoveWithGameSet(){
//        Board board = new Board();
//        Agent agent = new Agent(board);
//
////        agent.StartGame();
////        agent.ReadBoard();
////        agent.SelectOneChecker();
////        agent.FinishMove();
//
//        Assert.assertSame(agent.getState(), agent.getGameSetState());
//    }

//    @Test
//    public void ItShouldFinishTheGame(){}
}
