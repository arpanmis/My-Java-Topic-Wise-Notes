
/* Types of Operator = 1.Arithmetic
                           a. Binary - {+,-,*,/,%}  * Binary Operators performs on two operands
                           b. Unary  - {++,--}        while unary performs on one.

                           a++/a-- will first use value and then change. (Post-increment/decrement)
                           ++a/--a wil first change and then use value (Pre-increment/decrement)


                       2.Relational Operator
                            {==,!=,<,>,>=,<=}
                       3.Logical Operator
                            {&&,||,!}
                       4.Bitwise Operator {&,|,^,~,<<,>>}

                            Binary AND (&) --> 0101 & 0110 = 0100
                            Binary OR (|)  --> 0101 & 0110 = 0111
                            Binary XOR (^)  --> 0101 & 0110 = 0011 {Similar Value returns False(0) and vice-versa.
                            Binary ONE COMPLEMENT'S (~)  --> 0101 = 1010 {It gives binary value complement}

                            Binary Left Shift (<<)  --> 0101 = 1010 {It shift binary numbers to left by given Position
                                                                    space and we got 0 in end bcz empty spaces have 0 by
                                                                    default.}
                                                                    *Syntax = Number Operator Positions ( A<<Position)

                            Binary Right Shift >>)  --> 0101 = 0010 {It shift binary numbers to right by given Position
                                                                    space and we got 0 in end bcz empty spaces have 0 by
                                                                    default.}
                                                                    *Syntax = Number Operator Positions ( A>>Position)


                       5.Assignment Operators
                              *If value of B has to assigned to A, then written as A=B.




   #BINARY NUMBER SYSTEM

   Binary Number Systems (Base 2) - Usually Java store value in memory in Binary Number SYSTEM.
   This number system consist of two numbers 0 & 1.

   Like 4(Decimal Number Systems) can be written as 100 in BNS.
   If 100(BNS) has to convert into DNS, we have to multiply 2^2*1 + 2^1*0 + 2^0*0 = 4+0+0 = 4.
   Similarly, 8(DNS) INTO BNS = 1000.


    Also, there are other base system in BNS like...Octal Binary System(Baase 8)
                                                    Hexadecimal Binary System (Base 16)....#Java Memory Adress is stored
                                                                                            in HBS.



 */



public class Lec_14 {
    public static void main(String[] args) {
    int a = 10;
    int b = 43;
    boolean z = (!(a >b));                  //Logical Not Operator reverts the boolean value.
        System.out.println(z);

    }
}

