package org.example;

// Boat Class inherits from PACIFIC950 Class
public class PACIFIC950 extends Boat {
    //Declares int at zero, later to be overwritten
    int sails = 0;

    //Defines all values to their respective types
    public PACIFIC950(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int inSails) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, inSails);
        sails = inSails;
    }

    //getSails returns the sails variable to establish it
    public int getSails() {
        return sails;
    }

    public void setSails(int inSails) {
        sails = inSails;
    }

    //prints the number of sails
    public String toString() {
        String result = super.toString() +
                "\nNumber of Sails: \t\t\t " + this.getSails();
        return result;
    }
}
