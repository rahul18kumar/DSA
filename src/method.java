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
        return;

    }

    //non void type or having some return
    static int subtract(int x, int y){
        return x-y;
    }

    //method overriding
    static float avg(float a, float b, float c){
        float res=(a+b+c/3);
        return res;
    }

    static float avg(float a, float b, float c, float d){
        float res=(a+b+c+d/4);
        return res;
    }

//    Q1. Create a method to printwelcomemessege() to print a greeting
    static void printwelcomemessege(){
        System.out.println("Hello ! Welcome to coding world");
    }

//    Q2.create a method add a , b and c.
        static float addition(int a, int b, float c){
        float result = a+b+c;
        return result;

    }

    //Q3.create a method if iseven() it returns true
    static boolean iseven(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

//    Q4. Create a method getmaximum(int a, int b) that returns a larger number
    static int getmaximum(int a, int b){
    if (a>b){
        return a;
    }else{
        return b;
    }
    }

    //Q5.Create a method calculate percentage (obtained, total).
    static float calculatepercentage(float obtained, int total){
        float ans = (obtained / (float)total)*100 ;
        ans = (float)Math.round(ans * 100) / 100;   //for roundoff upto 2
        System.out.println("Percentage of student = "+ ans);
        return ans;
    }

    public static void main(){
        calculatepercentage(450.5f,720);
        int resgetmax = getmaximum(45,63);
        System.out.println("Maximum number => "+resgetmax);

        boolean res = iseven(45);
        System.out.println(res);
            printwelcomemessege();
//        System.out.println(" Rahul ");
//        tableof2 ();        // invoke of function
//        sum(6,9);   // invoke of sum and passing argument
//        multiply(65,2); // passing argument in another by invoking/calling
//        int resultsubtract = subtract(67,19);
//        System.out.println("subtract = "+ resultsubtract);
//        float first = avg(2,3,4);
//        float second = avg(4,5,2,3);
//        System.out.println("first avg = "+ first);
//        System.out.println("second average = "+ second);
    }
}
