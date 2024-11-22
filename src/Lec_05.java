
//Q1.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}*/

//Q2.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (j == 1||i==1|j==m||i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}*/

//Q3.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}*/

//Q4.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n= 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}*/

//Q5.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n-1 ; j >=i  ; j--) {
                System.out.print(" ");  //spaces
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"); //stars
            }
            System.out.println();
        }
    }
}*/

//Q6.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

//Q7.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

//Q8.

/*public class Lec_05 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}*/

//Q9.

public class Lec_05 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                int sum = i+j;
                if (sum%2==0) {
                    System.out.print("1"+ " " );
                }
                else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}