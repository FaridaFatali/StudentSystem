package org.example;

import java.time.LocalDate;

public class PhdStudent extends GraduateStudent {
    protected boolean qualifyingExamTaken;

    public PhdStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, nameSurname, year, dateOfBirth, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        System.out.println("Student is studying!");
    }

    @Override
    public void register() {
        System.out.println("Student is registered as a Ph.D. student!");
    }

    @Override
    public void writeThesis() {
        System.out.println("The student wrote thesis about: " + '"' + thesis + '"');
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("The student's advisor is " + advisor);
    }

    public void writePaper() {
        System.out.println("The student is starting to write the research paper...");
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
                "\nAdvisor - " + advisor +
                "\nQualifying exam taken - " + qualifyingExamTaken;
    }
}
