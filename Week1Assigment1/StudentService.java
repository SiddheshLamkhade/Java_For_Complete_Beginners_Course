package Week1Assigment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentService {

    Student[] stuarr=new Student[10];



    /*private  enum  Course{
        Computer_Science,IT,ENTC,Mechanical
    }*/
    int i=0;
    int id=0;

    public void addStudent(){
        Student stu=new Student();
        Scanner sc=new Scanner(System.in);
        for(Student s: stuarr){
            if(s.equals(stu)){
                return;
            }
        }
        stu.setId(id);
        System.out.println("Enter first name: ");
        stu.setFirstname(sc.nextLine());
        System.out.println("Enter last name");
        stu.setLastname(sc.nextLine());
        System.out.println("Enter course");
        /*Course coursee=sc.next();
        for (Course c: Course.values()){
            if(c.name().equalsIgnoreCase(coursee)){
                stu.setCourse(coursee);
            }
        }*/

        stu.setCoursee(sc.nextLine());

        stuarr[i]=stu;
        i++;
        id++;
    }

    public void display() {
        for(Student stuinfo: stuarr){
            if (stuinfo != null) {
                System.out.println(stuinfo.toString());
            }
        }

    }

    public void saveinfile() throws IOException {
        FileWriter fw=new FileWriter("file.txt");
        for(Student s:stuarr){
            fw.write(s+" ");
        }
        File file = new File("file.txt");
        Scanner sc = new Scanner(file,"UTF-8");

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
        fw.close();
    }


}
