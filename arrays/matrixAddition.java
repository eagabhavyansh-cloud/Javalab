package arrays;

import java.util.Scanner;
public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] sum = new int[2][3];

        System.out.println("enter elements of array a :");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter elements of array b :");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                b[i][j] = sc.nextInt();
            }
        }

        // add a and b
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("sum of the two matrices :");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
