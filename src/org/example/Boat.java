package org.example;
// Car Class inherits from Vehicle Class
public class Boat extends Vehicle{
    int propeller = 4;

    boolean rudder = true;
    boolean radio = true;

    double mpg = 0.0; //has an extra variable, mpg

    public Boat(String inBrand, double inSpeed, int inPassengers, double inCargo,
               double inMPG, int inSails){
        super(inBrand, inSpeed, inPassengers, inCargo, inSails); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }
    //another additional variable
    public void setRudder(boolean inRudder){
        rudder = inRudder;
    }
    public boolean getRudder(){
        return rudder;
    }
    //another additional variable
    public void setRadio(boolean inRadio){
        radio = inRadio;
    }
    public boolean getRadio(){
        return radio;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (rudder)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public double getMPG(){
        if(radio)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG :\t\t\t" + this.getMPG();
        return result ;
    }
}