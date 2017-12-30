package homework;

import org.junit.*;

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
        agent.StartGame("fixed", 1);

        Assert.assertEquals(true,board.checkerExistAt(2,-5));
        Assert.assertEquals(true,board.checkerExistAt(4,-8));
        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldChangeTheStateAfterReadTheBoard(){
        agent.StartGame("fixed", 1);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getSelectOneCheckerState());
    }

    @Test
    public void ItShouldChangeTheStateToGameSetAfterReadTheBoardWithCheckersAllAtGreenArea(){
        Board board = new Board();
        Agent agent = new Agent(board);

        //1000 not set any checkers on to board
        agent.StartGame("testEnv", 1);
        board.addChecker(-8,4);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldChangeTheStateToGameSetAfterReadTheBoardWithCheckersAllAtYellowArea(){
        Board board = new Board();
        Agent agent = new Agent(board);

        //1000 not set any checkers on to board
        agent.StartGame("testEnv", 2);
        board.addChecker(-4,8);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldChangeTheStateToGameSetAfterReadTheBoardWithCheckersAllAtRedArea(){
        Board board = new Board();
        Agent agent = new Agent(board);

        //1000 not set any checkers on to board
        agent.StartGame("testEnv", 3);
        board.addChecker(4,1);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldChangeTheStateAfterSelectTheChecker(){

        agent.StartGame("fixed", 1);
        agent.ReadBoard();
        agent.SelectOneCheckerAndMove();

        Assert.assertSame(agent.getState(), agent.getFinishMoveState());
    }

    //    @Test
//    public void ItShouldSelectTheChecker(){}


//    @Test
//    public void ItShouldFinishTheGame(){}

    @After
    public void cleanUp(){
        board = null;
        agent = null;
    }
}
