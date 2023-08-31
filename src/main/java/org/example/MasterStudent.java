package org.example;

import java.time.LocalDate;

public class MasterStudent extends GraduateStudent {

    public MasterStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis) {
        super(no, nameSurname, year, dateOfBirth, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Student is studying!");
    }

    @Override
    public void register() {
        System.out.println("Student is registered as a Master student!");
    }

    @Override
    public void writeThesis() {
        System.out.println("The student wrote thesis about: " + '"' + thesis + '"');
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("The student's advisor is " + advisor);
    }

    @Override
    public String toString() {
        return "STUDENT INFO:" +
                "\n-------------" +
                "\nNo - " + no +
                "\nName and surname - " + nameSurname +
                "\nDate of birth - " + dateOfBirth +
                "\nMajor - " + major +
                "\nYear - " + year +
                "\nThesis - " + thesis +
                "\nAdvisor - " + advisor;
    }
}
