/***************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Lab #2: Java 
 * CIS 2600: Business Application Programming
 * Spring 2020
 * Due data: 01/26/2020
 * Date completed: 01/24/2020
 * Program Explanation
 * This program takes 4 different declared variables and lets the user input the variables to calculate the BMI of the user
 ********************/
import java.util.Scanner;


public class Exercise2 {

 // entry point of java application
    public static void main(String[] args) {
       // declare variables for storing input from user
       int age; // here we declare age as int because using double results in 28.0
       double weight, height; // here we declare weight and height as double 
        
       Scanner input = new Scanner(System.in); // here we create a new scanner function allowing information to go into the system
       
       System.out.print("Please enter your name: "); // here we print enter your name
       String name = input.nextLine(); // here we allow name to be a string by declaring it as string and using nextLine() 
       
       System.out.print("Please enter your age: "); // here we print enter your age
       age = input.nextInt(); // age is already declared above and so we use nextInt() to imput the number
              
       System.out.print("Please enter your weight in lbs: ");// here we print enter your weight in lbs because the formula is specific
       weight = input.nextDouble(); // here we use weight as double and input weight
       
       System.out.print("Please enter your height in inches: "); // here we print height in inches 74.2
       height = input.nextDouble(); // here we input the height

       double BMI = weight * 703 / (height * height); // here we use the formula but re arrange it for pemdas 
       System.out.print(name + "," + age + " years old" +"\n"); // here we print name, age years old then start a new line
       System.out.print("Body Mass Index is " + BMI+"\n"); // here we print body mass index is (bmi number) and start a new line that we dont technically need 

    
    }
    
}
