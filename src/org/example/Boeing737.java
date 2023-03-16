package org.example;

public class Boeing737 extends Boat {
    //Declares int at zero, later to be overwritten
    int wings = 0;

    //Defines all values to their respective types
    public Boeing737(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int inWings) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, inWings);
        wings = inWings;
    }

    //getWings returns the sails variable to establish it
    public int getWings() {
        return wings;
    }

    public void setWings(int inWings) {
        wings = inWings;
    }

    //Prints the number of Wings
    public String toString() {
        String result = super.toString() +
                "\nNumber of Wings: \t\t\t " + this.getWings();
        return result;
    }
}
