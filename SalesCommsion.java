/**********************************************************************************************
 *Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Exercise #4: Sales commission
 * CIS 2600: Business Application Programming
 * Spring2020
 * Due date: 02/14/2020
 * Date Completed: 02/11/2020
 * **************************************************************
 * Program description 
 * This program prompts a text string to let you know how much your commission will be based on sales
 * Then the program asks you to input your sales and calculates your percentage commission based on the amount
 */
package salescommsion;



import java.util.Scanner;// importing the basic input output package 
public class SalesCommsion
{
    public static void main(String args[]) // this means that a certain method can potentially throw a certain exception
    {
          Scanner scr = new Scanner(System.in);// buffer reader is a class in java that reads text from a character input stream 
        System.out.println("With weekly sales between $3000 and $4999.99 you recieve");
        System.out.println("10% commission. With Sales of $5000 or more you recieve");
        System.out.println("20% commission.We will calculate your commission for this week.");
        System.out.println("=============================================================");
        System.out.println();
        System.out.print("How much sales did you this week? "); // after this print you will input a number
        String input = scr.nextLine(); // this asks you to input a string and br is buffer read then read line that you input
        if(!input.equals("")) // if the input you inputed does not equal blank value ""
        {
            double sales = Integer.parseInt(input); // declaring the sales a double and parsing the intiger as a single decimal intiger 
            double comm = 0; // this is initializing the commision variable as 0 at first
            System.out.println("=============================================================");
            System.out.println(); // creating a blank space line
            System.out.println("Total Weekly Sales: $"+sales); // printing out the sales value you input
            if(sales>=5000) // if the sales value you input is greater than  or equal to 5000 
            {
                comm = 20 * sales / 100; // then assign the commision that number times 20 / 100 to give you 20 percent
                System.out.println("Your 20% commission this week is $"+comm+", congratulations!"); // print out commision
            }
            else if(sales>=3000) // if the number is not greater than or equal to 5000 and is less than that then
            {
                comm = 20 * sales / 100; // find the commision 
                System.out.println("Your 10% commission this week is $"+comm+", congratulations!"); // print out the commssion 
            }
            else // one more else 
            {
                System.out.println("You do not qualify for a commission this week,"); // you did not get any commission 
                System.out.println("try again next week!");
            }
        }
    }
}