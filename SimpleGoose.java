import java.util.Scanner;
import java.util.Random;

public class SimpleGoose {
	public static void main(String[] args) {
		
		int square = 0;
		int moveit;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the traditional Dutch game Goose board. Good luck getting your goose to the finish line!");
		System.out.println("\n##############################################################################################\n");
		
		while(square < 63){
			
			if(square == 23) {
				
				System.out.println("You have committed a goose-crime and been put in jail. GAME OVER!");
				break;
			}
			
			
		System.out.println("You are currently on square " + square + ". Please type g followed by the ENTER key to roll the dice.");
			
		String input = in.nextLine();
		
		switch(input) {
		
		case"g":
		RollTheDice rollit = new RollTheDice();
		moveit = rollit.diceRoll +1;
		
		square += moveit;
		System.out.println("You rolled " + moveit + ". Proceed to square " + square);
		
		if(square % 10 == 0) {
			System.out.println("What a spot of luck. Move forward another " + moveit + " squares.");
			square += moveit;
			break;
		}
		if(square == 25) {
			System.out.println("Poor little goose got lost. Move back to the start.");
			square = 0;
			break;
		}
		if(square == 45) {
			System.out.println("Poor little goose got lost. Move back to the start.");
			square = 0;
			break;
		}
		break;
		default:
            System.out.println("Please type g followed by the ENTER key.");
            break;
		}
		}
		
		if(square >= 63) {
			System.out.println("Well done! You have completed the game!");
		}
		
		}
		}


	
class RollTheDice{
	Random rand = new Random();
	int sides = 6;
	
	int diceRoll = rand.nextInt(sides); 
}