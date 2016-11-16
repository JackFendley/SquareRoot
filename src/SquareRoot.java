import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner userInput = new Scanner(System.in);
		
		double userNum;
		
		do {
			System.out.print("Please enter a number: ");
			userNum = userInput.nextDouble();
			
			if(userNum <= 1){
				System.out.print("Please enter a positive number ");
				userNum = userInput.nextDouble();
			}
		
		}while(userNum <= 1);
	
		System.out.println("Your square root is: " + Math.sqrt(userNum));
			
		
		userInput.close();
	}

}
