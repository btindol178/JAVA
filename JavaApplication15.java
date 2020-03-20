/******************************************************************************************
 * Programmer: Blake Tindol
 * BroncoNetID: bwy8022
 * Exercise03: Java for world domination
 * CIS 2600: Business application programming
 * Spring 2020
 * Due Date: 2/6/2020
 * Date Completed: 2/4/2020
 *****************************************************************************************
 * Program Explanation
 * This program takes values assigned by the new Student class and displays them and depending on the input
 * if there is only one of two of the three variables there will be default value assigned 
 * this is possible through the use of constructor method
 * **************************************************************************************/
package javaapplication15;



public class JavaApplication15 {

    public static void main(String[] args) {
    //Create objects to call the Student class
      Student first = new Student(2020,"Analytics",3.9); //call first method contstructor with in string and int
      Student second = new Student(2020, "Analytics"); // calling second constructor with int and string 
      Student third = new Student(2020);// calling third method constructor with one int input
      ;

      first.display(); // allows you to display the output called in the main class 
      second.display();
      third.display();
     ;
    }
    
}
