package Question8_thisKeyword;

public class Main {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Akshat Pal" , 65000 , "Current");
        BankAccount b2 = new BankAccount("Anirudh Tiwari" , 9800 , "Savings");

        b1.deposit(4000);
        b2.withdraw(3000);

        b1.displayDetails();
        b2.displayDetails();
    }
}
