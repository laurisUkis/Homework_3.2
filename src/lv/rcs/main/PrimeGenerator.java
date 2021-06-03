package lv.rcs.main;

import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int status = 1, x = 3;
		boolean isNotValid;

		System.out.print("Enter the number of prime numbers you want to generate - up to 100 prime numbers: ");
		int thisMany = sc.nextInt();

		if (thisMany > 100 || thisMany < 0) {  											
			isNotValid = true;															
		}																				
																							
		else {																				
			isNotValid = false;																
																									
		}																							
																						
		while (isNotValid) {															
			System.out.print("You might be out of bounds. Please try again: ");			//checks if the numbers is between 0 and 100 else error message
			thisMany = sc.nextInt();																
			if (thisMany > 100 || thisMany < 0) {												
				isNotValid = true;																
			}																			
																						
			else {																		
				isNotValid = false;														
																						
			}																				
		}																				

		sc.close();

		if (thisMany >= 1) {
			System.out.println("First " + thisMany + " prime numbers are:");
			System.out.print(2 + " ");                                                 // initialize the first prime number
		}

		for (int count = 2; count <= thisMany;) {									
			for (int j = 2; j <= Math.sqrt(x); j++) {								
				if (x % j == 0) {													// checking if the number is not prime
					status = 0;														
					break;																
				}
			}
			if (status != 0) {														//if is prime
				System.out.print(x + " ");											       //print out
				count++;															
			}
			status = 1;																
			x++;																	
		}
	}

}
