package org.example;
// Car Class inherits from Vehicle Class
public class Airplane extends Vehicle{
    int wheels = 6;
    String color = "White";
    boolean radio = true;
    boolean propellers = false;

    double mpg = 0.0; //has an extra variable, mpg

    public Airplane(String inBrand, double inSpeed, int inPassengers, double inCargo,
               double inMPG, int inWings){
        super(inBrand, inSpeed, inPassengers, inCargo, inWings); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }
    //another additional variable
    public void setRadio(boolean inRadio){
        radio = inRadio;
    }
    public boolean getRadio(){
        return radio;
    }
    //another additional variable
    public void setSail(boolean inSail){
        propellers = inSail;
    }
    public boolean getSail(){
        return propellers;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (radio)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public double getMPG(){
        if(propellers)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //usesd the super toString, as well as addingnthe new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG :\t\t\t" + this.getMPG();
        return result ;
    }
}