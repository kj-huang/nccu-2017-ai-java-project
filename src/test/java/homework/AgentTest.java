package homework;

import org.junit.Assert;
import org.junit.Test;

public class AgentTest {
    @Test
    public void ItShouldChangeStateRespectfully(){
        Board board = new Board();
        Agent agent = new Agent(board);

        agent.setState(agent.getReadBoardState());
        Assert.assertEquals(agent.state, agent.getReadBoardState());

        agent.setState(agent.getSelectOneCheckerState());
        Assert.assertEquals(agent.state, agent.getSelectOneCheckerState());

        agent.setState(agent.getFinishMoveState());
        Assert.assertEquals(agent.state, agent.getFinishMoveState());

        agent.setState(agent.getGameSetState());
        Assert.assertEquals(agent.state, agent.getGameSetState());
    }

    @Test
    public void ItShouldSetUpTheGame(){}

    @Test
    public void ItShouldGetTheBoardInformation(){}

    @Test
    public void ItShouldSelectTheChecker(){}

    @Test
    public void ItShouldMOveTheChecker(){}

    @Test
    public void ItShouldFinishTheGame(){}
}
