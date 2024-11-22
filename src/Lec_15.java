
/* n computer programming, the process of modifying and utilizing binary representations of numbers or
   any other data is known as bit-masking.

     Four major operations:
     1. Get Bit:
        a. Create Bitmask (1<<i)
        b. Operation -->AND

     2. Set Bit:
        a. Create Bitmask (1<<i)
        b. Operation -->OR

     3. Update Bit:
        (i) Case 1: Updating to 1
         a.Bit Mask (1<<i)
         b.Operation --> OR
       (ii) Case 2: Updating to 0
         a. Bit Mask (1<<i)
         b. Operation --> AND with NOT

     4. Clear Bit:
        a. Create Bitmask (1<<i)
        b. Operation --> AND with NOT { first complement Bit Mask and then perform AND operation.

 */


//GetBit Operation
/*
//Q1.Get the 3rd bit(position = 2) of a number n. (n = 0101)

public class Lec_15 {
    public static void main(String[] args) {
        // Positions are calculated from RHS to LHS. {0 1 01}  #separate 1 has to be identified.

            int num = 5; // binary number = 0101
            int position = 2; //position is represented as i
            int bitMask =1<<position; //here by this process bit mask is created

        if ((bitMask & num)==0) {
            System.out.println("bit was zero");
        }
        else {
            System.out.println("bit was one");
        }

    }
}*/

//Set Bit Operation
/*
//Q2. Set the 2nd bit(position = 1) of a number n. (n = 0101)

public class Lec_15 {
    public static void main(String[] args) {
        int num = 5;
        int position = 1;
        int bitMask = 1<<position; //(Bit Mask =0111)

        int newNum = bitMask | num;
        System.out.println(newNum);
    }
}*/

//Clear Bit Operation
/*
//Q3. Clear the 3rd Bit(position = 2) of an number n. (n = 0101)

public class Lec_15 {
    public static void main(String[] args) {
        int n =5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask); //complemented bitmask here
        System.out.println(notBitMask & n);
    }
}*/

//Update Bit Operation

//Q4. Update the 2nd bit(pos =1) of an number n to 1. (n= 0101)

import java.util.Scanner;

public class Lec_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the BN to be updated: ");
        int operation = input.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;


        if (operation == 1) {
            System.out.println(n | bitMask);
        } else {
            int newBitMask = ~(bitMask);
            System.out.println(newBitMask & n);

        }


    }
}







