package Week2Assigment1.Problem3;

public class PartTimeEmployee extends Employee{
    PartTimeEmployee(){
        salary=15000;
    }


    @Override
    int calculateSalary() {
        salary=30000;
        return salary;

    }
}
