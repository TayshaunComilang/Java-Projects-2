//Comilang, Tayshaun M.
//CICTS 1N-A
package com.mycompany.universitycoursetracker;

public class UniversityCourseTracker {

    public static void main(String[] args) {

        // Create a One-dimensional array for student names
        String[] studentNames = {"Kallex", "Melody", "Maeve", "Skyrie", "Rexon"};

        //Create a Two-dimensional array for grades
        int[][] grades = {
            {85, 90, 78}, //Grades for Kallex
            {91, 88, 84}, //Grades for Melody
            {75, 80, 89}, //Grades for Maeve
            {89, 92, 91}, //Grades for Skyrie
            {95, 86, 80}, //Grades for Rexon
        };

        //Display the student name and average grade
        System.out.println("Student Name   Average Grade\n");

        for (int i = 0; i < studentNames.length; i++) {
            int total = 0;

            // Sum the grades for each student
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }

            // Calculate the average
            double average = total / (double) grades[i].length;

            // Display the student's name and average grade
            System.out.printf("%-15s%.2f%n", studentNames[i], average);

        }
    }
}
