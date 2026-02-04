package Week2Assigment1.Problem3;

import java.sql.SQLOutput;

public abstract class Employee {
    int id;
    String name;
    String surname;
    int salary;

    Employee(){

    }
    Employee(int i,String n,String s,int sal){
        this.id=i;
        this.name=n;
        this.surname=s;
        this.salary=sal;
    }
    abstract int calculateSalary();
    void displayDetails(){
        System.out.print(id);
        System.out.println();
        System.out.print(name);
        System.out.println();
        System.out.print(surname);
        System.out.println();
        System.out.print(salary);
    }
}
