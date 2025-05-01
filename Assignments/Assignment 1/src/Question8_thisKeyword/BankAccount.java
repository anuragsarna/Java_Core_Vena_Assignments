package Question8_thisKeyword;

public class BankAccount {
    String name;
    double balance;
    String type;

    BankAccount(String name , double balance , String type){
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public void deposit(double balance){
        this.balance += balance;
        System.out.println("Deposited : $ " + balance);
    }

    public void withdraw(double balance){
        this.balance -= balance;
        System.out.println("Withdrawn : $ " + balance);
    }

    public void displayDetails() {
        System.out.println("----------------------------");
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Type : " + type);
    }
}
