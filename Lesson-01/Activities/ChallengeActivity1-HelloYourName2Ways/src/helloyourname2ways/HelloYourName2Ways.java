/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;

/**
 *
 * @author NewsLedBans
 */
public class HelloYourName2Ways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		System.out.print("Enter your first name: ");
		Scanner userInput = new Scanner(System.in);
		String firstName = new String(userInput.nextLine());

		System.out.print("Enter your last name: ");
		String lastName = new String(userInput.nextLine());

		System.out.println("\nHello " + firstName + " " + lastName + ".");
		System.out.println("Or should I say: " + lastName + ", " + firstName + "!\n");

    }
    
}
