/*This program runs a code that prompts the user to enter a 4-digit integer for the year. If it is not a 4-digit integer,
 *the system will ask the user to prompt his/her answer again. Once the user enters a 4-digit integer, the system will 
 *output every date of every month except the dates that are a multiple of the number of the specific month. An exception
 *to the rule is February where if the year is a leap year (meaning when the year is divided by 4 and its remainder is 0), 
 *the maximum number of dates is 29. Otherwise, for common years (meaning when the year is divided by 4 and its remainder
 *is not 0), the maximum number of dates is 28.*/

package assignment3;

import java.util.*; //Scanner needs to be imported

public class assignment3code1
{
	public static void main (String[] args)
	{
		/*Scanner declared as Calendar*/
		Scanner Calendar = new Scanner(System.in);
		
		/*Formated output for header of the welcome message*/
		System.out.println("-------****-------****-------****-------****-----");
		System.out.println("      Welcome to Calendar Program!");
		System.out.println("-------****-------****-------****-------****-----\n");
		
		/*Asks user to input the 4-digit year*/
		System.out.println("Please enter a 4-digit year:");
		
		boolean YearValidity = true; //boolean declared as true
		
		/*Condition of first loop is when YearValidity is true*/
		while (YearValidity)
		{
			int year = Calendar.nextInt(); //user inputs integer associated with the imported scanner
			
			/*Condition for the second loop is when the input of 4-digit year between 0 and 9999 is true */
			while (year >= 0 && year < 10000)
			{
				/*Condition for the if statement: if the input of 4-digit year between 0 and 999 is true*/
				if (year >= 0 && year < 1000)
				{
					System.out.println("Please enter a 4-digit year:"); //prints a message that asks the user to input again
					year = year - 1000; //year becomes an integer that is not within the boundaries of the loop, thus it goes out of the 2nd loop and goes back to the first loop
				}
				/*Condition for the else statement: if the input of 4-digit year between 1000 and 9999 is true*/
				else if (year >= 1000 && year < 10000)
				{
					/*Prints all dates not multiple of 1 for January*/
					System.out.println("\n\nIn January, the dates are not multiple of 1 are:");
					System.out.println("No dates are found in this month!\n");
					
					/*Condition for if statement: if the remainder of the year divided by 4 is not 0 is true*/
					if (year % 4 != 0) //common year
					{
						/*Prints all dates not multiple of 2 for February*/
						System.out.println("In February in a common year, the dates are not multiple of 2 are:");
						System.out.println("1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27,\n");
					}
					/*Condition for the else statement: if the remainder of the year divided by 4 is 0 is true*/
					else if (year % 4 == 0) //leap year
					{
						/*Prints all dates not multiple of 2 for February*/
						System.out.println("In February in a leap year, the dates are not multiple of 2 are:");
						System.out.println("1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29,\n");
					}
					
					/*Prints all dates not multiple of 3 for March*/
					System.out.println("In March, the dates are not multiple of 3 are:");
					System.out.println("1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22,");
					System.out.println("23, 25, 26, 28, 29, 31,\n");
					
					/*Prints all dates not multiple of 4 for April*/
					System.out.println("In April, the dates are not multiple of 4 are:");
					System.out.println("1, 2, 3, 5, 6, 7, 9, 12, 11, 13, 14, 15, 17, 18, 19,");
					System.out.println("21, 22, 23, 25, 26, 27, 29, 30,\n");
					
					/*Prints all dates not multiple of 5 for May*/
					System.out.println("In May, the dates are not multiple of 5 are:");
					System.out.println("1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18,");
					System.out.println("19, 21, 22, 23, 24, 26, 27, 28, 29, 31,\n");
					
					/*Prints all dates not multiple of 6 for June*/
					System.out.println("In June, the dates are not multiple of 6 are:");
					System.out.println("1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17,");
					System.out.println("19, 20, 21, 22, 23, 25, 26, 27, 28, 29,\n");
					
					/*Prints all dates not multiple of 7 for July*/
					System.out.println("In July, the dates are not multiple of 7 are:");
					System.out.println("1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 15, 16, 17,");
					System.out.println("18, 19, 20, 22, 23, 24, 25, 26, 27, 29, 30, 31,\n");
					
					/*Prints all dates not multiple of 8 for August*/
					System.out.println("In August, the dates are not multiple of 8 are:");
					System.out.println("1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 17,");
					System.out.println("18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31,\n");
					
					/*Prints all dates not multiple of 9 for September*/
					System.out.println("In September, the dates are not multiple of 9 are:");
					System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16,");
					System.out.println("17, 19, 20, 21, 22, 23, 24, 25, 26, 28, 29, 30,\n");
					
					/*Prints all dates not multiple of 10 for October*/
					System.out.println("In October, the dates are not mutliple of 10 are:");
					System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16,");
					System.out.println("17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31,\n");
					
					/*Prints all dates not multiple of 11 for November*/
					System.out.println("In November, the dates are not multiple of 11 are:");
					System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16,");
					System.out.println("17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28, 29, 30,\n");
					
					/*Prints all dates not multiple of 12 for December*/
					System.out.println("In December, the dates are not multiple of 12 are:");
					System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16,");
					System.out.println("17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28, 29, 30, 31,\n");
					
					/*Prints a farewell message that thanks the user for using this program*/
					System.out.print("Thank you for using this program!!");
									
					year = year - 10000;
					YearValidity = false;
				}
			} //end of second while loop
		} //end of first while loop
		Calendar.close(); //close Scanner
	} //end of main
} //end of public class
