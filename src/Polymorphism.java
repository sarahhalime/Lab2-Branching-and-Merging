public class Polymorphism {
    // TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
        return p.getRole();
    }

    /**
     * Returns the student id if p is a Student.
     * Otherwise returns "Not a student".
     *
     * @param p the person
     * @return the student id or "Not a student"
     */
    public static String getStudentId(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            return s.getStudentId();
        }
        return "Not a student";
    }
}

class Person {
    public final String role = "General";
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }
}

class Student extends Person {
    public final String role = "Student";
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    public String getStudentId() {
        return this.studentId;
    }
}