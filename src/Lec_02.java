import java.util.Scanner;

public class Lec_02 {
    public static void main(String[] args) {
        //output
        System.out.print("Hello World");    //same line print
        System.out.println(" Hello World"); //new line print
        System.out.print("Hello World\nI'm Arpan Mishra!\n"); //  "\n" will create new line form there onwards
        System.out.println("Hello World\tHow are you?");  // "\t" it gives a tab to sentence

        //Variable

        int a = 25;
        int b = 10;
        int sum = a+b;
        System.out.println(sum);

        //Datatypes - Primitive(byte,int,short,char,long,float,double,boolean) & Non-Primitives(String,Class,Array,Object,Interface,etc)
        float calculate = (float) (a * b) /(a-b);
        System.out.println(calculate);

        //INPUT
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = in.nextInt();
        System.out.println("Done! We registered your Age");

        in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        //String name = in.next();   //will print only first word of sentence
        String name = in.nextLine(); //will print whole sentence
        System.out.println("Done! We registered your Name "+ name);

    }
}
