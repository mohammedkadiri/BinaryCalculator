
import java.util.*;

class BinaryCalc {
	public static void main(String[] args) { // Start of the main method 
		Scanner keyboard = new Scanner(System.in);// Create a scanner object 
		int[] binary = {0, 0, 0, 0, 0, 0, 0, 0, 0}; // Declare and intialize array for the conversion of binary
		int temp = 0; // Temp variable for each element in the binary array  
		int[] baseTwo = new int[255]; // Declare and intialize an array to 255 spaces


System.out.println("   ___  _                       ___       _         _       _            	");
System.out.println("  ( o )(_)                     (  _)     ( )       ( )     ( )          	");
System.out.println("  |  _| ____  ___  __ _ _   |  |   ___ | |__ _ _ | | ___ | | ___ __ _ 	   	");
System.out.println("  ( O  | )( __ )( o )( _| V )  ( )_ ( o )( ) /( U )( )( o )( _| o | _)		");
System.out.println("  /___//_ | ___|(   ) /   /___ |_ __ ___ _ __ _ _ _//_ _  _ __(  )|_   	    ");
System.out.println("  					   /_/            			                            ");																	
System.out.println("                                                                            ");


		// Get the user's range
		System.out.println("Please enter your number(1-255): ");
		int range = keyboard.nextInt();
		//
		int position = 1; // Hold the position in the array for each element
		int elements = 0; // Take each number and check its binary equivalent and store it in the temp variable
		int num = 0; // Variable to hold each number 

	   // Will run until it reaches the specified range and should start from 1
		for(int i = 1; i <= range; i++) {
			// Set element to the value of each number in order to calcalute the binary convertion
			elements = i;
			for(int j = binary.length-1; j > 0; j--) { // Start from the last index to the first and replace each element in the array 
				if(elements % 2 == 1) { // If the remainder of the number when divide by 2 is equal to 1 set the temp variable to equal 1 
					temp = 1;
				}
				if(elements % 2 == 0) { // If the remainder of the number when divide by 2 is equal to 1 set the temp variable to equal 0
					temp = 0;
				}
				// Assign the value of temp for each element in the binary array
				binary[j] = temp;
				// Then divide it by 2 and test it again for the new value of the temp
				elements = elements/2;
				num = binary[j]; // Assign the value of the elements inside the binary array to num
			}
			System.out.print(i + " - "); // print out each number which will be converted
			// Copy the base2 conversion and then assign it a position in the baseTwo array 
			for(int k = 0; k < binary.length; k++) {
				baseTwo[position] = binary[k];
				System.out.print(" " + baseTwo[position]); // Print out the conversion next to the the number 
			}
			System.out.println();// Seperate each line 
		}// End of loop
		System.out.println("Thank you for using the binary calculator :-)");
		}// end of the main method 
	}