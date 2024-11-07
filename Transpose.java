// 13. Transpose of a matrix

// Write a JAVA program to display transpose of a given matrix. 

import java.util.Scanner;
public class Transpose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no of rows and columns of the matrix : ");
    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] arr = new int[r][c]; 

    System.out.println("enter the element of matrix");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("Entered matrix is : \n");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println("\n");
    }
    System.out.print("\n");


    System.out.println("transpose matrix is : \n");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(arr[j][i] + "\t");
        }
        System.out.println("\n");
    }
    System.out.print("\n");
  }
}
