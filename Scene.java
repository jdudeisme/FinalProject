import java.awt.*;

import java.util.Scanner;
public class Scene {
	
public static void Morning(){
		
	Scanner console = new Scanner(System.in);
	
	System.out.println("Good Morning! Do you want to stay in bed or head off to breakfast? (1/0)");
	int AnswerMorning = console.nextInt();
	if (AnswerMorning == 1){
		System.out.println("You get that much needed snooze button beauty rest and you feel better about the day ahead of you");
	Counter.WellbeingUp();
	}
	
	else if (AnswerMorning == 0){
		System.out.println("You eat a wonderful breakfast, but it comes at a cost of being groggy and cranky because you missed that important snooze button beauty rest");
		Counter.WellbeingDown();
		Counter.HungerDown();
	}
	else 
		System.out.println("That was an invalid input");
		
	console.close();
}

public void CS112(){

	
	
}

public void Lunch(){
	
	
}

public void Study(){
	
	
}

public void Section(){
	
	
	
}


public void Dinner(){
	
	
	
}

public void Procrastinate(){
	
	
}

public void Extracurricular(){
	
	
}

public void Buttery(){
	
	
}

public void Nighttime(){
	
	
}

}
