/** Write a program using a text editor

it must...

1. Read a string prompt as an argument
2. The prompt will ask for user name and age
3. use scanner to read name and age
4. using this, display the info back to the console

*/ 
import java.util.Scanner;

public class Challenge1 {



	public static void main(String[] args) {

		Scanner age = new Scanner(System.in);
		Scanner name = new Scanner(System.in);

		System.out.println("enter your name");
		String myName = name.next();

		System.out.println("enter your age");
		int myAge = 0;

		try {
			myAge = age.nextInt();
		}
		catch (Exception e) {
			System.err.println("Age must be an integer, dumbass.");
			System.exit(1);
		}

		
		System.out.println("your name is " + myName);
		System.out.println("your age is " + myAge);

	}
}