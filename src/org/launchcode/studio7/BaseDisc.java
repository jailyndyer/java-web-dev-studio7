package org.launchcode.studio7;

import java.util.*;

public class BaseDisc {
    private String name;
    private String capacity;
    private String discType;
    private String contents;

    public BaseDisc(String name, String capacity, String discType, String contents) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.contents = contents;
    }

    public BaseDisc() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
