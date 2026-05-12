import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class loop {

    public static void main(String[] args) {

        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good consistency!");
        }


        int score = 42;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        int accuracy = 178;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        }
        else if (accuracy >= 75) {
            System.out.println("Good");
        }
        else if (accuracy >= 60) {
            System.out.println("Average");
        }
        else {
            System.out.println("Needs Improvement");
        }


        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (!hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }

//        ODD CASE
        for(int num=1;num<=20;num++){
            if(num % 2 == 0) {
                continue;
            }
            System.out.println("odd between 1 to 20 are : " + num);
        }



        //even case

        for(int num=1;num<=20;num++) {
            if (num % 2 == 0)
                System.out.println("even between 1 to 20 are : " + num);
        }

//        square printing

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :" );
        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            for (int j=1;j<=num;j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
