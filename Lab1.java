/********************************************************
 *Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Lab #1 : Welcome to Java
 * CIS 2600: Business Application Programming
 * Spring 2020
 * Due date: 02/06/2020 
 * Date completed: 02/02/2020
************************************************************
* Program Explanation 
 */

package lab1;

import java.util.Scanner;
/**
 *
 * @author blake
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Step #1: Declare variables for storing input from user
             String value1;
             double value2, value3, value4;
		
		//Step #2: Use Scanner class object to obtain user input
               Scanner input = new Scanner(System.in);
               System.out.println("Please enter Name of the Job: ");
               value1 = input.nextLine();
               System.out.println("Please enter Cost of Materials: ");
               value2 = input.nextDouble();
               System.out.println("Please enter Number of hours needed: ");
               value3 = input.nextDouble();
               System.out.println("Please enter Number of hours travel time: ");
               value4 = input.nextDouble();
               
               double Cost = (value2 + 35 * value3) + (value4 * 12);
               System.out.println("The cost of the repair is: " + "$" + Cost);
    }
    
}
