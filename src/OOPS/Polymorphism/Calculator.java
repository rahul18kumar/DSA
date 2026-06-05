package OOPS.Polymorphism;

public class Calculator {
    int add(int a,int b) {
        return a + b;
    }

    //parameter count differ -> 1st overloading
    int add(int a, int b, int c){
        return a+b+c;
    }

    //parameter type differ -> 2nd overloading
    double add(int a, int b ,double c){
        return a+b+c;
    }
}

