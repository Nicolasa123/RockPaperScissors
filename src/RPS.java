import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPS {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic();
		
		System.out.println("Greetings, welcome to the Rock Paper Scissors game - the Nicola Owen edition. Banned in 31 states for brutality..");
		
		System.out.println("Press 1 for Player vs Computer.");
		System.out.println("Press 2 for Computer vs Computer");
				
		String mode = ReadLine();
		
		if(mode.equals("1")){	
			System.out.println("State your name challenger");
			String name = ReadLine();
			
			Player player = new Player(name);
			Player cpu = new Player();
			
			System.out.println("select a choice, 0 - rock, 1 - paper, 2 - scissor");
			String choice = ReadLine();
			Gesture playerGesture;
			
			if(choice.equals("0") || choice.equals("1") || choice.equals("2")){
				int choiceInt = Integer.parseInt(choice);
				playerGesture = player.GetGestureBasedOnInt(choiceInt);
			}else{
				playerGesture = player.GenerateRandomChoice();
			}
			
			int result = gameLogic.CalculateWinner(playerGesture, cpu.GenerateRandomChoice());
			PrintWinnerInformation(result,player,cpu);		
		}else if(mode.equals("2")){
			Player cpuOne = new Player();
			Player cpuTwo = new Player();
			
			int result = gameLogic.CalculateWinner(cpuOne.GenerateRandomChoice(), cpuTwo.GenerateRandomChoice());
			
			PrintWinnerInformation(result,cpuOne,cpuTwo);
		}else{
			System.out.println("Wrong input");
		}
	}
	
	private static String ReadLine(){
		String output = "";
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    try {
			output = bufferRead.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    return output;
	}
	
	private static void PrintWinnerInformation(int result,Player po,Player pt){
		if (result == 0){
			System.out.println("Draw between " + po.Name + " and " + pt.Name);
		} else if (result == 1){
			System.out.println("Player one " + po.Name + " wins. The loser was " + pt.Name);
		} else if(result == 2){
			System.out.println("Player two " + pt.Name + " wins. The loser was " + po.Name);
		}
	}

}
