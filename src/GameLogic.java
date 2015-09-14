
public class GameLogic {
	public GameLogic (){
		
	}
	/* if draw - 0, if first parameter winner - 1, if second parameter winner - 2 */
	public int CalculateWinner (Gesture ga, Gesture gb) {
		if (ga == Gesture.Rock && gb == Gesture.Paper) { return 2; }
		if (ga == Gesture.Rock && gb == Gesture.Scissor) { return 1; }
		
		if (ga == Gesture.Paper && gb == Gesture.Scissor) { return 2; }
		if (ga == Gesture.Paper && gb == Gesture.Rock) { return 1; }
		
		if (ga == Gesture.Scissor && gb == Gesture.Rock) { return 2; }
		if (ga == Gesture.Scissor && gb == Gesture.Paper) { return 1; }
		
		return 0;	
	}
}
