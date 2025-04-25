package Question4_Polymorphism;

class Shape {
    public void draw(){
        System.out.println("Drawing a shape");
    }

static class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
  }

static class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

static class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

}
