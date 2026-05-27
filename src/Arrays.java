import jdk.jshell.DeclarationSnippet;

import java.util.Scanner;
public class Arrays {

    public static void main(){


        //Start with the 2-D Array
//
////        Declaration
//        int arr[][];
////        Allocation
//        arr = new int[3][3];
////        Initialisation
//        int brr[][] = {{1,2,3,4},
//                        {5,6,7,8,},
//                        {9,10,11,12}
//                        };
//        for (int row = 0; row <=brr.length-1 ; row++) {
//            for (int col = 0; col <=brr[row].length-1 ; col++) {
//                System.out.print(brr[row][col]+" ");
//            }
//            System.out.println(" ");
//        }

//        //Input in 2d Array
//        int [][] arr = new int[3][3];
//        Scanner input = new Scanner(System.in);
//        for (int row = 0; row <=arr.length-1 ; row++) {
//            for (int col = 0; col <=arr[row].length-1 ; col++) {
//                System.out.println("Enter the value at "+ row +" "+ col);
//                arr[row][col]= input.nextInt();
//
//            }
//            System.out.println(" ");
//        }
//
//        //Output
//        System.out.println("Full Array are : ");
//        for (int i = 0; i <=arr.length-1 ; i++) {
//            for (int j = 0; j <=arr[i].length-1 ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

        //Q1. Print sum of all elements in the ad array
//        int arr[][]={{1,2,3},{4,5,6},{8,9,10}};
//        int sum =0;
//        for (int i = 0; i <=arr.length-1 ; i++) {
//            for (int j = 0; j <=arr[i].length-1 ; j++) {
//                sum=sum+arr[i][j];
//            }
//        }
//        System.out.println("Final sum of array elements "+ sum);

//        Q2.Find Max element in array.
//        int arr[][]={{2,45,54},{43,278,65}};
//        int maxvalue = arr[0][0];
//        for (int i = 0; i <= arr.length-1 ; i++) {
//            for (int j = 0; j <=arr[i].length-1 ; j++) {
//                if(arr[i][j]>maxvalue){
//                    maxvalue=arr[i][j];
//                }
//            }
//        }
//        System.out.println("Maximum value in this array is"+ maxvalue);



        //1D Array
//        Q1. Sum all the elements of an array provided.
//        int summ []={1,2,2,4,9};
//        int p = summ.length;
//        int sum = 0;
//        for (int i = 0; i <=p-1 ; i++) {
//            sum = sum+summ[i];
//        }
//        System.out.println("Final Sum of total array = "+ sum);

//        Q2. Multiply all the elements of an array provided.
//        int multiplyall[] =  {2,3,4,5,6,7};
//        int multiply =1;
//        for (int i = 0; i <= multiplyall.length-1 ; i++) {
//            multiply = multiply * multiplyall[i];
//        }
//        System.out.println("Multiplication of array -> "+ multiply );
//
//        Q3. To find the maximum value in array.
//        int arr[]={9,5,27,3,53,5,42};
//        int max=arr[0];
//        for (int i = 1; i <arr.length-1 ; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Maximum value is "+ max);

//        Q4. Find the nminimum value in array.
//        int arr[]={23,-4,-18,2,675};
//        int min = arr[0];
//        for (int i = 1; i <= arr.length-1 ; i++) {
//            if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("Minium value is "+ min);

        //Taking Input in array and print
//        int arr1[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr1.length;
////        input
//        for (int i = 0; i <=n-1 ; i++) {
//            System.out.println("Enter the element at index  "+ i);
//            arr1[i]=sc.nextInt();
//        }
//
////        output
//        System.out.println("Array Contains : ");
//        for (int val:arr1){
//            System.out.println(val);
//        }





//        // Declaration ->  name only
//        int arr[];
//        //Allocation -> memory only
//        arr = new int[4];
//        //Initialisation -> values inserted
//        int num[]={3,2,4,24,2,4,6};
//        //Accessing Array
  //      System.out.println("4th index of array value is "+ num[4]);

//        //same from  for loop
//        int m = num.length;
//        System.out.println(n);
//        for (int index = 0; index <= m-1 ; index++) {
//            System.out.println("Array Value = "+ num[index]);
//        }
//       from for each loop
//        for each integer value inside num array, takes and stores in variable
//        for (int variable:num){
//            System.out.println(variable);
//        }
    }
}
