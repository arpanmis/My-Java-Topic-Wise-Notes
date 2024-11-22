import java.util.Scanner;

//Conditional Statements (if, else, else-if)
/*public class Lec_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age <= 18) {
            System.out.println("Can not apply for DL");
        }
        else{
            System.out.println("Can apply for DL");
        }
    }
}*/

/*public class Lec_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age <= 18) {
            System.out.println("Under Age");
        } else if (age<=60) {                    //Usually else-if is helpful bcz if first condition is true then second or any condition will not be checked.                                                         //true then
            System.out.println("Working Age");
        }
        else {
            System.out.println("Over Aged");
        }
    }
}*/


//Switch Statements

public class Lec_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press Button");
        int button = input.nextInt();

        switch (button){
            case 1 : System.out.println("Hello");
                break;
            case 2: System.out.println("Namaskar");
                break;
            case 3: System.out.println("Pranam");
                break;
            default: System.out.println("Invalid Button");
        }

    }
}

