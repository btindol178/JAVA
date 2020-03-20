/******************************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Lab#1: java for world domination
 * CIS 2600: Business Application Programming
 * Spring 2020
 * Due data: 02/06/2020
 * Date Completed: 02/02/2020
 **************************************************************************************************************
 * Program Explanation
 * This program takes input calculation inputs using a method and then the method calculation is called in the main method to give a estimate price
*/
package lab1blake;

import java.util.Scanner;

// Create a class called estimate for estimating price of job
class Estimate
{

// create a method to be used inside the main method for calculation
public static double estimatecalculation(double materials,double hours,double travel)
{
double cost=materials+hours*35+travel*12; // this is the calculation process
return cost; // this returns the cost 
}

public static void main(String args[])
{

Scanner scan=new Scanner(System.in); // create Scanner 

System.out.print("\n================================================="); //making the reciept
System.out.print("\n       Welcome to Blake's Home Repair Shop       ");
System.out.print("\n=================================================");
System.out.print("\nTo accurately estimate your total cost of the job");
System.out.print("\nPlease enter following:");
System.out.print("\n=================================================\n");

System.out.print("Enter the Name of Job: ");
String jobname=scan.next(); //  text imput

System.out.print("\nEnter Material Cost: ");
double materials=scan.nextDouble(); // input material cost

System.out.print("\nEnter No. of Hours for Work: ");
double hours=scan.nextDouble(); // input the hours it will take 

System.out.print("\nEnter No. of Hours Travel Time: ");
double travel=scan.nextDouble(); // input the time to travel 

double estimateprice=estimatecalculation(materials,hours,travel); //here we call the method estimate calculation and assign it to estimateprice

System.out.println("\n Home Repair Estimates Price");
System.out.println("\n Job Name: "+jobname); // Display Job Name
System.out.println("\n Estimated Price: $"+estimateprice); // Display estimated price
}
}