package OOPS.Inheritance;

public class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    Motorcycle(String name, String model, int nooftyres, String handleBarStyle, String suspensionType){
        super();
        this.name=name;
        this.model=model;
        this.nooftyres=nooftyres;
    }

    public void wheelie(){
        System.out.println("motorcycle is doing wheelie");
    }
}
