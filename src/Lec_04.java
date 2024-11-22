
//For Loops

/*public class Lec_04 {
    public static void main(String[] args) {
        int n = 10;
//        for (int i = 1; i <= n ; i++) {           //(i++ can be written as i = i+1 or i += 1)
//            System.out.println("Hello World");

          for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
    }
}*/


//While Loops

/*public class Lec_04 {
    public static void main(String[] args) {
        int i = 1;                   //initialisation
        while (i<=10){               //condition
            System.out.println(i);    //statement
            i++;                     //increment(it checks also)
        }

    }
}*/


//do while loops

/*public class Lec_04 {
    public static void main(String[] args) {
    int i = 1;
    do {
        System.out.println(i);  //difference b/w do-while & while loop is that at least one value will be printed in do-while loop
        i++;
    }
    while (i<=10);

    }
}*/



// Q1. Print sum of first n natural numbers.
/*public class Lec_04 {
    public static void main(String[] args) {
        int n =  10;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}*/

//Print the table of a number input by user.

import java.util.Scanner;

public class Lec_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int i =1;
        while (i<=10){
            int table = num*i;
            System.out.println(num+"*"+i+" = "+ table);
            i++;
        }
    }
}
