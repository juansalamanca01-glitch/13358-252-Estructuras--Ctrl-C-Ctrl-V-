// ===============================
// Sorting Algorithms
// ===============================
public class SortingAlgorithms {

    // Bubble Sort by Age (ascending)
    public static void bubbleSortByAge(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].age > students[j + 1].age) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort by Semester (descending)
    public static void insertionSortBySemester(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].semester < key.semester) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}
