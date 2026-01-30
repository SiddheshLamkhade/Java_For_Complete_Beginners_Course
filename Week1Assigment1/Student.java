package Week1Assigment1;

public class Student {

    private int id;
    private String firstname;
    private String lastname;

    private Course[] courses = new Course[4];
    private int courseCount = 0;

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public boolean addCourse(Course course) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i] == course) {   // logical equality for enum
                return false;
            }
        }
        courses[courseCount++] = course;
        return true;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id)
                .append("  First Name: ").append(firstname)
                .append("  Last Name: ").append(lastname)
                .append("  Courses: ");

        for (int i = 0; i < courseCount; i++) {
            sb.append(courses[i]).append(" ");
        }
        return sb.toString();
    }
}
