package org.launchcode.studio7;

import java.lang.System.*;
import java.util.*;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, String contents) {
        super.setName(name);
        super.setCapacity("700 MB");
        super.setDiscType("CD");
        super.setContents(contents);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm." + "\n");
    }

    @Override
    public void storeData(String data) {
        super.setContents(data);
    }

    @Override
    public void readData() {
        System.out.println(super.getContents() + "\n");
    }

    @Override
    public void reportInformation() {
        System.out.println("The name of the disc is: " + super.getName() + "\n");
        System.out.println("The capacity of the disc is: " + super.getCapacity() + "\n");
        System.out.println("The contents of the disc is: " + super.getContents() + "\n");
        System.out.println("The disc type is: " + super.getDiscType() + "\n");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
