package com.company;

public class Main {

    public static void main(String[] args) {
        Pupil pupil = new Pupil("Stas", 12);
        ExcelentPupil excelentPupil = new ExcelentPupil("Stas", 12);
        GoodPupil goodPupil = new GoodPupil("Misha", 9);
        BadPupil badPupil = new BadPupil("Vlad", 2);

//        System.out.println(pupil);
//        pupil.read();
//        pupil.write();
//        pupil.study();
//        pupil.relax();
//        System.out.println();
//        System.out.println(excelentPupil);
//        System.out.println(goodPupil);
//        System.out.println(badPupil);

/*        System.out.println("\nClassroom:");
        Pupil [] pupils = new Pupil[3];
        pupils[0] = excelentPupil;
        pupils[1] = goodPupil;
        pupils[2] = badPupil;

        for (int i = 0; i < pupils.length; i++) {
            System.out.println(pupils[i] );
        }*/

        System.out.println("----------------------");
        ClassRoom classRoom = new ClassRoom(3);
        classRoom.add(excelentPupil);
        classRoom.add(goodPupil);
        classRoom.add(badPupil);
        System.out.println(classRoom);

        System.out.println("After resize:");
        classRoom.resize(2);
        classRoom.add(new Pupil("New", 10));
        System.out.println(classRoom);

    }
}
