package OOPS.Encapsulation;

public class main {

    public static void main() {

        Encapsulation e1 = new Encapsulation(3, "Rahul", 24);
        System.out.println(e1.getName());
        System.out.println("Before set "+ e1.getAge());
        int forset= 46;
        boolean result = e1.setAge(forset);
        if(result) {
            System.out.println("Age updated successfully as " + e1.getAge());
        } else {
            System.out.println(forset + " is an invalid age. You cannot set it." );
        }
    }
}