import java.util.Random;

public class Player {
	private String[] names = {"Bob","Duchess Amanda of Wellington","Winston","Margaret", "Quentin", "Fluffy Bunny", "Elizabeth"};
	
	public Player (String name){
		Name = name;
		IsHuman = true;
	}
	
	public Player(){
		 IsHuman = false;
		 Random rand = new Random();
		 Name = names[rand.nextInt(names.length)];
	}
	
	public String Name;
	public Boolean IsHuman;
	
	
	public Gesture GenerateRandomChoice(){
		Random rand = new Random();
		int gestureChoice = rand.nextInt(Gesture.values().length);
		
		return Gesture.values()[gestureChoice];
	}
	
	public Gesture GetGestureBasedOnInt(int gesture){
		return Gesture.values() [gesture];
	}
}
