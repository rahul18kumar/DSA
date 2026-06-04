package OOPS;

import java.sql.SQLOutput;

public class App {

    public static void main() {
        //Default constructor
//        Student A = new Student();
//        //Setting the value of
//        A.name="Rahul";
//        A.age=23;
//        A.id = 234556;
//        A.nos= 5;
//        System.out.println(A.name + " is "+ A.age +" years old and " + " having " + A.nos +" number of subject with id number"+A.id);
//
//        //Can also access the methods
//        A.sleep();
//        A.bunk();
//        A.study();

        //Parameterised constructor
        Student B = new Student(2,"Rahul",3,23);
        System.out.println(B.age+" "+ B.name);

        //copied constrcutor
        Student C= new Student(B);
        System.out.println(C.id);
        System.out.println(C.name);
        System.out.println(C.age);



    }
}
