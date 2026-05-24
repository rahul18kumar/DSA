public class method {

    //Table of 2  method declaration
    static void tableof2(){
        int n = 10;
        for (int i = 1; i <=n ; i++) {
            System.out.println("2 * "+ i+ " = "+ 2* i);
        }
    }

    //sum of two numbers
    static void sum(int x, int y){      // settted parameter x and y here
        System.out.println ("sum ="+ (x+y));
    }

    //multiply of two
    static void multiply(int x, int y){
        System.out.println("multiply = "+ (x*y));
    }

    public static void main(){
        System.out.println(" Rahul ");
        tableof2 ();        // invoke of function
        sum(6,9);   // invoke of sum and passing argument
        multiply(65,2); // passing argument in another by invoking/calling

    }
}
