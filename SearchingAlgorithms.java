// ===============================
// Searching Algorithms
// ===============================
public class SearchingAlgorithms {

    // Linear Search by ProgramId
    public static Student linearSearchByProgramId(Student[] students, int programId) {
        for (Student student : students) {
            if (student.programId == programId) {
                return student;
            }
        }
        return null; // Not found
    }

    // Binary Search by Age (array must be sorted by age first)
    public static Student binarySearchByAge(Student[] students, int age) {
        int left = 0, right = students.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (students[mid].age == age) {
                return students[mid];
            } else if (students[mid].age < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }
}
