package Salary_Calculation_Module;

class Manager extends Employee {

    private int teamSize;

    public Manager(String name, double baseSalary, int attendanceDays,int performanceRating, int teamSize) {
        super(name, baseSalary, attendanceDays, performanceRating);
        this.teamSize = teamSize;
    }

    @Override
    double calculateGrossSalary() {
        return baseSalary + (teamSize * 1000);
    }
}

