package org.example;

import java.time.LocalDate;

public class VocationalStudent extends Student {

    public VocationalStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        super(no, nameSurname, year, dateOfBirth, major);
    }

    @Override
    public void study() {
        System.out.println("Student is studying!");
    }

    @Override
    public void register() {
        System.out.println("Student is registered as a Vocational Student!");
    }

    @Override
    public String toString() {
        return "STUDENT INFO:" +
                "\n-------------" +
                "\nNo - " + no +
                "\nName and surname - " + nameSurname +
                "\nDate of birth - " + dateOfBirth +
                "\nMajor - " + major +
                "\nYear - " + year;
    }
}
