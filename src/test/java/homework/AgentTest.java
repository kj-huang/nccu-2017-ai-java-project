package homework;

import org.junit.*;

import java.io.IOException;


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
    public void ItShouldSetUpTheGameWithFileNameAsParameter() throws IOException {
        String fileName = "obstacle.txt";
        agent.StartGame(fileName, 1);


        Assert.assertEquals(3, board.getObstacleCheckersSku());
        Assert.assertEquals(true, board.checkerExistAt(0,0));
    }


    @Test
    public void ItShouldSetUpTheGameWithFixedAsParameter() throws IOException {
        agent.StartGame("fixed", 1);

        Assert.assertEquals(true,board.checkerExistAt(2,-5));
        Assert.assertEquals(true,board.checkerExistAt(4,-8));
        Assert.assertEquals(15, board.getTerminalPointsCount());
    }

    @Test
    public void ItShouldChangeTheStateAfterReadTheBoard() throws IOException {
        agent.StartGame("fixed", 1);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getSelectOneCheckerState());
    }

    @Test
    public void ItShouldChangeTheStateToGameSetAfterReadTheBoardWithCheckersAllAtGreenArea() throws IOException {
        Board board = new Board();
        Agent agent = new Agent(board);

        //1000 not set any checkers on to board
        agent.StartGame("testEnv", 1);
        board.addChecker(-8,4);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldChangeTheStateToGameSetAfterReadTheBoardWithCheckersAllAtYellowArea() throws IOException {
        Board board = new Board();
        Agent agent = new Agent(board);

        //1000 not set any checkers on to board
        agent.StartGame("testEnv", 2);
        board.addChecker(-4,8);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldChangeTheStateToGameSetAfterReadTheBoardWithCheckersAllAtRedArea() throws IOException {
        Board board = new Board();
        Agent agent = new Agent(board);

        //1000 not set any checkers on to board
        agent.StartGame("testEnv", 3);
        board.addChecker(-4,-1);
        agent.ReadBoard();

        Assert.assertSame(agent.getState(), agent.getGameSetState());
    }

    @Test
    public void ItShouldChangeTheStateAfterSelectTheChecker() throws IOException {

        agent.StartGame("fixed", 1);
        agent.ReadBoard();
        agent.SelectOneCheckerAndMove();

        Assert.assertSame(agent.getState(), agent.getFinishMoveState());
    }

    //    @Test
//    public void ItShouldSelectTheChecker(){}

    @After
    public void cleanUp(){
        board.cleanUpBoard();
        board.destroyAllObjectsOnTheBoard();
        agent = null;
    }
}
