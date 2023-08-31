package org.example;

import java.time.*;

public class RegistrationOffice {

    public RegistrationOffice() {
    }

    public Student getAStudent() {
        Student student = new Student();
        int i = (int) (5 * Math.random());
        LocalDate birthDate;

        switch (i) {
            case 1 -> {
                birthDate = LocalDate.of(2000, Month.AUGUST, 28);
                student = new VocationalStudent(101, "Jonathan Stevens", 2022, birthDate, "Math");
                if (student instanceof VocationalStudent vocationalStudent) {
                    vocationalStudent.register();
                    vocationalStudent.study();
                    System.out.println();
                    System.out.println(vocationalStudent);
                }
            }
            case 2 -> {
                birthDate = LocalDate.of(1998, Month.MAY, 12);
                student = new UndergraduateStudent(108, "Jennifer Davis", 2020, birthDate, "IT", "Programming");
                if (student instanceof UndergraduateStudent undergraduateStudent) {
                    undergraduateStudent.register();
                    undergraduateStudent.study();
                    System.out.println();
                    System.out.println(undergraduateStudent);
                }
            }
            case 3 -> {
                birthDate = LocalDate.of(1997, Month.JANUARY, 22);
                student = new GraduateStudent(118, "Jon Robertson", 2018, birthDate, "Psychology", "Jonathan Malbro", "The psychology of nations");
                if (student instanceof GraduateStudent graduateStudent) {
                    graduateStudent.register();
                    graduateStudent.study();
                    System.out.println();
                    System.out.println(graduateStudent);
                }
            }
            case 4 -> {
                birthDate = LocalDate.of(1994, Month.FEBRUARY, 1);
                student = new MasterStudent(120, "Angelica Gonzales", 2015, birthDate, "Geography", "Regina Melton", '"' + "Rare natural phenomena" + '"');
                if (student instanceof MasterStudent masterStudent) {
                    masterStudent.register();
                    masterStudent.study();
                    System.out.println();
                    System.out.println(masterStudent);
                }
            }
            case 5 -> {
                birthDate = LocalDate.of(1992, Month.APRIL, 4);
                student = new PhdStudent(134, "Malena Brown", 2012, birthDate, "Journalism", "Roberto Gray", '"' + "A history of American journalism" + '"', true);
                if (student instanceof PhdStudent phdStudent) {
                    phdStudent.register();
                    phdStudent.study();
                    System.out.println();
                    System.out.println(phdStudent);
                }
            }
        }
        return student;
    }

    public void registerStudent() {
        int i = (int) (5 * Math.random());
        LocalDate birthDate;

        Student student;
        switch (i) {
            case 1 -> {
                birthDate = LocalDate.of(2000, Month.AUGUST, 28);
                student = new VocationalStudent(101, "Jonathan Stevens", 2022, birthDate, "Math");
                System.out.println("The student has been registered successfully as a Vocational Student!");
                System.out.println();
                System.out.println("STUDENT INFO:" +
                        "\n-------------" +
                        "\nNo - " + student.no +
                        "\nName and surname - " + student.nameSurname +
                        "\nDate of birth - " + student.dateOfBirth +
                        "\nMajor - " + student.major);
            }
            case 2 -> {
                birthDate = LocalDate.of(1998, Month.MAY, 12);
                student = new UndergraduateStudent(108, "Jennifer Davis", 2020, birthDate, "IT", "Programming");
                System.out.println("The student has been registered successfully as an Undergraduate Student!");
                System.out.println();
                System.out.println("STUDENT INFO:" +
                        "\n-------------" +
                        "\nNo - " + student.no +
                        "\nName and surname - " + student.nameSurname +
                        "\nDate of birth - " + student.dateOfBirth +
                        "\nMajor - " + student.major);
            }
            case 3 -> {
                birthDate = LocalDate.of(1997, Month.JANUARY, 22);
                student = new GraduateStudent(118, "Jon Robertson", 2018, birthDate, "Psychology", "Jonathan Malbro", "The psychology of nations");
                System.out.println("The student has been registered successfully as a Graduate Student!");
                System.out.println();
                System.out.println("STUDENT INFO:" +
                        "\n-------------" +
                        "\nNo - " + student.no +
                        "\nName and surname - " + student.nameSurname +
                        "\nDate of birth - " + student.dateOfBirth +
                        "\nMajor - " + student.major);
            }
            case 4 -> {
                birthDate = LocalDate.of(1994, Month.FEBRUARY, 1);
                student = new MasterStudent(120, "Angelica Gonzales", 2015, birthDate, "Geography", "Regina Melton", "Rare natural phenomena.");
                System.out.println("The student has been registered successfully as a Master Student!");
                System.out.println();
                System.out.println("STUDENT INFO:" +
                        "\n-------------" +
                        "\nNo - " + student.no +
                        "\nName and surname - " + student.nameSurname +
                        "\nDate of birth - " + student.dateOfBirth +
                        "\nMajor - " + student.major);
            }
            case 5 -> {
                birthDate = LocalDate.of(1992, Month.APRIL, 4);
                student = new PhdStudent(134, "Malena Brown", 2012, birthDate, "Journalism", "Roberto Gray", "A history of American journalism", true);
                System.out.println("The student has been registered successfully as a Ph.D. Student!");
                System.out.println();
                System.out.println("STUDENT INFO:" +
                        "\n-------------" +
                        "\nNo - " + student.no +
                        "\nName and surname - " + student.nameSurname +
                        "\nDate of birth - " + student.dateOfBirth +
                        "\nMajor - " + student.major);
            }
            default -> System.out.println("No student has been registered!");
        }
    }
}
