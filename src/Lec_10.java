import java.util.Scanner;

/*public class Lec_10 {
    public static void main(String[] args) {
        //type[] arrayName = new type[size];    //syntax of array
        int[] marks = new int[3];                  //1st Method
         marks [0]  = 56;
         marks [1] = 65;
         marks [2] = 88;

        //System.out.println(marks);    //it prints actually value related to memory address.
        //System.out.println(marks[1]);

        for (int i = 0; i < 3 ; i++) {
            System.out.println(marks[i]);
        }

        //Defining an Array:
        int[] score = {1,2,3,4,5};    //2nd METHOD

        for (int j = 0; j < 5; j++) {
            System.out.println(score[j]);
        }

    }
}*/

//Memory Address of array are stored in hexadecimals(based 16)

//Array Ouput and Input:
/*public class Lec_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE SIZE :");
        int size = input.nextInt();

        int numbers[] = new int[size];

        //input

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        //output
        for (int i = 0; i <size ; i++) {
            System.out.print(numbers[i+" "]);
        }
    }
}*/


public class Lec_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        int[] numbers =   new int[size];

        for (int i = 0; i < size  ; i++) {
            numbers[i] = input.nextInt();
        }
        int x = input.nextInt();

        for (int i = 0; i < numbers.length ; i++) {      //number.length =The size or length count of an array in Java
                                                        // includes both null and non-null characters
            if (numbers [i] == x) {
                System.out.print("X found at: " +i);
            }

        }

    }
}


