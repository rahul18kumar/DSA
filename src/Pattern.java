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


        //Inverted right angle triangle
//        int num = 8;
//        for (int i = 1; i <=num ; i++) {
//            for (int j = 1; j <= num-i+1 ; j++) {
//                System.out.print (" *");
//            }
//            System.out.println();
//        }
//
//        // For right angle triangle
//        int m = 5;
//        for (int i = 1; i <= m ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        //solid pyramid pattern with natural number growing
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

        //solid pyramid pattern with odd number growing

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

//        inverted pyramid
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

        //Hollow rectangular pattern
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

        //Hollow right-triangle

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

        //Hollow Pyramid
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

        //Two symmetrical pyramid vertically
        int $m = 5;
        for (int i = 1; i <= $m ; i++) {
            for (int j = 1; j <= $m-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int x=5;
        for (int i = 1; i <=x ; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*x-i-(i-1) ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
