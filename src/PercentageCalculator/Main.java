package PercentageCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the total possible marks for each subject: ");
        double totalPossibleMarks = scanner.nextDouble();
        scanner.nextLine();
        Student student = new Student(studentName, totalPossibleMarks);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            String subjectName = scanner.nextLine();

            System.out.print("Enter marks for " + subjectName + ": ");
            double marks = scanner.nextDouble();
            scanner.nextLine();
            student.addSub(new Subject(subjectName, marks));
        }
        double totalMarks = student.getTotalMarks();
        double totalPossibleMarksOverall = student.getTotalPossibleMarks();
        double percentage = CalculatePercentage.calculatePercentage(totalMarks, totalPossibleMarksOverall);

        System.out.printf("Student: %s%n", student.getName());
        System.out.printf("Total Marks Obtained: %.2f%n", totalMarks);
        System.out.printf("Total Possible Marks: %.2f%n", totalPossibleMarksOverall);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        scanner.close();
    }
}
