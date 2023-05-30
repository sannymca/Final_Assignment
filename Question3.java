
/*Write a Java programme that takes an integer from the user and throws an exception
if it is negative.Demonstrate Exception handling of same program as solution.
*/
package assignment;

import java.util.*;
public class Question3 {
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0)
            {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            }

            System.out.println("Entered number: " + number);
        }  
        catch (NegativeNumberException ex) 
        {
            System.out.println("Exception: " + ex.getMessage());
        }
        catch (Exception ex) 
        {
            System.out.println("An error occurred: " + ex.getMessage());
        } finally
        {
            scanner.close();
        }
    }

	}
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


