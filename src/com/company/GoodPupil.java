package com.company;

public class GoodPupil extends Pupil {

    public GoodPupil(String name, int mark) {
        super(name, mark);
    }

    @Override
    void study() {
        System.out.println("Studies nice");
    }

    @Override
    void read() {
        System.out.println("Reads not much and not fast");
    }

    @Override
    void write() {
        System.out.println("Writes with little mistakes");
    }

    @Override
    void relax() {
        System.out.println("Has time to relax");
    }

    @Override
    public String toString() {
        return "Good " +
                super.toString() +
                ", quite nice behaviour";
    }
}
