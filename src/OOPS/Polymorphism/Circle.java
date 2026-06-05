package OOPS.Polymorphism;

public class Circle extends Shape {

    @Override
    public void draw(){
        System.out.println("Circle is getting drawn");
    }

    public void personal(){
        System.out.println("personal method of circle");
    }
}
