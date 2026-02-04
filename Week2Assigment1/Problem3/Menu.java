package Week2Assigment1.Problem3;

import java.util.Scanner;

public class Menu {
    static void main() {
        System.out.println("press 1 to access the details of FullTimeEmployee");
        System.out.println("press 2 to access the details of PartTimeEmployee");
        Scanner input= new Scanner(System.in);
        int ip=input.nextInt();
        if(ip==1){
            Employee obj=new FullTimeEmployee();
            System.out.println("Enter id : ");
            obj.id=input.nextInt();
            System.out.print("Enter name : ");
            obj.name=input.next();
            System.out.print("Enter surname : ");
            obj.surname=input.next();
            obj.calculateSalary();
            obj.displayDetails();
        }else if(ip==2){
            Employee obj2=new PartTimeEmployee();
            System.out.println("Enter id : ");
            obj2.id=input.nextInt();
            System.out.print("Enter name : ");
            obj2.name=input.next();
            System.out.print("Enter surname : ");
            obj2.surname=input.next();
            obj2.calculateSalary();
            obj2.displayDetails();
        }
        else {
            System.out.println("Invalid input....");
        }

    }
}
