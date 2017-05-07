public class Counter {
	private static int wellbeing = 0;
	private static int hunger = 3;
	
	public static void main(String[] args){
		WellbeingUp();
		WellbeingDown();
		HungerDown();		
	}

public static void WellbeingUp(){
	wellbeing++;

	System.out.println("Your well being is currently at " + wellbeing + ", Nice Job.");
	
}

public static void WellbeingDown(){
	wellbeing--;
	
	System.out.println("Oops, Your well being is currently at " + wellbeing + ", bad move.");
}

public static void HungerDown(){
	hunger--;
	
	System.out.println("You decided to eat, your hunger level is now " + hunger + ", Mmm Satisfying" );
}
		

}
