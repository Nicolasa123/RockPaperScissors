
import static org.junit.Assert.*;
import org.junit.Test;

public class GameLogicTest {
	 @Test
	  public void testGestureComparer(){
		 GameLogic logic = new GameLogic();
		 
		 //assertEquals(logic.CalculateWinner(Gesture.Rock, Gesture.Scissors), 1);
		 //assertEquals(logic.CalculateWinner(Gesture.Rock, Gesture.Paper), 2);
		 //assertEquals(logic.CalculateWinner(Gesture.Paper, Gesture.Paper), 0);
	     assertFalse("Paper Is NOT supposed to beaten by or draw with scissors",logic.CalculateWinner(Gesture.Paper, Gesture.Scissor) == 2);
	
	 }
}
