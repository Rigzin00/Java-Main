// 28. Recursion
// Write a JAVA program to find fibonacci series up-to a number using recursion.

import java.util.Scanner;

public class RecursionFibonacci {
  static int fibonacci(int n){
    if (n <= 1) {
        return n;
    }else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to generate Fibonacci series up to: ");
    int n = sc.nextInt();
    for(int i = 0; ;i++){
      int fib = fibonacci(i);
      if(fib > n){
        break;
      }
      System.out.print(fib +" ");
    }
  }
}
