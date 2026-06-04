package OOPS.Encapsulation;

public class Encapsulation {
    public int id;
    private int age;
    private String name;

    //make a getter method for accessing name and that should be public
    public String getName(){
        return name;
    }


    //Make a getter getage
    public int getAge(){
        return age;
    }

//   now make a setter to age and also apply a condition.
        public boolean setAge(int age) {
            if(age >= 0 && age <= 100) {
                this.age = age;
                return true;
            }
            return false;
        }

    //constructor
    public Encapsulation(int id, String name,int age){
        System.out.println("starting with encapsulation");
        this.id=id;
        this.age=age;
        this.name=name;
    }
}
