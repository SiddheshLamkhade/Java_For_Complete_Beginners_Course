package Week1Assigment1;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    //private Course course;
    private String coursee;


    private  enum  Course{
        Computer_Science,IT,ENTC,Mechanical
    }
    Student(){
    }
    Student(int id, String firstname, String lastname,String c){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.coursee=c;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCoursee() {
        return coursee;
    }

    public void setCoursee(String coursee) {
        this.coursee = coursee;
    }

    public String toString() {
        return "ID: " + id +
                "            First Name: " + firstname +
                "            Last Name: " + lastname +
                "            Course: " + coursee;
    }
}
