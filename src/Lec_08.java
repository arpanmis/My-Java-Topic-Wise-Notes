import java.util.Scanner;

public class Lec_08 {

    public static int printAverage(int num1,int num2,int num3){
        int average = (num1+num2+num3)/3;
        System.out.println(average);
        return average;
    }

    public static int sumOddNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit of number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            if (i%2 == 1) {
                sum += i;
            }

        }
        System.out.println(sum);
        return sumOddNumbers();
    }

    public static void greaterNumber(int a,int b){
        if (a>b) {
            System.out.println("a");
        }
        else {
            System.out.println("b");
        }

    }

    public static double circumference(double r){
        double ans = 2 * 3.14 * r;
        System.out.print(ans);
        return ans;
    }


    public static void ageCheck(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }
        return;
    }

    public static void doLoop(){
        int n =1;
        do {
            System.out.println(n);
        }
        while (n>=1);
        n++;
    }

    public static int getValue(int x, int n){
        int value = 1;
        for (int i = 1; i <=n ; i++) {
            value *= x;
        }
        System.out.print(value);
        return value;
    }

    public static int countNumbers(){
        int positive = 0;
        int negative = 0;
        int zero = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to run & 0 to stop: ");
        int num = input.nextInt();

        while (num ==1){
            System.out.println("Enter Number");
            num = input.nextInt();
            if (num <= 0) {
                negative++;
            } else if (num >= 0) {
                positive++;
            }
            else {
                zero++;
            }
            System.out.println("Positive +" + positive);
            System.out.println("Negative" + negative);
            System.out.println("Zeros" + zero);
        }
        return countNumbers();
    }


    public static void printFibonacci(int n){
        int t1 = 0;
        int t2 = 1;
        int nextTerm = 0;
        int i= 1;
        while (i <= n){
                nextTerm = t1+t2;
                t1 = t2;
                t2 = nextTerm;
            System.out.print(nextTerm+" ");
            i++;
        }
    }





    public static void main(String[] args) {
        //Q1.
       // printAverage(5, 4, 3);
        //Q2.
        //sumOddNumbers();
        //Q3.
       // greaterNumber(55,54);
        //Q4.
        circumference(2.0);
        //Q5.
        //ageCheck();
        //Q6.
        //doLoop();
        //Q7
        //countNumbers();
        //Q8.
       // getValue(2,5);
        //Q10.
       // printFibonacci(15);


    }
}
