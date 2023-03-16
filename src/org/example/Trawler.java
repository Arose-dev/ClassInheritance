package org.example;

public class Trawler extends Boat {
    //Declares int at zero, later to be overwritten
    int sails = 0;
    //Defines all values to their respective types
    public Trawler(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int inSails) {
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


    //Prints the number of sails
    public String toString() {
        String result = super.toString() +
                "\nNumber of Sails: \t\t\t " + this.getSails();
        return result;
    }
}