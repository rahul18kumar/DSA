package OOPS.Inheritance;

public class Main {
    public static void main() {
        Car c = new Car("Maruti", "800",4,5,"Manual");
        c.startEngine();
        c.startAc();
        c.stopEngine();


        Motorcycle m = new Motorcycle("Hero", "Splendar", 2, "normal", "Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
