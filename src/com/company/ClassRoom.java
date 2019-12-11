package com.company;

import java.util.Arrays;

public class ClassRoom {
    Pupil[] pupils;
    int quantity;

    public ClassRoom(final int K) {
        this.pupils = new Pupil[K];
        this.quantity = 0;
    }

    public void add(Pupil pupil) {
        if (quantity < pupils.length) {
            pupils[quantity] = pupil;
            quantity++;
        }
    }

    public void resize(final int n) {
        Pupil[] new_people = new Pupil[n];
        System.arraycopy(pupils, 0, new_people, 0, (n > quantity) ? quantity : n);
        pupils = new_people;
    }

    @Override
    public String toString() {
        return "ClassRoom [" + quantity + "]\n{" +
                Arrays.toString(pupils) +
                '}';
    }
}
