package boomboom;
import java.util.Scanner;

public class Game {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("B O O M B O O M\n"
				+ "your mission: defend the ship.\n"
				+ "s. coups and woozi are counting on you, hoshi.\n"
				+ "don't let them down.\n//\n"
				+ "you are standing in the foyer of a large building. the ceiling arches high above you\n"
				+ "and there are windows covering the entire wall behind you. your shadow stretches far\n"
				+ "in front of you in the afternoon sun. you're not sure whether your sweat-slick skin \n"
				+ "is due to the heat or the anxiety.\n"
				+ "there are hallways leading to the north, east, and south. the north hallway is unlit\n"
				+ "and empty. the east hallway is covered wall to wall in polaroids, maps, and diagrams.\n"
				+ "occasionally someone will step out from a single door on the left side.");
		// delete this later
		String ans = scan.nextLine();
		System.out.println(ans);
	}
}
