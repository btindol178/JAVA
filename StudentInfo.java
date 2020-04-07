/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;

public class StudentInfo {

    protected String WIN;
    protected String FirstName;
    protected String LastName;
    protected double GPA;

    public StudentInfo(String WIN, String FirstName, String LastName, double GPA) {
        this.WIN = WIN;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.GPA = GPA;
    }
    // your typical getters and setters like previous exercises

    public String getWIN() {
        return WIN;
    }

    public void setWIN(String WIN) {
        this.WIN = WIN;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override   // 
    public String toString() { // this method will be used in the display method!
        String exceedsvalue = "WIN: " + getWIN() + " | Name: " + getFirstName() + " " + getLastName() + " | GPA: " + getGPA() + " | ";
        if (getGPA() < 2.0) {        // if gpa less than 2 then falls short by then minus that by 2
            exceedsvalue += " Falls Short by: " + (2.0 - getGPA());
        } else if (getGPA() >= 2.0) {            // if gpa greater than 2 then reverse and get opposite
            exceedsvalue += " Exceeds by: " + (getGPA() - 2.0);
        }
        return exceedsvalue;
    }

    public String toCSVString() {       // this method is used when writing the file giving it format for when puting information into txt because some of the information is different variable type
        return getWIN() + "," + getFirstName() + "," + getLastName() + "," + getGPA();   // and output here
    }

}
