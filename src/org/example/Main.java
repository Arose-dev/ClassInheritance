package org.example;

public class Main {
    public static void main(String[] args){

    TeslaModelY  modelY = new TeslaModelY("Tesla, Model Y", 155.0, 5,1239.0, 127.0, 1);
    eCascadia semiT = new eCascadia("Freightliner, eCascadia", 65.0, 2, 82000.0, 230.0, 2);

    Boeing737 passenP = new Boeing737("Boeing, Boeing 737", 588.0, 188, 52800.0, 65.5, 2);
    CirrusSR22 privP = new CirrusSR22("Cirrus, SR22", 207.0,  5, 1324, 15.0, 2);

    PACIFIC950 militaryB = new PACIFIC950("BAE Systems, PACIFIC950", 51.0, 6, 6000.0, 30.0, 0);
    Trawler privB = new Trawler("Selene, Trawler", 13.8, 10, 5000, 4.0, 0);

    //Prints all the values of the vehicles
    System.out.println(modelY);
        System.out.println();
    System.out.println(semiT);
        System.out.println();
    System.out.println(passenP);
        System.out.println();
    System.out.println(privP);
        System.out.println();
    System.out.println(militaryB);
        System.out.println();
    System.out.println(privB);



    }
}