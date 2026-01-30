package Week1Assigment1;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Course Enrollment System.");

        int ch=123;
        StudentService ss=new StudentService();

        do{
            System.out.println("Kindly press following options");
            System.out.println("Press 1: To add Enrollement");
            System.out.println("Press 2: To display student details");
            System.out.println("Press 3: To save the data to a file");
            System.out.println("Press 0 or exit : To Exit form this System");
            System.out.print("Enter your option : ");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    ss.addStudent();
                    break;
                case 2:
                    System.out.println();
                    ss.display();
                    System.out.println();
                    break;
                case 3:
                    ss.saveinfile();
                    break;

                default:
                    System.out.println("Kindly enter valid option");
            }

        }while(ch!=0);
        System.out.println("Thank You..... Exiting from the system....");

    }
}
