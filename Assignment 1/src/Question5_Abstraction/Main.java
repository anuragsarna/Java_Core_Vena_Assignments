package Question5_Abstraction;

public class Main {
    public static  void  main(String[] args){
        Employee emp1 = new FulltimeEmployee("Anurag Sarna" , 24000);
        Employee emp2 = new Freelancer("Aman Singh" , 480 , 40);

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
    }
}
