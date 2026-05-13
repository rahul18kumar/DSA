import java.sql.SQLOutput;

public class Pattern {
    static void main() {

//        int n = 5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j=1; j<=(n-i); j++){
//                System.out.print( " ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }


//Q1       Inverted right angle triangle
//        int num = 8;
//        for (int i = 1; i <=num ; i++) {
//            for (int j = 1; j <= num-i+1 ; j++) {
//                System.out.print (" *");
//            }
//            System.out.println();
//        }
//
// Q2.       // For right angle triangle
//        int m = 5;
//        for (int i = 1; i <= m ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        //Q3.  solid pyramid pattern with natural number growing
//        int $n = 4;
//        for (int i = 1; i <= $n ; i++) {
//            for (int j = 1; j <= $n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        //Q4.   solid pyramid pattern with odd number growing

//        int $m = 5;
//        for (int i = 1; i <= $m ; i++) {
//            for (int j = 1; j <= $m-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Q5.   inverted pyramid
//        int x=5;
//        for (int i = 1; i <=x ; i++) {
//            for (int j = 1; j <= i-1 ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*x-i-(i-1) ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Q6.   Hollow rectangular pattern
//        int var = 4;
//        for (int i = 1; i <= var; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if (i == 1 || i == var) {
//                    System.out.print("* ");
//                } else {
//                    if (j == 1 || j == 6) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println("");
//        }

        //Q7.   Hollow right-triangle

//        int r = 5;
//        for (int i = 1; i <= r; i++) {
//            if (i == 1 || i == 2 || i == r) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                 middle  case
//                for (int k = 1; k <= i - 2; k++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Q8.   Hollow Pyramid
//        int n= 5;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <= n-row ; col++) {
//                System.out.print("  ");
//            }
//            if (row == 1 || row == n) {
//                for (int i = 1; i <= (2*row-1) ; i++) {
//                    System.out.print("* ");
//                }
//            }
//            else{
//                //middle case
//                System.out.print("* ");
//
//                for(int k = 1; k <= (2*row-3); k++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Q9.   Two symmetrical pyramid vertically
//        int $m = 5;
//        for (int i = 1; i <= $m ; i++) {
//            for (int j = 1; j <= $m-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int x=5;
//        for (int i = 1; i <=x ; i++) {
//            if (i == 1) {
//                continue;
//            }
//            for (int j = 1; j <= i-1 ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*x-i-(i-1) ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Q10.    Hollow pyramid and it's inversion vertically
//        int n= 4;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <= n-row ; col++) {
//                System.out.print("  ");
//            }
//            if (row == 1) {
//                for (int i = 1; i <= (2*row-1) ; i++) {
//                    System.out.print("* ");
//                }
//            }
//            else{
//                //middle case
//                System.out.print("* ");
//
//                for(int k = 1; k <= (2*row-3); k++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for inverted
//        for (int row = 1; row <=(n-1) ; row++) {
//            for (int col = 1; col <= row ; col++) {
//                System.out.print("  ");
//            }
//            if (row == (n-1)) {
//                System.out.print("* ");
//            }
//            else {
//                System.out.print("* ");
//                for (int col = 1; col <= 2*(n-row)-3 ; col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Q11.   Butterfly Pattern

        int n=4;
        for (int row = 1; row <=n ; row++) {
//            part 1
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
//            part 2
            for (int col = 1; col <=2*(n-row) ; col++) {
                System.out.print("  ");
            }
//            part 3
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        part 4
        for (int row = 1; row <=n ; row ++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }

//            part 5
            for (int col = 1; col <= 2*(row-1) ; col++) {
                System.out.print("  ");
            }
//            part 6
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   }
}
