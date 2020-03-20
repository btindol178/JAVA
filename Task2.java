import java.util.Scanner;


public class Task2
{
    // The entry point of the Java application
    public static void main(String[] args) 
	{
        //Step #1: Declare variables for storing input from user
             double value1, value2;
             
                     
		//Step #2: Use Scanner class object to obtain user input
               Scanner input = new Scanner(System.in);
               System.out.print("Please enter 1st integer: ");
               value1 = input.nextDouble();
               System.out.print("Please enter 2nd integer: ");
               value2 = input.nextDouble();
        //Step #6: Call doCalculation mathod and feed the method with two arguments entered by user
         doCalculation(value1,value2);
                 
    }
	
	//Step #3: Implement a NO RETURN method called doCalculation to accept two arguments 
    public static void doCalculation(double value1, double value2)
	{
       //Step #4: Perform arithmetic operations and show outputs
	   double add = value1 + value2;
           double subtract = value1 - value2;
           double multiply = value1 * value2;
           double divide = value1/value2;
	   //Step #5: Show result to the console using System.out class
           System.out.println("The result of " + value1 + " + " + value2 + " is " + add);
           System.out.println("The result of " + value1 + " - " + value2 + " is " + subtract);
           System.out.println("The result of " + value1 + " * " + value2 + " is " + multiply);   
           System.out.println("The result of " + value1 + " / " + value2 + " is " + divide);
          
    }
}
