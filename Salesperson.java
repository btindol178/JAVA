/*
 *
 */
package createsalesperson;

public class Salesperson { // making a sales person class to hold the information about sales persons 

    private String name; // Initializing private values to not be touched for the three inputs
    private char[] ID; // initializing charachter array for id
    private float annualSales; // initializing float for sales 

    public Salesperson(String name, char[] ID, float annualSales) { // declare a constructor method 
        this.name = name; // this holds the current value of name id and annual sales for later use
        this.ID = ID;
        this.annualSales = annualSales;
    }

    public String getName() { // getter to hold the input name until the user wants to compare it or use it
        return name;
    }

    public void setName(String name) { // the set method for name that holds the this.name vale of name for using the getname method
        this.name = name;
    }

    public char[] getID() { // the same thing execpt for the ID 
        return ID;
    }

    public void setID(char[] ID) { // same thing for set except for ID as well 
        this.ID = ID;
    }

    public float getAnnualSales() { // same here
        return annualSales;
    }

    public void setAnnualSales(float annualSales) { // same
        this.annualSales = annualSales;
    }

    private static String convertToString(char[] input) {  //this converts to string
        StringBuilder sb = new StringBuilder(input.length); //using the string builder method declare a sb variable and make a new string builder and get the input.length
        for (char c : input) { // for each value in input.length
            sb.append(c); // append each value to string
        }
        return sb.toString(); // return ouput
    }

    public String toString() { // this method is used in the displayRecords() to output the information in the array in the format needed
        return "ID #" + convertToString(this.getID()) + "\t\t" + this.getName() + "\t\t" + this.getAnnualSales(); // getting the three values for database and letting us show them 
    }
}
