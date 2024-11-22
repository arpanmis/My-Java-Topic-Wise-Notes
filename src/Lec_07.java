import java.util.Scanner;

public class Lec_07 {
    public static void printMyName(String name){
        System.out.println(name);                  //functions are stored in memory in form of stack
        return;
    }

    public static int printSum (int num1,int num2){
        int sum = num1+num2;
        System.out.println(sum);
        return sum;
    }


    public static void printMultiply(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number1: ");
        int Number1 = input.nextInt();
        System.out.print("Enter your Number2: ");
        int Number2 = input.nextInt();

        int multiply = Number1*Number2;
        System.out.print("Your Answer is: ");
        System.out.println(multiply);

    }

    public static void printFactorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        int factorial = 1;
        for (int i = n; i >=1 ; i--) {
                factorial *= i;
        }
        System.out.print(factorial);
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.next();
        printMyName(name);  //calling function

        printSum(1,2);

        printMultiply();


        printFactorial();


    }
}