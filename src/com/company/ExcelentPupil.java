package com.company;

public class ExcelentPupil extends Pupil {


    public ExcelentPupil(String name, int mark) {
        super(name, mark);
    }

    @Override
    void study() {
        System.out.println("Studies much");
    }

    @Override
    void read() {
        System.out.println("Reads fast");
    }

    @Override
    void write() {
        System.out.println("Writes accurate");
    }

    @Override
    void relax() {
        System.out.println("Never relaxes");
    }

    @Override
    public String toString() {
        return "Excelent " +
                super.toString() +
                ", good behaviour";
    }
}
