package com.company;

public class BadPupil extends Pupil {


    public BadPupil(String name, int mark) {
        super(name, mark);
    }

    @Override
    void study() {
        System.out.println("Studies bad");
    }

    @Override
    void read() {
        System.out.println("Doesn't read");
    }

    @Override
    void write() {
        System.out.println("Writes not accurate");
    }

    @Override
    void relax() {
        System.out.println("Usually relax");
    }

    @Override
    public String toString() {
        return "Bad " +
                super.toString() +
                ", very bad behaviour";
    }
}
