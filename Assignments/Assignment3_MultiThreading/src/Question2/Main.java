package Question2;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account1 = new BankAccount(74712 , 40000);

        Runnable t1 = () -> {
            account1.deposit(3000 , "Amit");
            account1.withdraw(6000 , "Rohan");
        };

        Runnable t2 = () -> {
            account1.deposit(2500 , "Abhishek");
            account1.withdraw(6000 , "Sahil");
        };

        Runnable t3 = () -> {
            account1.deposit(1000 , "Akshay");
            account1.withdraw(6000 , "Anurag");
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Final Balance : " + account1.getBalance());
        System.out.println("---------------------------------------------");
        System.out.println("Statement : ");
        for (String log : account1.getTransactionLog()){
           System.out.println(log);
       }
    }

}
