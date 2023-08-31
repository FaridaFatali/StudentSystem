package org.example;

import java.time.LocalDate;

public class Student {
    protected int no;
    protected String nameSurname;
    protected int year;
    protected LocalDate dateOfBirth;
    protected String major;

    public Student(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        this.no = no;
        this.nameSurname = nameSurname;
        this.year = year;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    public Student() {
    }


    public String getNameSurname() {
        return nameSurname;
    }


    public void study() {
        System.out.println("The student is studying now!");
    }

    public void register() {
        System.out.println("The student is registered!");
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
