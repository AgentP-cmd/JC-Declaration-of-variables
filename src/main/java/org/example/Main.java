package org.example;

public class Main {
    //instance declaration
    int instanceBinary;
    int instanceOctal;
    double instanceDouble;
    //static declaration
    static int staticHex;
    static int staticByte;
    static String staticString;

    public static void main(String[] args) {
    //local declaration
    int localDecimal;
    int localHex;
    int localBinary;
    int localOctal;
    long localLong;
    String localString;
    Main main = new Main();

        //local
        localDecimal = 100;
        localHex = 0XFF;
        localBinary = 0b1101;
        localOctal = 014;
        localLong = 10_000_000;
        localString = "Every step I take gets me closer to my goal.";

        //instance
        main.instanceBinary = 0b101101;
        main.instanceOctal = 072;
        main.instanceDouble = 1234.95;

        //static
        Main.staticHex = 0x1A2B;
        Main.staticByte = 1;
        Main.staticString = "Progress, not perfection";

        //printing
        System.out.println("Local Variables: ");
        System.out.println("\tlocalDecimal = " + localDecimal);
        System.out.println("\tlocalHex = " + localHex);
        System.out.println("\tlocalBinary = " + localBinary);
        System.out.println("\tlocalOctal = " + localOctal);
        System.out.println("\tlocalLong = " + localLong);
        System.out.println("\tlocalString = " + localString);

        System.out.println("Instance Variables: ");
        System.out.println("\tinstanceBinary = " + main.instanceBinary);
        System.out.println("\tinstanceOctal = " + main.instanceOctal);
        System.out.println("\tinstanceDouble = " + main.instanceDouble);

        System.out.println("Static Variable: ");
        System.out.println("\tstaticHex = " + Main.staticHex);
        System.out.println("\tstaticByte = " + Main.staticByte);
        System.out.println("\tstaticString = " + Main.staticString);

    }
}