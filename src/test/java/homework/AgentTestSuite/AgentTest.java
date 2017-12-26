package homework.AgentTestSuite;

import homework.Agent;
import homework.Board;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgentTest {

    private Board board;
    private Agent agent;

    @Before
    public void setUp(){
        board = new Board();
        agent = new Agent(board);
    }

    @Test
    public void ItShouldChangeStateRespectfully(){
        agent.setState(agent.getReadBoardState());
        Assert.assertEquals(agent.getState(), agent.getReadBoardState());

        agent.setState(agent.getSelectOneCheckerState());
        Assert.assertEquals(agent.getState(), agent.getSelectOneCheckerState());

        agent.setState(agent.getFinishMoveState());
        Assert.assertEquals(agent.getState(), agent.getFinishMoveState());

        agent.setState(agent.getGameSetState());
        Assert.assertEquals(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldSetUpTheGame(){
        agent.StartGame("fixed");

        Assert.assertEquals(true,board.checkerExistAt(2,-5));
        Assert.assertEquals(true,board.checkerExistAt(4,-8));
    }

    @Test
    public void ItShouldChangeTheStateAfterReadTheBoard(){
        agent.StartGame("fixed");
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getSelectOneCheckerState());
    }

//    @Test
//    public void ItShouldSelectTheChecker(){}

//    @Test
//    public void ItShouldChangeTheStateToGameSetAfterReadTheBoard(){
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

    @Test
    public void ItShouldChangeTheStateAfterSelectTheChecker(){

        agent.StartGame("fixed");
        agent.ReadBoard();
        agent.SelectOneChecker();

        Assert.assertSame(agent.getState(), agent.getFinishMoveState());
    }

    @Test
    public void ItShouldMoveTheChecker(){}

    @Test
    public void ItShouldChangeTheStateAfterFinishTheMoveWithContinueGame(){

        agent.StartGame("fixed");
        agent.ReadBoard();
        agent.SelectOneChecker();
        agent.FinishMove();

        Assert.assertSame(agent.getState(), agent.getReadBoardState());
    }



//    @Test
//    public void ItShouldFinishTheGame(){}

    @After
    public void cleanUp(){
        board = null;
        agent = null;
    }
}
