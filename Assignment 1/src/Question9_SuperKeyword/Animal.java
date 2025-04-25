package Question9_SuperKeyword;

public class Animal {
    public void makeSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("--------------------");
        super.makeSound();
        System.out.println("Cat Meows");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("--------------------");
        super.makeSound();
        System.out.println("Dog barks");
    }
}



