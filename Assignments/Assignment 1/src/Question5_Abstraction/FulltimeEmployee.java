package Question5_Abstraction;

class FulltimeEmployee extends Employee{
    double monthlySalary;

    FulltimeEmployee(String name , double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary(){
        return monthlySalary;
    }

    String getDetails(){
        return "Full time employee : " + name + " , Salary : $ " + calculateSalary();
    }
}
