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
System.out.println("Enter your first name: ");
Scanner firstName = new Scanner(System.in);
String firstName = firstName.nextline()

System.out.println("Enter your last name: ");
Scanner lastName = new Scanner(System.in);
String lastName = lastName.nextline();

System.out.println("Hello " + firstName + " " + lastName + "./n")
System.out.println("Or should I say: " + lastName + ", " + firstName + "!")

    }
    
}
