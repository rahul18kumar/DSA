package OOPS.Inheritance;

public class Car extends Vehicle{

    public int noofdoor;
    public String transmissionType;

    Car(String name, String moodel, int nooftyres, int noofdoor, String transmissionType){
        super();
        this.name=name;
        this.model=moodel;
        this.nooftyres=nooftyres;
        this.noofdoor=noofdoor;
        this.transmissionType=transmissionType;
//        super.startEngine();  //also we can call parent function like this.
    }

    public void startAc(){
        System.out.println("AC is starting of "+ name+ " "+ model);
    }
}
