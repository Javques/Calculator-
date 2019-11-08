//--------------------------------------
// Assignment 2 (Q3)
// Written by: Alexis Bolduc 40126092
// For COMP 248 Section FF - Fall 2019
//--------------------------------------

//Import scanner function
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		// declare keyboard function
		Scanner keyboard = new Scanner(System.in);
		// Asking user input
		System.out.println("Hello to mini calculator program.\n" +
		"Please enter the numbers along the operation (press q to exit): \n");
		
		//Declaration of variables, where input is the user's input
		//numb1 is the first number, numb2 the second one. 
		// posn is the index of the sign used in the equation   
		//int1 and int2 are the integer values of, respectively, numb1 and numb2.
		String input,numb1, numb2;
		int posn, int1, int2;
		// User input
		input = keyboard.next();
		// If the input does not contain the q character, the program is in a loop
		while(!input.contains("q"))  {
		// For each equation sign, an if condition is created in order to cut the string
		// in 3 pieces for the integers to be added, subtracted, multiplied or divided
		// with one another depending on the calculation demand
			if (input.contains("+"))
			{
			posn = input.indexOf("+");
			numb1 = input.substring(0, posn);
			numb2 = input.substring(posn+1);
			int1 = Integer.parseInt(numb1); 
			int2 = Integer.parseInt(numb2);
			
			 // force float in each calculations to have more precision in answer
			System.out.println("The answer is: "+ ((float)int1+int2));
			
			} 
			if (input.contains("x")) 
			{
			posn = input.indexOf("x");
			numb1 = input.substring(0, posn);
			numb2 = input.substring(posn+1);
			int1 = Integer.parseInt(numb1); 
			int2 = Integer.parseInt(numb2);
				
			System.out.println("The answer is: "+ ((float)int1*int2));
	
			} 
			if (input.contains("*")) 
			{
			posn = input.indexOf("*");
			numb1 = input.substring(0, posn);
			numb2 = input.substring(posn+1);
			int1 = Integer.parseInt(numb1); 
			int2 = Integer.parseInt(numb2);
				
			System.out.println("The answer is: "+ ((float)int1*int2));
	
			} 
			if (input.contains("-")) 
			{
			posn = input.indexOf("-");
			numb1 = input.substring(0, posn);
			numb2 = input.substring(posn+1);
			int1 = Integer.parseInt(numb1); 
			int2 = Integer.parseInt(numb2);

			System.out.println("The answer is: " + ((float)int1 - int2));
		
			}
			if (input.contains("/")) 
			{
			posn = input.indexOf("/");
			numb1 = input.substring(0, posn);
			numb2 = input.substring(posn+1);
			int1 = Integer.parseInt(numb1); 
			int2 = Integer.parseInt(numb2);
			
			System.out.println("The answer is: "+((float)int1/int2));
				
		}
		System.out.println("Please enter the numbers along the operation (press q to exit): \n");
		// In order to keep the program running, we need to ask the user to input again an
		// string
				input = keyboard.next();
		}
	
		//This is the condition for exiting the program
		if (input.contains( "q") && input.length()==1)
		{
		System.out.println("Thanks for using mini calculator program.");
		//If q is pressed, the keyboard function is of no use
		keyboard.close();
		}
		
		//We need to close the keyboard function that was opened in the first lines
		keyboard.close();	

	}
}
//This mark the end of the program, thank you
