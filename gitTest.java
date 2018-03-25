import java.util.Scanner;
import java.util.Random;
public class gitTest {
	static Scanner sc=new Scanner(System.in);
	static Random ran=new Random();
	static int num=ran.nextInt(100)+1;
	static int guess=0;
	public static void main() {
	
	
	System.out.println("Guess my number");
	guessNum();
	if(again()==true) {
		main();
	}
	else {
		System.exit(0);
	}
	}
	
	public static void guessNum() {
		while(guess!=num) {
			guess=sc.nextInt();
			if(guess>num) {
				System.out.println("Too high");
			}
			else if(guess<num) {
				System.out.println("Too low");
			}
			else {
				System.out.println("That is it!");
			}
		}
	}
	
	public static boolean again() {
		System.out.println("Play again? (y/n)");
		String answer=sc.next();
		if(answer.equals("y")) {
			return true;
		}
		else {
			return false;
		}
	}
}
