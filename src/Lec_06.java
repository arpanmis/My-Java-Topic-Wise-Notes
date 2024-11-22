
//Q10. (Butterfly)

/*public class Lec_06 {
    public static void main(String[] args) {
      int n =5;
      //upper half
        for (int i = 1; i <=n ; i++) {
            //1st part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >=1 ; i--) {
            //1st part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}*/

//Q11.

/*public class Lec_06 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Q12. Number Pyramid

/*public class Lec_06 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}*/

//Q13. Palindromic Pattern (looks same from LHS and RHS)

/*public class Lec_06 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");    //2spaces
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}*/

//Q14. Diamond Pattern

public class Lec_06 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=(n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
