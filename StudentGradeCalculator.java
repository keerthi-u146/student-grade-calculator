import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int marks1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int marks2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int marks3 = input.nextInt();

        // Calculate total and percentage
        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        // Assign grade based on percentage
        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";

        // Display result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        input.close();
    }
}