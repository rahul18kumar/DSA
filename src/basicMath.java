public class basicMath {

    //Q1. check weather number is prime or not.
    static boolean isprime(int n){
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    //Q2. print all the prime numbers between 1 to n.
    static  void printallprime(int n){
        for (int num = 2; num <=n ; num++) {
            boolean isprime = isprime(num);
            if (isprime == true){
                System.out.println(num);
            }
        }
    }

    static void main() {
       printallprime(20);
//        System.out.println(isprime(9));
    }

}
