package OOPS;

// Student is a class here
public class Student {

    //Attributes  -> state, properties of an  object.
    public int id;
    public String name;
    public int age;
    public int nos; //number of subjects

    //Default constructor or ctor
    public Student() {
        System.out.println("student Default constructor called");
    }

    //Parameterised constructor
    public Student(int id, String name,int nos, int age){
        System.out.println("here i am sending parameter and that is -> ");
        this.id=id;
        this.age=age;
        this.nos=nos;
        this.name= name;
    }

    //copied constructor
    Student(Student copy){
        System.out.println("This is copied constructor");
        this.id=copy.id;
        this.age=copy.age;
        this.nos=copy.nos;
        this.name= copy.name;
    }

    //Behaviour -> methods/function that objects can perform
    public void study() {
        System.out.println(name + "is studying");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void bunk() {
        System.out.println(name + " is bunking the class");
    }
}
