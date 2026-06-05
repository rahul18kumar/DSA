package OOPS.Inheritance;

public class Vehicle {

    public String name;
    public String model;
    public int nooftyres;

    Vehicle(){
//        this.name=" ";
//        this.model=" ";
//        this.nooftyres=" ";
    }

    //parameterised constructor
    Vehicle(String name, String moodel, int nooftyres){
        this.name=name;
        this.model=moodel;
        this.nooftyres=nooftyres;
    }

    public void startEngine(){
        System.out.println("engine is starting of "+ name);
    }
    public void stopEngine(){
        System.out.println("engine is stopping of "+ name);
    }
}
