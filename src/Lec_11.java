import java.util.Scanner;

public class Lec_11 {
    public static void main(String[] args) {
        //2D ARRAYS
           // type [][] arrayName = new type[rows][columns];  //Syntax

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row and  Columns");
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] numbers = new int[rows][columns];
        //INPUT
        for (int i = 0; i < rows ; i++) {          //rows
            for (int j = 0; j < columns; j++) {    //columns
             numbers[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter The Array Number");
        int x = input.nextInt();
        //OUTPUT
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("x found at locations ("+i+ ","+j+")");
                }

            }
        }

    }
}



