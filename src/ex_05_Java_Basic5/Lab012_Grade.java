package ex_05_Java_Basic5;

public class Lab012_Grade {
    public static void main(String[] args) {
        // Create a grade calculator with the correct grading system
        /**
         * A: 90-100
         * B: 80-89
         * C: 70-79
         * D: 60-69
         * F: 0-59
         */
        int marks = 45;

        // Using ternary operator for grade assignment
        String grade = (marks >= 90) ? "A" :
                (marks >= 80) ? "B" :
                        (marks >= 70) ? "C" :
                                (marks >= 60) ? "D" : "F";

        // Print the result
        System.out.println("Grade: " + grade);
    }
}
