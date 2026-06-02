import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class StringBasics {

//    Q1. Print all the characters of string.
//    static void printstring(String str){
//        for (int i = 0; i <=str.length()-1 ; i++) {
//            char character = str.charAt(i);
//            System.out.println ( "character at index "+ i +" -> "+ character);
//        }
//    }

//      Q2.Count length of string without length().
//            static int Countlength(String str ){
//               char [] arr= str.toCharArray();
//               int length =arr.length;
//               return length;
//        }

//        Q3. Print vowels in a string.
//    static int Countvowel(String str){
//           int count=0;
//        for (int i = 0; i <=str.length()-1 ; i++) {
//            char ch = str.charAt(i);
//            if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u' ||ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch =='U'){
//                count = count+1;
//            }
//        }
//        return count;
//    }

//    Q4. Reverse a string. (with  very common approach)
//    static String reverse(String str){
//        String reverse ="";
//        int n = str.length();
//        for (int i = n-1; i >= 0 ; i--) {
//            char ch = str.charAt(i);
//            reverse=reverse+ch;
//        }
//        return reverse;
//    }
//
//    //Q5. Check string is palindrome or not . ("NOON"=="NOON")
//
//    static boolean ispalindrome(String str){
//        String originalString = str;
//        String reverseString = reverse(originalString);
//        for (int i = 0; i <=originalString.length()-1 ; i++) {
//            char ch1 = originalString.charAt(i);
//            char ch2 = reverseString.charAt(i);
//            if (ch1 != ch2){
//                return false;
//            }
//        }
//        return true;
//    }


    static void main() {

//        Practice
//        Q1. count the number of consonants
//        String str = "Hello World";
//        int count = 0;
//        for(int i = 0; i <= str.length()-1 ; i++) {
//            char ch = Character.toLowerCase(str.charAt(i));
//
//            if(ch >= 'a' && ch <= 'z') {
//                if(ch != 'a' && ch != 'e' &&
//                        ch != 'i' && ch != 'o' &&
//                        ch != 'u') {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("Consonants = " + count);

//        Q2.Convert String to Uppercase Without Using Method.
//            String str1 = "hello";
//            String result = " ";
//            for(int i = 0; i <= str1.length()-1; i++) {
//                char ch = str1.charAt(i);
//                if(ch >= 'a' && ch <= 'z') {
//                    ch = (char)(ch - 32);      // because ascii value of A=65 and a=97
//                }
//                result = result+ ch;
//            }
//            System.out.println(result);

        //Q3. Find Frequency of a Character.
//        String str = "programming";
//        char target = 'm';
//        int count = 0;
//        for(int i = 0; i <= str.length()-1; i++) {
//            if(str.charAt(i) == target) {
//                count++;
//            }
//        }
//        System.out.println("Frequency = " + count);

        //Q4.Remove All Spaces from String.
//        String str = "Java Is Easy";
//        String result = "";
//        for(int i = 0; i <= str.length()-1; i++) {
//            char ch = str.charAt(i);
//            if(ch != ' ') {
//                result += ch;
//            }
//        }
//        System.out.println(result);

//        Q5. Check if String Contains Only Digits.
        String str = "1234H5";
        boolean isDigit = true;
        for(int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                isDigit = false;
                break;      //need to put here for optimisation
            }
        }
        if(isDigit)
            System.out.println("Only digits");
        else
            System.out.println("Contains other characters");















//        System.out.println(ispalindrome("MooM"));

//        System.out.println(reverse("RAHUL"));

//        System.out.println(Countvowel("Rahul Kumar"));

//        System.out.println(Countlength("RahulKumar"));
//     Q1.   String newone = "Rahul";
//        printstring(newone);








//        String some ="Rahul Kumar";
//        String newsome = some.replace('a','l');
//        System.out.println(newsome);

//        String name = "My name is rahul";   //Delimeter is space here
//        String [] words = name.split(" ");
////        print via for each loop
//        for (String str: words){
//            System.out.println(str);
//        }

//
//        String name = "RahuL";
//        char [] crr = name.toCharArray();
//
//     //   for each character value we are using for each loop here
//        for (char out:crr){
//            System.out.println(out);
//        }

//        String name = "my name is rahul";
//        System.out.println(name.startsWith("my "));
//        System.out.println(name.endsWith("hul"));

//        int num = 5123;
//
//        String str = String.valueOf(num);
//
//        System.out.println(num + 1);
//
//        System.out.println(str + 1);


//String str = "My Name is Rahul Kumar";

//0 -> M
//1 -> y
//2 -> space and so on

    //beginIndex -> 3 -> inclusive
    //endIndex -> 6 -> exclusive

    //System.out.println(str.substring(3, 7));

    //System.out.println(str.contains("Lover"));

        //Empty-> it means length is 0
        //blank -> it means empty or some blank spaces.
        //empty -> length = 0
        //blank -> empty or just spaces in string

//        String str = "";
//
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String name = "   Love   ";
//        System.out.println(name.length());
//        name = name.trim();
//        System.out.println(name.length());
//        String name1 = "Love";
//        System.out.println(name1.toUpperCase());
//        String str1 = "LOVE";
//        System.out.println(name1.toLowerCase());

        //String common methods
//        String str = "Rahul";
//        System.out.println(str.length());
//        System.out.println(str.charAt(1));
//        String str1 = "RAhul";
//        System.out.println(str.equals(str1));   //false
//        System.out.println(str.equalsIgnoreCase(str1));     //true

//        Scanner sc = new Scanner(System.in);
////        System.out.println("Provide the string");
////        String str= sc.next();  //single word
////        System.out.println("Entered string "+ str);
////        System.out.println("Enter second times");
//        System.out.println("Enter string");
//        String str1 = sc.nextLine();
//        System.out.println("Value 2 " + str1);
//        String str ="Rahul";
//        //or
//        String str1 = new String("Kumar");
//
//        System.out.println(str +" "+ str1);
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
    }
}
