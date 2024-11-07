// 14.Matrix Multiplication

// Write a Java program to multiply two given matrices.

import java.util.Scanner;
public class MatrixMultiplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //first matrix
    System.out.println("enter the no of rows and columns of the first matrix : ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();

    int[][] arr1 = new int[r1][c1]; 

    System.out.println("enter the element of matrix");
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
            arr1[i][j] = sc.nextInt();
        }
    }

    System.out.println("\nfirst matrix is :");
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        System.out.print(arr1[i][j] + " ");
      }
      System.out.print("\n");
  }

    //second matrix
    System.out.println("enter the no of rows and columns of the second matrix : ");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();

    int[][] arr2 = new int[r2][c2]; 

    System.out.println("enter the element of matrix");
    for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
            arr2[i][j] = sc.nextInt();
        }
    }

    System.out.println("\nsecond matrix is : ");
    for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.print("\n");
    }

    System.out.print("\n");
    if(c1 != r2){
      System.out.println("cannot multiply");
      return;
    }

    int[][] mul = new int[20][20];

    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        mul[i][j] = 0;
        for (int k = 0; k < r2 ; k++) {
            mul[i][j] += arr1[i][k]*arr2[k][j];
        }
        
      }
      
    }

    System.err.println("Multiplied matrix is : ");

    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
            System.out.print(mul[i][j] + "\t");
      }
      System.out.print("\n");
    }
  }
}

