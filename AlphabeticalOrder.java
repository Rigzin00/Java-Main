// 21. Write a Java program to sort an array of strings in alphabetical order.


import java.util.Scanner;

public class AlphabeticalOrder {
  public static void main(String[] args) {
    String temp;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the length of the size of strind array");
    int n = sc.nextInt();

    String str[] = new String[n] ;

    for (int i = 0; i < n; i++) {
        str[i] = sc.next();
    }

    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (str[j].compareTo(str[j + 1]) > 0) {
            temp = str[j];
            str[j] = str[j+1];
            str[j+1] = temp;
        }
      }
    }
    

    for (int i = 0; i < n; i++) {
        System.out.println(str[i]);
    }

  }
}

