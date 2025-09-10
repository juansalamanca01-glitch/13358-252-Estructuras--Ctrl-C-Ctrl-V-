// ===============================
// Main Class
// ===============================

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a list of 10 students
        Student[] students = {
                new Student(20, 3, 2, 12, 30, "Software Engineering", 101),
                new Student(22, 6, 3, 25, 20, "Law", 102),
                new Student(19, 2, 1, 8, 34, "Medicine", 103),
                new Student(24, 8, 4, 35, 10, "Architecture", 104),
                new Student(21, 5, 2, 20, 25, "Business", 105),
                new Student(23, 7, 5, 28, 12, "Nursing", 106),
                new Student(18, 1, 1, 5, 38, "Psychology", 107),
                new Student(25, 9, 6, 40, 5, "Economics", 108),
                new Student(26, 10, 4, 45, 2, "Education", 109),
                new Student(20, 4, 2, 15, 27, "Engineering", 110)
        };

        System.out.println("==== Original List of Students ====");
        for (Student s : students) s.printStudent();

        // Bubble Sort by Age
        Student[] bubbleSorted = Arrays.copyOf(students, students.length);
        SortingAlgorithms.bubbleSortByAge(bubbleSorted);
        System.out.println("\n==== Bubble Sort by Age (Ascending) ====");
        for (Student s : bubbleSorted) s.printStudent();

        // Insertion Sort by Semester
        Student[] insertionSorted = Arrays.copyOf(students, students.length);
        SortingAlgorithms.insertionSortBySemester(insertionSorted);
        System.out.println("\n==== Insertion Sort by Semester (Descending) ====");
        for (Student s : insertionSorted) s.printStudent();

        // Linear Search by ProgramId
        System.out.println("\n==== Linear Search by ProgramId (105) ====");
        Student foundLinear = SearchingAlgorithms.linearSearchByProgramId(students, 105);
        if (foundLinear != null) {
            System.out.println("Student found:");
            foundLinear.printStudent();
        } else {
            System.out.println("Student not found.");
        }

        // Binary Search by Age
        System.out.println("\n==== Binary Search by Age (21) ====");
        // Must sort first by Age
        SortingAlgorithms.bubbleSortByAge(students);
        Student foundBinary = SearchingAlgorithms.binarySearchByAge(students, 21);
        if (foundBinary != null) {
            System.out.println("Student found:");
            foundBinary.printStudent();
        } else {
            System.out.println("Student not found.");
        }
    }
}
