package OOPS.Polymorphism;

public class Main {
    public static void main() {
//        Calculator c= new Calculator();
//        System.out.println(c.add(3,6));
//        System.out.println(c.add(56,7,23));
//        System.out.println(c.add(3,234,32.45));

        //Runtime Polymorphism
        Shape s= new Shape();
        s.draw();

//        Circle c = new Circle();
//        c.draw();
        //or
        //upcasting
        Circle c = new Circle();
        dodrawingstuff(c);
        }

    //downcasting


        public static void  dodrawingstuff(Shape s){
        s.draw();   // polymorphic

            Circle c = (Circle)s;       //downcasting
            c.personal();
    }
}
