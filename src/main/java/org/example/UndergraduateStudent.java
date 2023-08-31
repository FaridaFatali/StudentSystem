package org.example;

import java.time.LocalDate;

public class UndergraduateStudent extends Student {
    protected String minor;

    public UndergraduateStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String minor) {
        super(no, nameSurname, year, dateOfBirth, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("Student is studying!");
    }

    @Override
    public void register() {
        System.out.println("Student is registered as an Undergraduate student!");
    }

    @Override
    public String toString() {
        return "STUDENT INFO:" +
                "\n-------------" +
                "\nNo - " + no +
                "\nName and surname - " + nameSurname +
                "\nDate of birth - " + dateOfBirth +
                "\nMajor - " + major +
                "\nMinor - " + minor +
                "\nYear - " + year;
    }
}
