package com.company;

public class Pupil {
    String name;
    int mark;

    public Pupil(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    void study() {
        System.out.println("Study");
    }

    void read() {
        System.out.println("Read");
    }

    void write() {
        System.out.println("Write");
    }

    void relax() {
        System.out.println("Relax");
    }

    @Override
    public String toString() {
        return "Pupil { " + name + ", mark =" + this.mark + '}';
    }
}
