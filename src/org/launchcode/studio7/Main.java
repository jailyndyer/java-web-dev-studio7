package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("CD Test", "ABCD");
        DVD myDvd = new DVD("DVD Test", "DCBA");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myCd.storeData("WXYZ");
        myCd.readData();
        myCd.reportInformation();

        myDvd.spinDisc();
        myDvd.storeData("ZYXW");
        myDvd.readData();
        myDvd.reportInformation();

    }
}
