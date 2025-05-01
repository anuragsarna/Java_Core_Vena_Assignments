package Question4_Polymorphism;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = {
                new Shape.Circle(),
                new Shape.Triangle(),
                new Shape.Square()
        };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
