package Question5_Abstraction;

class Freelancer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Freelancer(String name , double hourlyRate , int hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    String getDetails(){
        return "Freelancer : " + name + " , Salary : " + calculateSalary();
    }
}
