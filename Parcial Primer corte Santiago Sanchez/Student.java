// ===============================
// Student Class
// ===============================
public class Student {
    int age;
    int semester;
    int socioEconomicStratum;
    int coursesCompleted;
    int coursesPending;
    String program;
    int programId;

    public Student(int age, int semester, int socioEconomicStratum, int coursesCompleted,
                   int coursesPending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

    // Method to print student info
    public void printStudent() {
        System.out.println("ProgramId: " + programId +
                ", Program: " + program +
                ", Age: " + age +
                ", Semester: " + semester +
                ", Stratum: " + socioEconomicStratum +
                ", Courses Completed: " + coursesCompleted +
                ", Courses Pending: " + coursesPending);
    }
}
