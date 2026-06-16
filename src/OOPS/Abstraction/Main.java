// Old method of abstraction using class
//-> Abstract Class

//package OOPS.Abstraction;
//
//
//abstract  class Bird {
//    abstract void fly();
//    abstract void eat();
//}
//
//class Sparrow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Sparrow is flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow  is eating");
//    }
//}
//
//class Crow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Crow is flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow  is eating");
//    }
//}
//
//public class Main {
//
//    public static void dobird(Bird b){
//        b.fly();
//        b.eat();
//    }
//
//
//    public static void main() {
//       dobird(new Sparrow());
//       dobird(new Crow());
//    }
//}

//new method of abstraction that is used now a days
// -> Using interface keyword

package OOPS.Abstraction;


interface Bird {
    void fly();
    void eat();
    // by default these methods are public so , it is advisable,
    //to write public during implementation

//    //This is allowed
    default void sleep(){
        System.out.println("Bird is sleeping");
    }
}

interface Walk{
    //here by default int is <-public static final->, we can write ....
    int legs = 4;
    void walking();
}

// Basically we interact with interface,
// we don't need to worry about how immplementation is written

//Implemenation ->

//we can inherit multiple classes using interface
class Sparrow implements Bird, Walk{

    @Override
    public void walking(){
        int a = Walk.legs;
        System.out.println("Number of legs -> "+a);
        System.out.println("sparrow is walking");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow  is eating");
    }
}

class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow  is eating");
    }
}

public class Main {

    public static void dobird (Bird b){
        b.fly();
        b.eat();
        b.sleep();      //default method do not need to implement
        if (b instanceof Walk r) {
            r.walking();
        }
    }


    public static void main() {
        dobird(new Sparrow());
        dobird(new Crow());

    }
}