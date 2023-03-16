package org.example;

public class TeslaModelY extends Car {
    //Declares int at zero, later to be overwritten
    int ElectricM = 0;
    //Defines all values to their respective types
    public TeslaModelY(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG, int inElectricM) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG, inElectricM);
        ElectricM = inElectricM;
    }

    //getElectricM returns the sails variable to establish it
    public int getElectricM(){
        return ElectricM;
    }
    public void setElectric(int inElectricM) {
        ElectricM = inElectricM;
    }

    //Prints the number of electric motors
    public String toString() {
        String result = super.toString() +
                "\nNumber of Electric Motors: \t\t\t " + this.getElectricM();
        return result;
    }
}



