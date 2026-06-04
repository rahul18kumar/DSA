package OOPS.Inheritance;

public class Vehicle {

    public int name;
    public int model;
    public int nooftyres;

    public Vehicle(int name, int moodel, int nooftyres){
        this.name=name;
        this.model=moodel;
        this.nooftyres=nooftyres;
    }

    public void startEngine(){
        System.out.println("engine is starting");
    }
    public void stopEngine(){
        System.out.println("engine is stopping");
    }
}
